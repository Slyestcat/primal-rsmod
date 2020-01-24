package gg.rsmod.plugins.content.npcs.giantrat

import gg.rsmod.game.model.npcdrops.NPCDropEntry

arrayOf(Npcs.GIANT_RAT_2856, Npcs.GIANT_RAT_2862, Npcs.GIANT_RAT_2864).forEach { npc ->
    set_combat_def(npc) {
        configs {
            attackSpeed = 6
            respawnDelay = 25
        }

        stats {
            hitpoints = 5
            attack = 2
            strength = 3
            defence = 2
        }

        anims {
            attack = 4933
            block = 4934
            death = 4935
        }
    }
    set_drop_table(npc) {
        config {
            table_rolls = 1
        }
        drop_table {
            always_table = arrayOf(
                    NPCDropEntry(Items.RAW_RAT_MEAT, 1, 1),
                    NPCDropEntry(Items.BONES, 1, 1)
            )
        }
    }
}