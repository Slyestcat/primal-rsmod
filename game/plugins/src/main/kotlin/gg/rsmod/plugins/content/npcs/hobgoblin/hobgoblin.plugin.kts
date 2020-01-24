package gg.rsmod.plugins.content.npcs.hobgoblin

import gg.rsmod.game.model.npcdrops.NPCDropEntry

set_combat_def(Npcs.HOBGOBLIN_3049) {
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
        hitpoints = 29
        attack = 22
        strength = 24
        defence = 24
    }

    anims {
        attack = 163
        block = 164
        death = 167
    }
}

set_combat_def(Npcs.HOBGOBLIN_3050) {
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
        hitpoints = 49
        attack = 33
        strength = 31
        defence = 36
    }

    anims {
        attack = 163
        block = 164
        death = 167
    }
}

arrayOf(Npcs.HOBGOBLIN_3049, Npcs.HOBGOBLIN_3050).forEach { npc ->
    set_drop_table(npc) {
        config {
            table_rolls = 1
        }
        drop_table {
            always_table = arrayOf(
                    NPCDropEntry(Items.BONES, 1, 1)
            )
            common_table = arrayOf(
                    NPCDropEntry(Items.COINS_995, 1, 68),
                    NPCDropEntry(Items.LIMPWURT_ROOT, 1, 1),
                    NPCDropEntry(Items.GRIMY_GUAM_LEAF, 1, 1),
                    NPCDropEntry(Items.GRIMY_MARRENTILL, 1, 1),
                    NPCDropEntry(Items.GRIMY_TARROMIN, 1, 1),
                    NPCDropEntry(Items.POTATO_SEED, 4, 4),
                    NPCDropEntry(Items.ONION_SEED, 4, 4),
                    NPCDropEntry(Items.CABBAGE_SEED, 4, 4)
            )
            uncommon_table = arrayOf(
                    NPCDropEntry(Items.GRIMY_HARRALANDER, 1, 1),
                    NPCDropEntry(Items.GRIMY_RANARR_WEED, 1, 1),
                    NPCDropEntry(Items.GRIMY_IRIT_LEAF, 1, 1),
                    NPCDropEntry(Items.GRIMY_AVANTOE, 1, 1),
                    NPCDropEntry(Items.BODY_RUNE, 6, 6),
                    NPCDropEntry(Items.LAW_RUNE, 2, 2),
                    NPCDropEntry(Items.FIRE_RUNE, 7, 7),
                    NPCDropEntry(Items.CHAOS_RUNE, 3, 3),
                    NPCDropEntry(Items.WATER_RUNE, 2, 2),
                    NPCDropEntry(Items.NATURE_RUNE, 4, 4),
                    NPCDropEntry(Items.IRON_SWORD, 1, 1),
                    NPCDropEntry(Items.IRON_SPEAR, 1, 1),
                    NPCDropEntry(Items.STEEL_DAGGER, 1, 1),
                    NPCDropEntry(Items.LIMPWURT_SEED, 1, 1),
                    NPCDropEntry(Items.STRAWBERRY_SEED, 1, 1),
                    NPCDropEntry(Items.MARRENTILL_SEED, 1, 1),
                    NPCDropEntry(Items.JANGERBERRY_SEED, 1, 1),
                    NPCDropEntry(Items.TARROMIN_SEED, 1, 1),
                    NPCDropEntry(Items.WILDBLOOD_SEED, 1, 1),
                    NPCDropEntry(Items.GOBLIN_MAIL, 4, 4),
                    NPCDropEntry(Items.CLUE_SCROLL_BEGINNER, 1, 1)
            )
            rare_table = arrayOf(
                    NPCDropEntry(Items.GRIMY_KWUARM, 1, 1),
                    NPCDropEntry(Items.GRIMY_CADANTINE, 1, 1),
                    NPCDropEntry(Items.GRIMY_LANTADYME, 1, 1),
                    NPCDropEntry(Items.BRONZE_SPEAR, 1, 1),
                    NPCDropEntry(Items.IRON_JAVELIN, 5, 5),
                    NPCDropEntry(Items.STEEL_LONGSWORD, 1, 1),
                    NPCDropEntry(Items.STEEL_SPEAR, 1, 1),
                    NPCDropEntry(Items.BRASS_NECKLACE, 1, 1),
                    NPCDropEntry(Items.COSMIC_RUNE, 2, 2),
                    NPCDropEntry(Items.SWEETCORN_SEED, 1, 1),
                    NPCDropEntry(Items.WATERMELON_SEED, 1, 1),
                    NPCDropEntry(Items.HARRALANDER_SEED, 1, 1),
                    NPCDropEntry(Items.RANARR_SEED, 1, 1),
                    NPCDropEntry(Items.WHITEBERRY_SEED, 1, 1),
                    NPCDropEntry(Items.MUSHROOM_SPORE, 1, 1),
                    NPCDropEntry(Items.TOADFLAX_SEED, 1, 1),
                    NPCDropEntry(Items.IRIT_SEED, 1, 1),
                    NPCDropEntry(Items.BELLADONNA_SEED, 1, 1),
                    NPCDropEntry(Items.POISON_IVY_SEED, 1, 1),
                    NPCDropEntry(Items.CACTUS_SEED, 1, 1),
                    NPCDropEntry(Items.AVANTOE_SEED, 1, 1),
                    NPCDropEntry(Items.KWUARM_SEED, 1, 1),
                    NPCDropEntry(Items.UNCUT_SAPPHIRE, 1, 1),
                    NPCDropEntry(Items.UNCUT_EMERALD, 1, 1),
                    NPCDropEntry(Items.UNCUT_RUBY, 1, 1)
            )
            very_rare_table = arrayOf(
                    NPCDropEntry(Items.GRIMY_DWARF_WEED, 1, 1),
                    NPCDropEntry(Items.SNAPE_GRASS_SEED, 1, 2),
                    NPCDropEntry(Items.SNAPDRAGON_SEED, 1, 1),
                    NPCDropEntry(Items.CADANTINE_SEED, 1, 1),
                    NPCDropEntry(Items.LANTADYME_SEED, 1, 1),
                    NPCDropEntry(Items.DWARF_WEED_SEED, 1, 1),
                    NPCDropEntry(Items.TORSTOL_SEED, 1, 1),
                    NPCDropEntry(Items.CHAOS_TALISMAN, 1, 1),
                    NPCDropEntry(Items.UNCUT_DIAMOND, 1, 1),
                    NPCDropEntry(Items.LOOP_HALF_OF_KEY, 1, 1),
                    NPCDropEntry(Items.TOOTH_HALF_OF_KEY, 1, 1),
                    NPCDropEntry(Items.RUNE_JAVELIN, 1, 1),
                    NPCDropEntry(Items.RUNE_SPEAR, 1, 1),
                    NPCDropEntry(Items.SHIELD_LEFT_HALF, 1, 1),
                    NPCDropEntry(Items.DRAGON_SPEAR, 1, 1)
            )
        }
    }
}
