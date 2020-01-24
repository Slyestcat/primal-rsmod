package gg.rsmod.plugins.content.areas.fightcaves

import gg.rsmod.game.model.instance.InstancedChunkSet
import gg.rsmod.game.model.instance.InstancedMapAttribute
import gg.rsmod.game.model.instance.InstancedMapConfiguration
import gg.rsmod.plugins.content.combat.getCombatTarget

/**
 * FightCaves Plugin
 *
 * fightcaves.plugin.kts
 * @author: Movee
 */

suspend fun entranceDialogue(it: QueueTask) {
    it.chatNpc(message = "You're on your own now JalYt, prepare to fight for your life!", npc = Npcs.TZHAARMEJJAL)
}

suspend fun jadDialogue(it: QueueTask) {
    it.chatNpc(message = "Look out, here comes TzTok-Jad!", npc = Npcs.TZHAARMEJJAL)
}

suspend fun failedDialogue(it: QueueTask) {
    it.chatNpc(message = "Well, I suppose you tried! Better luck next time.", npc = Npcs.TZHAARMEJJAL)
}

suspend fun deathDialogue(it: QueueTask) {
    if (it.player.attr.get(FIGHTCAVES_WAVE)!! > 14) {
        it.chatNpc(message = "Well done in the cave, here take TokKul as reward.", npc = Npcs.TZHAARMEJJAL)
    } else {
        it.chatNpc(message = "Well, I suppose you tried! Better luck next time.", npc = Npcs.TZHAARMEJJAL)
    }
}

suspend fun endDialogue(it: QueueTask) {
    it.chatNpc(message = "You even defeated TzTok-Jad, I am most impressed! Pleace accept this gift. Give cape back to me if you not want it.", npc = Npcs.TZHAARMEJJAL)
}

suspend fun loadWave(it: QueueTask) {
    it.wait(3)
    val player = it.player
    generateFightCaves(player)

    val xDiff = player.attr.get(FIGHTCAVES_BOTTOMLEFT_X)
    val zDiff = player.attr.get(FIGHTCAVES_BOTTOMLEFT_Z)

    val instancedMap = world.instanceAllocator.getMap(player.tile)

    if (instancedMap != null) {
        val newBottomLeft = instancedMap.area.bottomLeft

        val X = newBottomLeft.x + xDiff!!
        val Z = newBottomLeft.z + zDiff!!

        val instanceTile = Tile(X, Z)

        player.moveTo(instanceTile)
    }

    it.wait(2)

    announceWave(player)
    spawnWaveNpcs(player)
}

fun generateFightCaves(player: Player) {
    val startTile = Tile(2360, 5050)
    val endTile = Tile(2438, 5126)

    val instance = generateInstance(startTile, endTile)
    val instanceConfig = InstancedMapConfiguration.Builder()

    instanceConfig.setExitTile(Tile(2438, 5168, 0))
    instanceConfig.setOwner(player.uid)
    instanceConfig.addAttribute(InstancedMapAttribute.DEALLOCATE_ON_LOGOUT)
    instanceConfig.addAttribute(InstancedMapAttribute.DEALLOCATE_ON_DEATH)

    world.instanceAllocator.allocate(world, instance, instanceConfig.build())?.let { map ->
        val bottomLeft = map.area.bottomLeft

        val target = Tile(2410, 5111)

        val entry = Tile(x = (bottomLeft.x + (target.x - startTile.x)), z = (bottomLeft.z + (target.z - startTile.z)))

        player.moveTo(entry)
    }

    player.timers[SAVE_COORDINATES_TIMER] = 1
}

suspend fun removeFightCaves(it: QueueTask) {
    it.wait(1)
    val player = it.player

    completeFightCaves(player)
}

fun updateWave(player: Player) {
    val instanceWave = player.attr.get(FIGHTCAVES_WAVE)
    val currentWaveNpcs = player.attr.get(FIGHTCAVES_NPC_ARRAYLIST)
    val startedFightCaves = player.attr.get(STARTED_FIGHTCAVES)

    if (startedFightCaves != null) {
        if (instanceWave == 0 && !startedFightCaves) {
            spawnWaveNpcs(player)
            announceWave(player)
            player.attr.put(STARTED_FIGHTCAVES, true)
        } else {
            if (currentWaveNpcs != null) {
                if (currentWaveNpcs.size == 0) {
                    if (instanceWave != null) {
                        player.attr.put(FIGHTCAVES_WAVE, instanceWave + 1)

                        spawnWaveNpcs(player)
                        announceWave(player)
                    }
                }
            }
        }
    }
}

fun generateInstance(startTile: Tile, endTile: Tile): InstancedChunkSet {
    val numChunksX = (endTile.x - startTile.x) / 8
    val numChunksZ = (endTile.z - startTile.z) / 8

    val instanceChunkSet = InstancedChunkSet.Builder()

    for (z in (0..(numChunksZ - 1))) {
        for (x in (0..(numChunksX - 1))) {
            instanceChunkSet.set(chunkX = (x), chunkZ = (z), height = 0, rot = 0, copy = Tile(x = (startTile.x + (x * 8)), z = (startTile.z + (z * 8)), height = 0))
        }
    }

    return instanceChunkSet.build()
}

