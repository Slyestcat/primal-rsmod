package gg.rsmod.plugins.content.npcs.chaoselemental

import gg.rsmod.plugins.api.cfg.Npcs

set_multi_combat_region(region = 13177)

spawn_npc(Npcs.CHAOS_ELEMENTAL_2054, x = 3263, z = 3919, walkRadius = 5)

set_combat_def(Npcs.CHAOS_ELEMENTAL_2054) {

    configs {
        attackSpeed = 5
        respawnDelay = 60
    }

    aggro {
        radius = 16
        searchDelay = 1
    }

    stats {
        hitpoints = 250
        attack = 270
        strength = 270
        defence = 270
        magic = 270
    }

    bonuses {
        defenceStab = 70
        defenceSlash = 70
        defenceCrush = 70
        defenceMagic = 70
        defenceRanged = 70
    }

    anims {
        block = 3148
        death = 3147
    }

    slayerData {
        xp = 250.0
    }
}