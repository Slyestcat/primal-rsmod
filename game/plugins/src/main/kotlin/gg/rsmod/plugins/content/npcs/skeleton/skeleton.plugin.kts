package gg.rsmod.plugins.content.npcs.skeleton

import gg.rsmod.game.model.npcdrops.NPCDropEntry

arrayOf(Npcs.SKELETON_74, Npcs.SKELETON_75, Npcs.SKELETON, Npcs.SKELETON_71, Npcs.SKELETON_72, Npcs.SKELETON_77, Npcs.SKELETON_78, Npcs.SKELETON_79, Npcs.SKELETON_80, Npcs.SKELETON_81).forEach { npc ->
    set_combat_def(npc) {
        configs {
            attackSpeed = 4
            respawnDelay = 25
        }

        aggro {
            radius = 3
            searchDelay = 1
            aggroMinutes = 10
        }

        stats {
            hitpoints = 18
            attack = 15
            strength = 18
            defence = 17
        }

        bonuses {
            defenceStab = 5
            defenceSlash = 5
            defenceCrush = -5
            defenceRanged = 5
        }

        anims {
            attack = 5485
            block = 5482
            death = 5491
        }
    }
    set_drop_table(npc) {
        config {
            table_rolls = 1
        }
        drop_table {
            always_table = arrayOf(
                    NPCDropEntry(Items.BONES, 1, 1)
            )
            common_table = arrayOf(
                    NPCDropEntry(Items.BRONZE_ARROW, 2, 5),
                    NPCDropEntry(Items.COINS_995, 2, 33)
            )
            uncommon_table = arrayOf(
                    NPCDropEntry(Items.GRIMY_GUAM_LEAF, 1, 1),
                    NPCDropEntry(Items.GRIMY_MARRENTILL, 1, 1),
                    NPCDropEntry(Items.GRIMY_TARROMIN, 1, 1),
                    NPCDropEntry(Items.GRIMY_HARRALANDER, 1, 1),
                    NPCDropEntry(Items.GRIMY_RANARR_WEED, 1, 1),
                    NPCDropEntry(Items.GRIMY_IRIT_LEAF, 1, 1),
                    NPCDropEntry(Items.EARTH_RUNE, 3, 3),
                    NPCDropEntry(Items.AIR_RUNE, 12, 12),
                    NPCDropEntry(Items.CHAOS_RUNE, 3, 3),
                    NPCDropEntry(Items.IRON_DAGGER, 1, 1),
                    NPCDropEntry(Items.FIRE_TALISMAN, 1, 1),
                    NPCDropEntry(Items.CLUE_SCROLL_BEGINNER, 1, 1)
            )
            rare_table = arrayOf(
                    NPCDropEntry(Items.GRIMY_AVANTOE, 1, 1),
                    NPCDropEntry(Items.GRIMY_KWUARM, 1, 1),
                    NPCDropEntry(Items.GRIMY_CADANTINE, 1, 1),
                    NPCDropEntry(Items.GRIMY_LANTADYME, 1, 1),
                    NPCDropEntry(Items.GRIMY_DWARF_WEED, 1, 1),
                    NPCDropEntry(Items.FIRE_RUNE, 2, 2),
                    NPCDropEntry(Items.NATURE_RUNE, 3, 3),
                    NPCDropEntry(Items.IRON_ARROW, 1, 1),
                    NPCDropEntry(Items.STEEL_ARROW, 1, 1),
                    NPCDropEntry(Items.CLUE_SCROLL_EASY, 1, 1),
                    NPCDropEntry(Items.GRAIN, 1, 1),
                    NPCDropEntry(Items.IRON_ORE, 1, 1)
            )
            very_rare_table = arrayOf(
            )
        }
    }
}