fun announceWave(player: Player) {
    val instanceWave = player.attr.get(FIGHTCAVES_WAVE)

    val actualWave = instanceWave?.plus(1)
    player.message("<col=f7390f>Wave: $actualWave</col>")

    if (actualWave == 63) {
        player.message("<col=f7390f>Final Challenge!</col>")
        player.queue { jadDialogue(this) }
    }
}

fun spawnWaveNpcs(player: Player) {
    val instanceWave = player.attr.get(FIGHTCAVES_WAVE)

    if (instanceWave != null) {
        if (instanceWave >= waveNpcs.size) {
            player.attr.put(FIGHTCAVES_WAVE, 0)
            return
        }

        if (instanceWave < 0) {
            return
        }

        val totalNpcs = waveNpcs[instanceWave].size

        for (i in 0 until totalNpcs) {
            var spawnIndex = player.attr.get(FIGHTCAVES_NPC_SPAWNINDEX)

            if (spawnIndex != null) {
                if (spawnIndex >= 15 || spawnIndex + 1 >= 15) {
                    player.attr.put(FIGHTCAVES_NPC_SPAWNINDEX, 0)
                    spawnIndex = 0
                }

                var X = spawnCoordinates[spawnIndex][0]
                var Y = spawnCoordinates[spawnIndex][1]

                // Spawning new NPCs at the previous tile of the recolored NPC
                if (instanceWave == 14 || instanceWave == 30 || instanceWave == 60) {
                    X = spawnCoordinates[spawnIndex - 1][0]
                    Y = spawnCoordinates[spawnIndex - 1][1]
                }

                val npcId = waveNpcs[instanceWave][i]

                val instanceSpawnTile = convertToInstanceTiles(player, X, Y)

                val npc = Npc(npcId, instanceSpawnTile, world)

                world.spawn(npc)

                npc.walkTo(player.tile)
                player.attr.put(FIGHTCAVES_NPC_SPAWNINDEX, spawnIndex + 1)

                val currentWaveNpcs = player.attr.get(FIGHTCAVES_NPC_ARRAYLIST)

                if (currentWaveNpcs != null) {
                    if (npcId == Npcs.TZKEK_3119) {
                        currentWaveNpcs.add(Npcs.TZKEK_3120)
                        currentWaveNpcs.add(Npcs.TZKEK_3120)
                    }

                    currentWaveNpcs.add(npcId)

                    player.attr.put(FIGHTCAVES_NPC_ARRAYLIST, currentWaveNpcs)
                }
            }
        }
    }
}

fun completeFightCaves(player: Player) {
    val instancedMap = world.instanceAllocator.getMap(player.tile)

    if (instancedMap != null) {
        awardTokkul(player)
        player.attr.put(IN_FIGHTCAVES, false)
        player.attr.put(STARTED_FIGHTCAVES, false)
        player.attr.put(FIGHTCAVES_WAVE, 0)

        player.timers.remove(SAVE_COORDINATES_TIMER)

        val currentWaveNpcs = arrayListOf<Int>()
        player.attr.put(FIGHTCAVES_NPC_ARRAYLIST, currentWaveNpcs)
        world.instanceAllocator.deallocate(world, instancedMap)

        if (player.inventory.hasSpace) {
            player.inventory.add(Items.FIRE_CAPE, 1)
        } else {
            world.spawn(GroundItem(item = Items.FIRE_CAPE, tile = player.tile, amount = 1, owner = player))
        }

        val PROBABILITY_FOR_PET = 200

        if (world.chance(1, PROBABILITY_FOR_PET)) {
            // GIVE PET
        }

        player.queue { endDialogue(this) }
    }
}

fun awardTokkul(player: Player) {
    var instanceWave = player.attr.get(FIGHTCAVES_WAVE)

    if (instanceWave != null) {
        if (instanceWave > 14) {
            val tokkulPerWave = 254.98
            val totalEarnedTokkul = (tokkulPerWave * instanceWave).toInt()

            if (player.inventory.hasSpace) {
                player.inventory.add(Items.TOKKUL, totalEarnedTokkul)
            } else {
                world.spawn(GroundItem(item = Items.TOKKUL, tile = player.tile, amount = totalEarnedTokkul, owner = player))
            }
        }
    }
}

fun convertToInstanceTiles(player: Player, X: Int, Y: Int): Tile {
    val instancedMap = world.instanceAllocator.getMap(player.tile)
    val startTile = Tile(2360, 5050)
    val targetTile = Tile(X, Y)
    val bottomLeft = instancedMap!!.area.bottomLeft

    return Tile(x = (bottomLeft.x + (targetTile.x - startTile.x)), z = (bottomLeft.z + (targetTile.z - startTile.z)))
}


