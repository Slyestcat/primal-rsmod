package gg.rsmod.plugins.content.areas.lumbridge.npcs.goblins

import gg.rsmod.game.model.npcdrops.NPCDropEntry

Lumbridge_Goblin.ids.forEach { npc ->
    set_drop_table(npc) {
        config {
            table_rolls = 1
        }

        drop_table {
            always_table = arrayOf(
                    NPCDropEntry(Items.BONES, 1,1)
            )

            common_table = arrayOf(
                    NPCDropEntry(Items.BRONZE_SQ_SHIELD, 1,1),
                    NPCDropEntry(Items.BRONZE_BOLTS, 2,2),
                    NPCDropEntry(Items.BRONZE_BOLTS, 4,4),
                    NPCDropEntry(Items.WATER_RUNE, 6,6),
                    NPCDropEntry(Items.MIND_RUNE, 1,2),
                    NPCDropEntry(Items.BODY_RUNE, 2,2),
                    NPCDropEntry(Items.BODY_RUNE, 7, 7),
                    NPCDropEntry(Items.HAMMER, 1,1),
                    NPCDropEntry(Items.COINS_995, 1,24),
                    NPCDropEntry(Items.GOBLIN_SKULL, 1,1)
            )

            uncommon_table = arrayOf(
                    NPCDropEntry(Items.BRONZE_BOLTS, 8,8),
                    NPCDropEntry(Items.BRONZE_SCIMITAR, 1,1),
                    NPCDropEntry(Items.BRONZE_SPEAR, 1,1),
                    NPCDropEntry(Items.BRONZE_JAVELIN, 1,1),
                    NPCDropEntry(Items.BRASS_NECKLACE, 1,1),
                    NPCDropEntry(Items.EARTH_RUNE, 4,4),
                    NPCDropEntry(Items.ECUMENICAL_KEY, 1,1),
                    NPCDropEntry(Items.BRONZE_AXE, 1,1),
                    NPCDropEntry(Items.AIR_TALISMAN, 1,1),
                    NPCDropEntry(Items.BUCKET,1,1),
                    NPCDropEntry(Items.RED_CAPE, 1,1),
                    NPCDropEntry(Items.CHEFS_HAT, 1,1),
                    NPCDropEntry(Items.GRAPES, 1,1),
                    NPCDropEntry(Items.BEER, 1,1),
                    NPCDropEntry(Items.GOBLIN_MAIL, 1,1),
                    NPCDropEntry(Items.ENSOULED_GOBLIN_HEAD, 1,1)
            )

            rare_table = arrayOf(
                    NPCDropEntry(Items.BRONZE_ARROW, 14,14),
                    NPCDropEntry(Items.BRONZE_KITESHIELD, 1,1),
                    NPCDropEntry(Items.CHAOS_RUNE, 1,1),
                    NPCDropEntry(Items.NATURE_RUNE, 1, 1),
                    NPCDropEntry(Items.TIN_ORE, 1,1)
            )

            very_rare_table = arrayOf(
                    NPCDropEntry(Items.GOBLIN_CHAMPION_SCROLL, 1,1)
            )
        }
    }
}