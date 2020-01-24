package gg.rsmod.plugins.content.areas.lumbridge.npcs.goblins

Lumbridge_Goblin.ids.forEach { npc ->
    set_combat_def(npc) {
        configs {
            attackSpeed = 6
            respawnDelay = 75
        }

        stats {
            hitpoints = 5
            attack = 1
            strength = 1
            defence = 1
            magic = 1
            ranged = 1
        }

        bonuses {
            attackStab = 0
            attackSlash = 0
            attackCrush = 0
            attackMagic = 0
            attackRanged = 0

            defenceStab = -15
            defenceSlash = -15
            defenceCrush = -15
            defenceMagic = -15
            defenceRanged = -15

            attackBonus = 0
            strengthBonus = 0
            rangedStrengthBonus = 0
            magicDamageBonus = 0
        }

        slayerData {
            levelRequirement = 1
            xp = 5.0
        }

        anims {
            death = 6182
            attack = 6184
            block = 6183
        }
    }
}