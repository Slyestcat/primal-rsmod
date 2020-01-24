package gg.rsmod.plugins.content.npcs.hillgiant

import gg.rsmod.game.model.npcdrops.NPCDropEntry

arrayOf(Npcs.HILL_GIANT, Npcs.HILL_GIANT_2099, Npcs.HILL_GIANT_2100, Npcs.HILL_GIANT_2101, Npcs.HILL_GIANT_2102).forEach { npc ->
    set_combat_def(npc) {
        configs {
            attackSpeed = 6
            respawnDelay = 25
        }

        aggro {
            radius = 3
            searchDelay = 1
            aggroMinutes = 10
        }

        stats {
            hitpoints = 35
            attack = 18
            strength = 22
            defence = 26
        }

        bonuses {
            defenceStab = 5
            defenceSlash = 5
            defenceCrush = -5
            defenceRanged = 5
            attackBonus = 18
            strengthBonus = 16
        }

        anims {
            attack = 4652
            block = 4651
            death = 4653
        }
    }
    set_drop_table(npc) {
        config {
            table_rolls = 1
        }
        drop_table {
            always_table = arrayOf(
                    NPCDropEntry(Items.BIG_BONES, 1, 1)
            )
            common_table = arrayOf(
                    NPCDropEntry(Items.COINS_995, 5, 52),
                    NPCDropEntry(Items.LIMPWURT_ROOT, 1, 1),
                    NPCDropEntry(Items.BEER, 1, 1),
                    NPCDropEntry(Items.POTATO_SEED, 4, 4),
                    NPCDropEntry(Items.IRON_ARROW, 3, 3)
            )
            uncommon_table = arrayOf(
                    NPCDropEntry(Items.COINS_995, 88, 88),
                    NPCDropEntry(Items.ONION_SEED, 4, 4),
                    NPCDropEntry(Items.CABBAGE_SEED, 4, 4),
                    NPCDropEntry(Items.TOMATO_SEED, 3, 3),
                    NPCDropEntry(Items.FIRE_RUNE, 15, 15),
                    NPCDropEntry(Items.LAW_RUNE, 2, 2),
                    NPCDropEntry(Items.WATER_RUNE, 7, 7),
                    NPCDropEntry(Items.MIND_RUNE, 3, 3),
                    NPCDropEntry(Items.NATURE_RUNE, 6, 6),
                    NPCDropEntry(Items.COSMIC_RUNE, 2, 2),
                    NPCDropEntry(Items.IRON_FULL_HELM, 1, 1),
                    NPCDropEntry(Items.IRON_DAGGER, 1, 1),
                    NPCDropEntry(Items.IRON_KITESHIELD, 1, 1),
                    NPCDropEntry(Items.STEEL_ARROW, 10, 10),
                    NPCDropEntry(Items.STEEL_LONGSWORD, 1, 1),
                    NPCDropEntry(Items.GRIMY_GUAM_LEAF, 1, 1),
                    NPCDropEntry(Items.GRIMY_MARRENTILL, 1, 1),
                    NPCDropEntry(Items.CLUE_SCROLL_BEGINNER, 1, 1),
                    NPCDropEntry(Items.BODY_TALISMAN, 5, 52)
            )
            rare_table = arrayOf(
                    NPCDropEntry(Items.GRIMY_TARROMIN, 1, 1),
                    NPCDropEntry(Items.GRIMY_HARRALANDER, 1, 1),
                    NPCDropEntry(Items.GRIMY_RANARR_WEED, 1, 1),
                    NPCDropEntry(Items.GRIMY_IRIT_LEAF, 1, 1),
                    NPCDropEntry(Items.GRIMY_AVANTOE, 1, 1),
                    NPCDropEntry(Items.GRIMY_KWUARM, 1, 1),
                    NPCDropEntry(Items.GRIMY_CADANTINE, 1, 1),
                    NPCDropEntry(Items.GRIMY_LANTADYME, 1, 1),
                    NPCDropEntry(Items.GRIMY_DWARF_WEED, 1, 1),
                    NPCDropEntry(Items.DEATH_RUNE, 2, 2),
                    NPCDropEntry(Items.CHAOS_RUNE, 2, 2),
                    NPCDropEntry(Items.SWEETCORN_SEED, 3, 3),
                    NPCDropEntry(Items.STRAWBERRY_SEED, 2, 2),
                    NPCDropEntry(Items.WATERMELON_SEED, 2, 2),
                    NPCDropEntry(Items.SNAPE_GRASS_SEED, 2, 2),
                    NPCDropEntry(Items.UNCUT_SAPPHIRE, 1, 1),
                    NPCDropEntry(Items.UNCUT_EMERALD, 1, 1),
                    NPCDropEntry(Items.UNCUT_RUBY, 1, 1),
                    NPCDropEntry(Items.GIANT_KEY, 5, 52)
            )
            very_rare_table = arrayOf(
                    NPCDropEntry(Items.CHAOS_TALISMAN, 1, 1),
                    NPCDropEntry(Items.UNCUT_DIAMOND, 1, 1),
                    NPCDropEntry(Items.LOOP_HALF_OF_KEY, 1, 1),
                    NPCDropEntry(Items.TOOTH_HALF_OF_KEY, 1, 1),
                    NPCDropEntry(Items.RUNE_JAVELIN, 5, 5),
                    NPCDropEntry(Items.RUNE_SPEAR, 1, 1),
                    NPCDropEntry(Items.SHIELD_LEFT_HALF, 1, 1),
                    NPCDropEntry(Items.DRAGON_SPEAR, 1, 1)
            )
        }
    }
}