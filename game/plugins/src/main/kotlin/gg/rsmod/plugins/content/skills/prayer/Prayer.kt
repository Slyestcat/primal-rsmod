package gg.rsmod.plugins.content.skills.prayer

import gg.rsmod.game.model.Area
import gg.rsmod.game.model.Tile
import gg.rsmod.game.model.TileGraphic
import gg.rsmod.game.model.entity.GameObject
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.item.Item
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.plugins.api.Skills
import gg.rsmod.plugins.api.ext.*
import gg.rsmod.plugins.content.inter.bank.openBank

object Prayer {

    private const val ANIMATION = 827

    private const val PLACE_BONE_ANIMATION = 3705

    private const val BONE_GRAPHIC = 624

    private const val BURY_SOUND = 380

    private val VALID_AREA = Area(2946, 2957, 3825, 3816)

    data class BONE(val item: Int, val xp: Double, val alter: Boolean)

    suspend fun start(it: QueueTask, item: Item, bone: BONE) {

        when {
            it.player.tile.isWithinRadius(Tile(2951,3821,0),5) -> if (it.options("Bury the Bone", "Cancel", title = "Are you sure you want to do that?") == 1) buryBone(it, item, bone)
            else -> buryBone(it, item, bone)
        }

    }

    private suspend fun buryBone(it: QueueTask, item: Item, bone: BONE) {
        val player = it.player

        player.lock()

        player.inventory.remove(item)
        player.filterableMessage("You dig a hole in the ground...")
        player.animate(ANIMATION)
        it.wait(3)
        player.playSound(BURY_SOUND)
        player.unlock()
        player.filterableMessage("You bury the bones.")
        player.addXp(Skills.PRAYER, bone.xp)

    }

    suspend fun chaosAltarAction(task: QueueTask, obj: GameObject, bone: BONE) {
        val player = task.player

        while (player.inventory.contains(bone.item)) {
            val chance = (0..1).shuffled().first()

            when (chance) {
                1 -> player.inventory.remove(Item(bone.item))
                0 -> player.filterableMessage("The Dark Lord spares your sacrifice, but rewards you for your efforts.")
            }

            player.animate(PLACE_BONE_ANIMATION)
            player.world.spawn(TileGraphic(obj.tile, 624, 0, 0))

            player.addXp(Skills.PRAYER, bone.xp * 3.5)

            task.wait(3)
        }

    }

    suspend fun dialog(it: QueueTask,item: Item) {
        val player = it.player

        when ( it.options("Exchange '${item.getName(player.world.definitions)}': 50 coins","Exchange 5: 250 coins","Exchange all: ${player.inventory.getItemCount(item.id) * 50} coins (${player.inventory.getItemCount(item.id)} Bones)","Exchange x","Cancel")) {
            1 -> check(it,item,50,1)
            2 -> check(it,item,50 * 5,5)
            3 -> check(it,item,player.inventory.getItemCount(item.id) * 50,player.inventory.getItemCount(item.id))
            4 -> check(it,item,player.inventory.getItemCount(item.id) * 50,100)
        }

    }


    suspend fun check(it: QueueTask,item: Item,price : Int,trade : Int) {
        val player = it.player


        if(!player.inventory.contains(995) && player.inventory.getItemCount(995) <= price) {
            player.filterableMessage("You currently don't have enough coins.")
            return
        }
        player.inventory.remove(Item(995,price))
        player.inventory.remove(Item(item.id,trade))
        player.inventory.add(Item(item.id - 1,trade))
        it.itemMessageBox("The chaos druid converts your noted ${item.getName(player.world.definitions)} into bones.",item.id - 1)

    }



}