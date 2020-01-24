package gg.rsmod.plugins.content.npcs.giantspider

import gg.rsmod.game.model.npcdrops.NPCDropEntry

arrayOf(Npcs.GIANT_SPIDER_3017).forEach { npc ->
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
            hitpoints = 5
        }

        bonuses {
            defenceStab = -10
            defenceSlash = -10
            defenceCrush = -10
            defenceMagic = -10
            defenceRanged = -10
            attackBonus = -10
            strengthBonus = -10
        }

        anims {
            attack = 5327
            block = 5328
            death = 5329
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
        }
    }
}