on_player_death {
    awardTokkul(player)
    player.attr.put(IN_FIGHTCAVES, false)
    player.attr.put(STARTED_FIGHTCAVES, false)
    player.attr.put(FIGHTCAVES_WAVE, -1)
    player.timers.remove(SAVE_COORDINATES_TIMER)

    val currentWaveNpcs = arrayListOf<Int>()
    player.attr.put(FIGHTCAVES_NPC_ARRAYLIST, currentWaveNpcs)

    player.queue { deathDialogue(this) }
}

on_login {
    if (player.attr.get(IN_FIGHTCAVES) == true) {
        player.queue { loadWave(this) }
    }
}

on_logout {
    val currentWaveNpcs = arrayListOf<Int>()
    player.attr.put(FIGHTCAVES_NPC_ARRAYLIST, currentWaveNpcs)
    player.timers.remove(SAVE_COORDINATES_TIMER)
}

arrayOf(TZ_KIH, TZ_KEK, TZ_KEK_2, TOK_XIL, TOK_XIL_SPAWN, YT_MEJKOT, YT_MEJKOT_SPAWN, KET_ZEK, KET_ZEK_SPAWN, TZTOK_JAD).forEach { waveNpc ->
    on_npc_death(waveNpc) {
        val c = npc.getCombatTarget() as Player

        val currentWaveNpcs = c.attr.get(FIGHTCAVES_NPC_ARRAYLIST)

        if (currentWaveNpcs != null) {
            if (currentWaveNpcs.contains(waveNpc)) {
                when (waveNpc) {
                    3119 -> {
                        val tzKek = Npc(Npcs.TZKEK_3120, npc.tile, world)
                        val tzKek2 = Npc(Npcs.TZKEK_3120, npc.tile, world)

                        currentWaveNpcs.remove(waveNpc)
                        c.attr.put(FIGHTCAVES_NPC_ARRAYLIST, currentWaveNpcs)

                        // Spawning 2x TZKEK
                        world.spawn(tzKek)
                        world.spawn(tzKek2)
                    }
                    Npcs.TZTOKJAD -> {
                        currentWaveNpcs.clear()
                        c.attr.put(FIGHTCAVES_NPC_ARRAYLIST, currentWaveNpcs)
                        c.queue { removeFightCaves(this) }
                    }
                    else -> {
                        val c = npc.getCombatTarget() as Player
                        currentWaveNpcs.remove(waveNpc)
                        c.attr.put(FIGHTCAVES_NPC_ARRAYLIST, currentWaveNpcs)
                        updateWave(c)
                    }
                }
            }
        }
    }
}

on_timer(SAVE_COORDINATES_TIMER) {
    val instancedMap = world.instanceAllocator.getMap(player.tile)

    if (player.attr.get(IN_FIGHTCAVES) == true) {
        val xDiff = (player.tile.x - instancedMap!!.area.bottomLeft.x)
        val zDiff = player.tile.z + instancedMap!!.area.bottomLeft.z

        player.attr.put(FIGHTCAVES_BOTTOMLEFT_X, xDiff)
        player.attr.put(FIGHTCAVES_BOTTOMLEFT_Z, zDiff)
    }

    player.timers[SAVE_COORDINATES_TIMER] = SAVE_COORDINATES_TIMER_DELAY
}

// Fight Caves Entrance
on_obj_option(Objs.CAVE_ENTRANCE_11833, "Enter") {
    generateFightCaves(player)

    player.queue { entranceDialogue(this) }
    player.attr.put(IN_FIGHTCAVES, true)
    player.attr.put(STARTED_FIGHTCAVES, false)
    player.attr.put(FIGHTCAVES_WAVE, DEFAULT_WAVE_START)
    player.attr.put(FIGHTCAVES_NPC_SPAWNINDEX, (0..13).shuffled().first())

    val currentWaveNpcs = arrayListOf<Int>()
    player.attr.put(FIGHTCAVES_NPC_ARRAYLIST, currentWaveNpcs)

    updateWave(player)
}

// Fight Caves Exit
on_obj_option(Objs.CAVE_ENTRANCE_11834, "Leave") {
    val instancedMap = world.instanceAllocator.getMap(player.tile)

    if (instancedMap != null) {
        awardTokkul(player)
        player.attr.put(IN_FIGHTCAVES, false)
        player.attr.put(STARTED_FIGHTCAVES, false)
        player.attr.put(FIGHTCAVES_WAVE, 0)

        player.timers.remove(SAVE_COORDINATES_TIMER)

        val currentWaveNpcs = arrayListOf<Int>()
        player.attr.put(FIGHTCAVES_NPC_ARRAYLIST, currentWaveNpcs)
        world.instanceAllocator.deallocate(world, instancedMap)

        player.queue { failedDialogue(this) }
    }
}