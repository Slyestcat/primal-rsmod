package gg.rsmod.plugins.content.npcs.dagganoths.rex

set_multi_combat_region(region = 9033)

spawn_npc(Npcs.DAGANNOTH_REX, x = 2924, z = 4384, walkRadius = 5)

set_combat_def(Npcs.DAGANNOTH_REX) {
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
        defence = 255
        magic = 0
        ranged = 255
    }

    bonuses {
        defenceStab = 255
        defenceSlash = 255
        defenceCrush = 255
        defenceMagic = 10
        defenceRanged = 255
    }

    anims {
        death = 2856
    }
}