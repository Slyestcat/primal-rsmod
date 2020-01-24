package gg.rsmod.plugins.content.npcs.zombie

import gg.rsmod.game.model.npcdrops.NPCDropEntry

set_combat_def(Npcs.ZOMBIE_42) {
    configs {
        attackSpeed = 4
        respawnDelay = 25
    }

    stats {
        hitpoints = 24
        attack = 13
        strength = 13
        defence = 18
        magic = 1
        ranged = 1
    }

    bonuses {
        attackStab = 0
        attackSlash = 0
        attackCrush = 0
        attackMagic = 0
        attackRanged = 0
        defenceStab = 0
        defenceSlash = 0
        defenceCrush = 0
        defenceMagic = 0
        defenceRanged = 0
        attackBonus = 0
        strengthBonus = 0
        rangedStrengthBonus = 0
    }

    anims {
        attack = 5578
        block = 5579
        death = 5580
    }
}

set_combat_def(Npcs.ZOMBIE_43) {
    configs {
        attackSpeed = 4
        respawnDelay = 25
    }

    stats {
        hitpoints = 24
        attack = 13
        strength = 13
        defence = 18
        magic = 1
        ranged = 1
    }

    bonuses {
        attackStab = 0
        attackSlash = 0
        attackCrush = 0
        attackMagic = 0
        attackRanged = 0
        defenceStab = 0
        defenceSlash = 0
        defenceCrush = 0
        defenceMagic = 0
        defenceRanged = 0
        strengthBonus = 0
        rangedStrengthBonus = 0
        attackBonus = 0
    }

    anims {
        attack = 5567
        block = 5568
        death = 5569
    }
}

set_combat_def(Npcs.ZOMBIE_44) {
    configs {
        attackSpeed = 4
        respawnDelay = 25
    }

    stats {
        hitpoints = 24
        attack = 13
        strength = 13
        defence = 18
    }

    anims {
        attack = 5571
        block = 5573
        death = 5575
    }
}

set_combat_def(Npcs.ZOMBIE_50) {
    configs {
        attackSpeed = 4
        respawnDelay = 25
    }

    stats {
        hitpoints = 24
        attack = 19
        strength = 21
        defence = 16
        magic = 1
        ranged = 1
    }

    bonuses {
        attackStab = 0
        attackSlash = 0
        attackCrush = 0
        attackMagic = 0
        attackRanged = 0
        defenceStab = 0
        defenceSlash = 0
        defenceCrush = 0
        defenceMagic = 0
        defenceRanged = 0
        strengthBonus = 0
        rangedStrengthBonus = 0
        attackBonus = 0
    }

    anims {
        attack = 5571
        block = 5573
        death = 5575
    }
}

set_combat_def(Npcs.ZOMBIE_51) {
    configs {
        attackSpeed = 4
        respawnDelay = 25
    }

    stats {
        hitpoints = 24
        attack = 19
        strength = 21
        defence = 16
        magic = 1
        ranged = 1
    }

    bonuses {
        attackStab = 0
        attackSlash = 0
        attackCrush = 0
        attackMagic = 0
        attackRanged = 0
        defenceStab = 0
        defenceSlash = 0
        defenceCrush = 0
        defenceMagic = 0
        defenceRanged = 0
        strengthBonus = 0
        rangedStrengthBonus = 0
        attackBonus = 0
    }

    anims {
        attack = 5571
        block = 5573
        death = 5575
    }
}

