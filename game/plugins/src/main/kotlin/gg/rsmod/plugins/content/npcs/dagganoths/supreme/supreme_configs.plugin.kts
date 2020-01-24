package gg.rsmod.plugins.content.npcs.dagganoths.supreme

set_multi_combat_region(region = 9033)

spawn_npc(Npcs.DAGANNOTH_SUPREME, x = 2903, z = 4384, walkRadius = 5)

set_combat_def(Npcs.DAGANNOTH_SUPREME) {
        species {
            + NpcSpecies.DAGGANOTH
        }

        configs {
            attackSpeed = 4
            respawnDelay = 50
        }

        aggro {
            radius = 6
            searchDelay = 1
        }

        stats {
            hitpoints = 255
            attack = 255
            strength = 255
            defence = 128
            magic = 255
            ranged = 255
        }

        bonuses {
            defenceStab = 10
            defenceSlash = 10
            defenceCrush = 10
            defenceMagic = 255
            defenceRanged = 550
        }

    anims {
        death = 2856
    }
}