package gg.rsmod.plugins.content.npcs.fightcaves

/**
 * Tz-Kek Config Plugin
 *
 * tz_kek_config.plugin.kts
 * @author: Movee
 */

set_combat_def(Npcs.TZKEK_3120) {
    configs {
        attackSpeed = 6
        respawnDelay = 0
    }

    aggro {
        radius = 500
        searchDelay = 1
        alwaysAggro()
    }

    stats {
        hitpoints = 10
        attack = 20
        strength = 30
        defence = 15
        magic = 30
        ranged = 15
    }

    anims {
        attack = 2625
        block = 2626
        death = 2627
    }
}

set_combat_def(Npcs.TZKEK_3119) {
    configs {
        attackSpeed = 6
        respawnDelay = 0
    }

    aggro {
        radius = 180
        searchDelay = 1
        alwaysAggro()
    }

    stats {
        hitpoints = 20
        attack = 40
        strength = 60
        defence = 30
        magic = 60
        ranged = 30
    }

    anims {
        block = 2626
        death = 2627
    }
}