arrayOf(Npcs.ZOMBIE_42, Npcs.ZOMBIE_43, Npcs.ZOMBIE_44, Npcs.ZOMBIE_50, Npcs.ZOMBIE_51).forEach { npc ->
    set_drop_table(npc) {
        config {
            table_rolls = 1
        }
        drop_table {
            always_table = arrayOf(
                    NPCDropEntry(Items.BONES, 1, 1)
            )
            common_table = arrayOf(
                    NPCDropEntry(Items.STEEL_ARROW, 3, 28),
                    NPCDropEntry(Items.COINS_995, 1, 250),
                    NPCDropEntry(Items.FISHING_BAIT, 5, 7),
                    NPCDropEntry(Items.GRIMY_GUAM_LEAF, 1, 1),
                    NPCDropEntry(Items.GRIMY_MARRENTILL, 1, 1),
                    NPCDropEntry(Items.GRIMY_TARROMIN, 1, 1),
                    NPCDropEntry(Items.GRIMY_HARRALANDER, 1, 1),
                    NPCDropEntry(Items.COINS_995, 3000, 3000),
                    NPCDropEntry(Items.LOOP_HALF_OF_KEY, 1, 1),
                    NPCDropEntry(Items.TOOTH_HALF_OF_KEY, 1, 1),
                    NPCDropEntry(Items.CHAOS_TALISMAN, 1, 1),
                    NPCDropEntry(Items.UNCUT_SAPPHIRE, 1, 1),
                    NPCDropEntry(Items.UNCUT_EMERALD, 1, 1)
            )
            uncommon_table = arrayOf(
                    NPCDropEntry(Items.GRIMY_RANARR_WEED, 1, 1),
                    NPCDropEntry(Items.GRIMY_IRIT_LEAF, 1, 1),
                    NPCDropEntry(Items.GRIMY_AVANTOE, 1, 1),
                    NPCDropEntry(Items.GRIMY_KWUARM, 1, 1),
                    NPCDropEntry(Items.GRIMY_CADANTINE, 1, 1),
                    NPCDropEntry(Items.GRIMY_LANTADYME, 1, 1),
                    NPCDropEntry(Items.GRIMY_DWARF_WEED, 1, 1),
                    NPCDropEntry(Items.BODY_RUNE, 3, 6),
                    NPCDropEntry(Items.CHAOS_RUNE, 4, 4),
                    NPCDropEntry(Items.AIR_RUNE, 3, 13),
                    NPCDropEntry(Items.FIRE_RUNE, 7, 7),
                    NPCDropEntry(Items.MIND_RUNE, 5, 7),
                    NPCDropEntry(Items.NATURE_RUNE, 6, 12),
                    NPCDropEntry(Items.LAW_RUNE, 2, 2),
                    NPCDropEntry(Items.COSMIC_RUNE, 2, 2),
                    NPCDropEntry(Items.BRONZE_AXE, 1, 1),
                    NPCDropEntry(Items.BRONZE_LONGSWORD, 1, 1),
                    NPCDropEntry(Items.BRONZE_MED_HELM, 1, 1),
                    NPCDropEntry(Items.BRONZE_KITESHIELD, 1, 1),
                    NPCDropEntry(Items.IRON_DAGGER, 1, 1),
                    NPCDropEntry(Items.IRON_AXE, 1, 1),
                    NPCDropEntry(Items.IRON_MACE, 1, 1),
                    NPCDropEntry(Items.COPPER_ORE, 1, 1),
                    NPCDropEntry(Items.TIN_ORE, 1, 1),
                    NPCDropEntry(Items.TINDERBOX, 1, 1),
                    NPCDropEntry(Items.EYE_OF_NEWT, 1, 1),
                    NPCDropEntry(Items.IRON_ARROW, 5, 8),
                    NPCDropEntry(Items.MITHRIL_ARROW, 1, 2),
                    NPCDropEntry(Items.UNCUT_RUBY, 1, 1),
                    NPCDropEntry(Items.NATURE_TALISMAN, 1, 1),
                    NPCDropEntry(Items.STEEL_ARROW, 150, 150),
                    NPCDropEntry(Items.RUNE_ARROW, 42, 42),
                    NPCDropEntry(Items.RUNE_JAVELIN, 5, 5),
                    NPCDropEntry(Items.ADAMANT_JAVELIN, 20, 20),
                    NPCDropEntry(Items.RUNITE_BAR, 1, 1),
                    NPCDropEntry(Items.NATURE_RUNE, 67, 67),
                    NPCDropEntry(Items.LAW_RUNE, 45, 45),
                    NPCDropEntry(Items.DEATH_RUNE, 45, 45),
                    NPCDropEntry(Items.RUNE_BATTLEAXE, 1, 1),
                    NPCDropEntry(Items.RUNE_2H_SWORD, 1, 1),
                    NPCDropEntry(Items.RUNE_SQ_SHIELD, 1, 1),
                    NPCDropEntry(Items.SILVER_ORE_NOTED, 100, 100),
                    NPCDropEntry(Items.DRAGONSTONE, 1, 1)
            )
            rare_table = arrayOf(
                    NPCDropEntry(Items.UNCUT_DIAMOND, 1, 1),
                    NPCDropEntry(Items.DRAGON_MED_HELM, 1, 1),
                    NPCDropEntry(Items.RUNE_KITESHIELD, 1, 1),
                    NPCDropEntry(Items.RUNE_SPEAR, 1, 1),
                    NPCDropEntry(Items.SHIELD_LEFT_HALF, 1, 1),
                    NPCDropEntry(Items.DRAGON_SPEAR, 1, 1)
            )
            very_rare_table = arrayOf(
            )
        }
    }
}
