package gg.rsmod.plugins.content.items.armoursets

import gg.rsmod.plugins.api.cfg.Items

enum class fouritemsets(val item: Int, val item1: Int, val item2: Int, val item3: Int,
                      val item4: Int) {

    /**
     * Standard PlateMetal.
     */
    BRONZE_SET_LG(item = Items.BRONZE_SET_LG, item1 = Items.BRONZE_FULL_HELM, item2 = Items.BRONZE_PLATEBODY,
            item3 = Items.BRONZE_PLATELEGS, item4 = Items.BRONZE_KITESHIELD),
    BRONZE_SET_SK(item = Items.BRONZE_SET_SK, item1 = Items.BRONZE_FULL_HELM, item2 = Items.BRONZE_PLATEBODY,
            item3 = Items.BRONZE_PLATESKIRT, item4 = Items.BRONZE_KITESHIELD),
    IRON_SET_LG(item = Items.IRON_SET_LG, item1 = Items.IRON_FULL_HELM, item2 = Items.IRON_PLATEBODY, 
            item3 = Items.IRON_PLATELEGS, item4 = Items.IRON_KITESHIELD),
    IRON_SET_SK(item = Items.IRON_SET_SK, item1 = Items.IRON_FULL_HELM, item2 = Items.IRON_PLATEBODY,
            item3 = Items.IRON_PLATESKIRT, item4 = Items.IRON_KITESHIELD),
    STEEL_SET_LG(item = Items.STEEL_SET_LG, item1 = Items.STEEL_FULL_HELM, item2 = Items.STEEL_PLATEBODY, 
            item3 = Items.STEEL_PLATELEGS, item4 = Items.STEEL_KITESHIELD),
    STEEL_SET_SK(item = Items.STEEL_SET_SK, item1 = Items.STEEL_FULL_HELM, item2 = Items.STEEL_PLATEBODY,
            item3 = Items.STEEL_PLATESKIRT, item4 = Items.STEEL_KITESHIELD),
    BLACK_SET_LG(item = Items.BLACK_SET_LG, item1 = Items.BLACK_FULL_HELM, item2 = Items.BLACK_PLATEBODY, 
            item3 = Items.BLACK_PLATELEGS, item4 = Items.BLACK_KITESHIELD),
    BLACK_SET_SK(item = Items.BLACK_SET_SK, item1 = Items.BLACK_FULL_HELM, item2 = Items.BLACK_PLATEBODY,
            item3 = Items.BLACK_PLATESKIRT, item4 = Items.BLACK_KITESHIELD),
    MITHRIL_SET_LG(item = Items.MITHRIL_SET_LG, item1 = Items.MITHRIL_FULL_HELM, item2 = Items.MITHRIL_PLATEBODY, 
            item3 = Items.MITHRIL_PLATELEGS, item4 = Items.MITHRIL_KITESHIELD),
    MITHRIL_SET_SK(item = Items.MITHRIL_SET_SK, item1 = Items.MITHRIL_FULL_HELM, item2 = Items.MITHRIL_PLATEBODY,
            item3 = Items.MITHRIL_PLATESKIRT, item4 = Items.MITHRIL_KITESHIELD),
    ADAMANT_SET_LG(item = Items.ADAMANT_SET_LG, item1 = Items.ADAMANT_FULL_HELM, item2 = Items.ADAMANT_PLATEBODY,
            item3 = Items.ADAMANT_PLATELEGS, item4 = Items.ADAMANT_KITESHIELD),
    ADAMANT_SET_SK(item = Items.ADAMANT_SET_SK, item1 = Items.ADAMANT_FULL_HELM, item2 = Items.ADAMANT_PLATEBODY,
            item3 = Items.ADAMANT_PLATESKIRT, item4 = Items.ADAMANT_KITESHIELD),
    RUNE_ARMOUR_SET_LG(item = Items.RUNE_ARMOUR_SET_LG, item1 = Items.RUNE_FULL_HELM, item2 = Items.RUNE_PLATEBODY,
            item3 = Items.RUNE_PLATELEGS, item4 = Items.RUNE_KITESHIELD),
    RUNE_ARMOUR_SET_SK(item = Items.RUNE_ARMOUR_SET_SK, item1 = Items.RUNE_FULL_HELM, item2 = Items.RUNE_PLATEBODY,
            item3 = Items.RUNE_PLATESKIRT, item4 = Items.RUNE_KITESHIELD),
    DRAGON_ARMOUR_SET_LG(item = Items.DRAGON_ARMOUR_SET_LG, item1 = Items.DRAGON_FULL_HELM, item2 = Items.DRAGON_PLATEBODY,
            item3 = Items.DRAGON_PLATELEGS, item4 = Items.DRAGON_KITESHIELD),
    DRAGON_ARMOUR_SET_SK(item = Items.DRAGON_ARMOUR_SET_SK, item1 = Items.DRAGON_FULL_HELM, item2 = Items.DRAGON_PLATEBODY,
            item3 = Items.DRAGON_PLATESKIRT, item4 = Items.DRAGON_KITESHIELD),
    /**
     * Trimmed PlateMetal.
     */
    BRONZE_TRIMMED_SET_LG(item = Items.BRONZE_TRIMMED_SET_LG, item1 = Items.BRONZE_FULL_HELM_T, item2 = Items.BRONZE_PLATEBODY_T,
            item3 = Items.BRONZE_PLATELEGS_T, item4 = Items.BRONZE_KITESHIELD_T),
    BRONZE_TRIMMED_SET_SK(item = Items.BRONZE_TRIMMED_SET_SK, item1 = Items.BRONZE_FULL_HELM_T, item2 = Items.BRONZE_PLATEBODY_T,
            item3 = Items.BRONZE_PLATESKIRT_T, item4 = Items.BRONZE_KITESHIELD_T),
    IRON_TRIMMED_SET_LG(item = Items.IRON_TRIMMED_SET_LG, item1 = Items.IRON_FULL_HELM_T, item2 = Items.IRON_PLATEBODY_T,
            item3 = Items.IRON_PLATELEGS_T, item4 = Items.IRON_KITESHIELD_T),
    IRON_TRIMMED_SET_SK(item = Items.IRON_TRIMMED_SET_SK, item1 = Items.IRON_FULL_HELM_T, item2 = Items.IRON_PLATEBODY_T,
            item3 = Items.IRON_PLATESKIRT_T, item4 = Items.IRON_KITESHIELD_T),
    STEEL_TRIMMED_SET_LG(item = Items.STEEL_TRIMMED_SET_LG, item1 = Items.STEEL_FULL_HELM_T, item2 = Items.STEEL_PLATEBODY_T,
            item3 = Items.STEEL_PLATELEGS_T, item4 = Items.STEEL_KITESHIELD_T),
    STEEL_TRIMMED_SET_SK(item = Items.STEEL_TRIMMED_SET_SK, item1 = Items.STEEL_FULL_HELM_T, item2 = Items.STEEL_PLATEBODY_T,
            item3 = Items.STEEL_PLATESKIRT_T, item4 = Items.STEEL_KITESHIELD_T),
    BLACK_TRIMMED_SET_LG(item = Items.BLACK_TRIMMED_SET_LG, item1 = Items.BLACK_FULL_HELM_T, item2 = Items.BLACK_PLATEBODY_T,
            item3 = Items.BLACK_PLATELEGS_T, item4 = Items.BLACK_KITESHIELD_T),
    BLACK_TRIMMED_SET_SK(item = Items.BLACK_TRIMMED_SET_SK, item1 = Items.BLACK_FULL_HELM_T, item2 = Items.BLACK_PLATEBODY_T,
            item3 = Items.BLACK_PLATESKIRT_T, item4 = Items.BLACK_KITESHIELD_T),
    MITHRIL_TRIMMED_SET_LG(item = Items.MITHRIL_TRIMMED_SET_LG, item1 = Items.MITHRIL_FULL_HELM_T, item2 = Items.MITHRIL_PLATEBODY_T,
            item3 = Items.MITHRIL_PLATELEGS_T, item4 = Items.MITHRIL_KITESHIELD_T),
    MITHRIL_TRIMMED_SET_SK(item = Items.MITHRIL_TRIMMED_SET_SK, item1 = Items.MITHRIL_FULL_HELM_T, item2 = Items.MITHRIL_PLATEBODY_T,
            item3 = Items.MITHRIL_PLATESKIRT_T, item4 = Items.MITHRIL_KITESHIELD_T),
    ADAMANT_TRIMMED_SET_LG(item = Items.ADAMANT_TRIMMED_SET_LG, item1 = Items.ADAMANT_FULL_HELM_T, item2 = Items.ADAMANT_PLATEBODY_T,
            item3 = Items.ADAMANT_PLATELEGS_T, item4 = Items.ADAMANT_KITESHIELD_T),
    ADAMANT_TRIMMED_SET_SK(item = Items.ADAMANT_TRIMMED_SET_SK, item1 = Items.ADAMANT_FULL_HELM_T, item2 = Items.ADAMANT_PLATEBODY_T,
            item3 = Items.ADAMANT_PLATESKIRT_T, item4 = Items.ADAMANT_KITESHIELD_T),
    RUNE_TRIMMED_SET_LG(item = Items.RUNE_TRIMMED_SET_LG, item1 = Items.RUNE_FULL_HELM_T, item2 = Items.RUNE_PLATEBODY_T,
            item3 = Items.RUNE_PLATELEGS_T, item4 = Items.RUNE_KITESHIELD_T),
    RUNE_TRIMMED_SET_SK(item = Items.RUNE_TRIMMED_SET_SK, item1 = Items.RUNE_FULL_HELM_T, item2 = Items.RUNE_PLATEBODY_T,
            item3 = Items.RUNE_PLATESKIRT_T, item4 = Items.RUNE_KITESHIELD_T),
    /**
     * GOLD Trimmed PlateMetal.
     */
    BRONZE_GOLDTRIMMED_SET_LG(item = Items.BRONZE_GOLDTRIMMED_SET_LG, item1 = Items.BRONZE_FULL_HELM_G, item2 = Items.BRONZE_PLATEBODY_G,
            item3 = Items.BRONZE_PLATELEGS_G, item4 = Items.BRONZE_KITESHIELD_G),
    BRONZE_GOLDTRIMMED_SET_SK(item = Items.BRONZE_GOLDTRIMMED_SET_SK, item1 = Items.BRONZE_FULL_HELM_G, item2 = Items.BRONZE_PLATEBODY_G,
            item3 = Items.BRONZE_PLATESKIRT_G, item4 = Items.BRONZE_KITESHIELD_G),
    IRON_GOLDTRIMMED_SET_LG(item = Items.IRON_GOLDTRIMMED_SET_LG, item1 = Items.IRON_FULL_HELM_G, item2 = Items.IRON_PLATEBODY_G,
            item3 = Items.IRON_PLATELEGS_G, item4 = Items.IRON_KITESHIELD_G),
    IRON_GOLDTRIMMED_SET_SK(item = Items.IRON_GOLDTRIMMED_SET_SK, item1 = Items.IRON_FULL_HELM_G, item2 = Items.IRON_PLATEBODY_G,
            item3 = Items.IRON_PLATESKIRT_G, item4 = Items.IRON_KITESHIELD_G),
    STEEL_GOLDTRIMMED_SET_LG(item = Items.STEEL_GOLDTRIMMED_SET_LG, item1 = Items.STEEL_FULL_HELM_G, item2 = Items.STEEL_PLATEBODY_G,
            item3 = Items.STEEL_PLATELEGS_G, item4 = Items.STEEL_KITESHIELD_G),
    STEEL_GOLDTRIMMED_SET_SK(item = Items.STEEL_GOLDTRIMMED_SET_SK, item1 = Items.STEEL_FULL_HELM_G, item2 = Items.STEEL_PLATEBODY_G,
            item3 = Items.STEEL_PLATESKIRT_G, item4 = Items.STEEL_KITESHIELD_G),
    BLACK_GOLDTRIMMED_SET_LG(item = Items.BLACK_GOLDTRIMMED_SET_LG, item1 = Items.BLACK_FULL_HELM_G, item2 = Items.BLACK_PLATEBODY_G,
            item3 = Items.BLACK_PLATELEGS_G, item4 = Items.BLACK_KITESHIELD_G),
    BLACK_GOLDTRIMMED_SET_SK(item = Items.BLACK_GOLDTRIMMED_SET_SK, item1 = Items.BLACK_FULL_HELM_G, item2 = Items.BLACK_PLATEBODY_G,
            item3 = Items.BLACK_PLATESKIRT_G, item4 = Items.BLACK_KITESHIELD_G),
    MITHRIL_GOLDTRIMMED_SET_LG(item = Items.MITHRIL_GOLDTRIMMED_SET_LG, item1 = Items.MITHRIL_FULL_HELM_G, item2 = Items.MITHRIL_PLATEBODY_G,
            item3 = Items.MITHRIL_PLATELEGS_G, item4 = Items.MITHRIL_KITESHIELD_G),
    MITHRIL_GOLDTRIMMED_SET_SK(item = Items.MITHRIL_GOLDTRIMMED_SET_SK, item1 = Items.MITHRIL_FULL_HELM_G, item2 = Items.MITHRIL_PLATEBODY_G,
            item3 = Items.MITHRIL_PLATESKIRT_G, item4 = Items.MITHRIL_KITESHIELD_G),
    ADAMANT_GOLDTRIMMED_SET_LG(item = Items.ADAMANT_GOLDTRIMMED_SET_LG, item1 = Items.ADAMANT_FULL_HELM_G, item2 = Items.ADAMANT_PLATEBODY_G,
            item3 = Items.ADAMANT_PLATELEGS_G, item4 = Items.ADAMANT_KITESHIELD_G),
    ADAMANT_GOLDTRIMMED_SET_SK(item = Items.ADAMANT_GOLDTRIMMED_SET_SK, item1 = Items.ADAMANT_FULL_HELM_G, item2 = Items.ADAMANT_PLATEBODY_G,
            item3 = Items.ADAMANT_PLATESKIRT_G, item4 = Items.ADAMANT_KITESHIELD_G),
    RUNE_GOLDTRIMMED_SET_LG(item = Items.RUNE_GOLDTRIMMED_SET_LG, item1 = Items.RUNE_FULL_HELM_G, item2 = Items.RUNE_PLATEBODY_G,
            item3 = Items.RUNE_PLATELEGS_G, item4 = Items.RUNE_KITESHIELD_G),
    RUNE_GOLDTRIMMED_SET_SK(item = Items.RUNE_GOLDTRIMMED_SET_SK, item1 = Items.RUNE_FULL_HELM_G, item2 = Items.RUNE_PLATEBODY_G,
            item3 = Items.RUNE_PLATESKIRT_G, item4 = Items.RUNE_KITESHIELD_G),
    GILDED_ARMOUR_SET_LG(item = Items.GILDED_ARMOUR_SET_LG, item1 = Items.GILDED_FULL_HELM, item2 = Items.GILDED_PLATEBODY,
            item3 = Items.GILDED_PLATELEGS, item4 = Items.GILDED_KITESHIELD),
    GILDED_ARMOUR_SET_SK(item = Items.GILDED_ARMOUR_SET_SK, item1 = Items.GILDED_FULL_HELM, item2 = Items.GILDED_PLATEBODY,
            item3 = Items.GILDED_PLATESKIRT, item4 = Items.GILDED_KITESHIELD),
    /**
     * GOD PlateMetal.
     */
    BANDOS_RUNE_ARMOUR_SET_LG(item = Items.BANDOS_RUNE_ARMOUR_SET_LG, item1 = Items.BANDOS_FULL_HELM, item2 = Items.BANDOS_PLATEBODY,
            item3 = Items.BANDOS_PLATELEGS, item4 = Items.BANDOS_KITESHIELD),
    BANDOS_RUNE_ARMOUR_SET_SK(item = Items.BANDOS_RUNE_ARMOUR_SET_SK, item1 = Items.BANDOS_FULL_HELM, item2 = Items.BANDOS_PLATEBODY,
            item3 = Items.BANDOS_PLATESKIRT, item4 = Items.BANDOS_KITESHIELD),
    ARMADYL_RUNE_ARMOUR_SET_LG(item = Items.ARMADYL_RUNE_ARMOUR_SET_LG, item1 = Items.ARMADYL_FULL_HELM, item2 = Items.ARMADYL_PLATEBODY,
            item3 = Items.ARMADYL_PLATELEGS, item4 = Items.ARMADYL_KITESHIELD),
    ARMADYL_RUNE_ARMOUR_SET_SK(item = Items.ARMADYL_RUNE_ARMOUR_SET_SK, item1 = Items.ARMADYL_FULL_HELM, item2 = Items.ARMADYL_PLATEBODY,
            item3 = Items.ARMADYL_PLATESKIRT, item4 = Items.ARMADYL_KITESHIELD),
    ANCIENT_RUNE_ARMOUR_SET_LG(item = Items.ANCIENT_RUNE_ARMOUR_SET_LG, item1 = Items.ANCIENT_FULL_HELM, item2 = Items.ANCIENT_PLATEBODY,
            item3 = Items.ANCIENT_PLATELEGS, item4 = Items.ANCIENT_KITESHIELD),
    ANCIENT_RUNE_ARMOUR_SET_SK(item = Items.ANCIENT_RUNE_ARMOUR_SET_SK, item1 = Items.ANCIENT_FULL_HELM, item2 = Items.ANCIENT_PLATEBODY,
            item3 = Items.ANCIENT_PLATESKIRT, item4 = Items.ANCIENT_KITESHIELD),
    ZAMORAK_ARMOUR_SET_LG(item = Items.ZAMORAK_ARMOUR_SET_LG, item1 = Items.ZAMORAK_FULL_HELM, item2 = Items.ZAMORAK_PLATEBODY,
            item3 = Items.ZAMORAK_PLATELEGS, item4 = Items.ZAMORAK_KITESHIELD),
    ZAMORAK_ARMOUR_SET_SK(item = Items.ZAMORAK_ARMOUR_SET_SK, item1 = Items.ZAMORAK_FULL_HELM, item2 = Items.ZAMORAK_PLATEBODY,
            item3 = Items.ZAMORAK_PLATESKIRT, item4 = Items.ZAMORAK_KITESHIELD),
    SARADOMIN_ARMOUR_SET_LG(item = Items.SARADOMIN_ARMOUR_SET_LG, item1 = Items.SARADOMIN_FULL_HELM, item2 = Items.SARADOMIN_PLATEBODY,
            item3 = Items.SARADOMIN_PLATELEGS, item4 = Items.SARADOMIN_KITESHIELD),
    SARADOMIN_ARMOUR_SET_SK(item = Items.SARADOMIN_ARMOUR_SET_SK, item1 = Items.SARADOMIN_FULL_HELM, item2 = Items.SARADOMIN_PLATEBODY,
            item3 = Items.SARADOMIN_PLATESKIRT, item4 = Items.SARADOMIN_KITESHIELD),
    GUTHIX_ARMOUR_SET_LG(item = Items.GUTHIX_ARMOUR_SET_LG, item1 = Items.GUTHIX_FULL_HELM, item2 = Items.GUTHIX_PLATEBODY,
            item3 = Items.GUTHIX_PLATELEGS, item4 = Items.GUTHIX_KITESHIELD),
    GUTHIX_ARMOUR_SET_SK(item = Items.GUTHIX_ARMOUR_SET_SK, item1 = Items.GUTHIX_FULL_HELM, item2 = Items.GUTHIX_PLATEBODY,
            item3 = Items.GUTHIX_PLATESKIRT, item4 = Items.GUTHIX_KITESHIELD),

    /**
     * BARROWS SETS.
     */

    AHRIMS_ARMOUR_SET(item = Items.AHRIMS_ARMOUR_SET, item1 = Items.AHRIMS_HOOD, item2 = Items.AHRIMS_ROBETOP,
            item3 = Items.AHRIMS_ROBESKIRT, item4 = Items.AHRIMS_STAFF),
    DHAROKS_ARMOUR_SET(item = Items.DHAROKS_ARMOUR_SET, item1 = Items.DHAROKS_HELM, item2 = Items.DHAROKS_PLATEBODY,
            item3 = Items.DHAROKS_PLATELEGS, item4 = Items.DHAROKS_GREATAXE),
    GUTHAN_ARMOUR_SET(item = Items.GUTHANS_ARMOUR_SET, item1 = Items.GUTHANS_HELM, item2 = Items.GUTHANS_PLATEBODY,
            item3 = Items.GUTHANS_CHAINSKIRT, item4 = Items.GUTHANS_WARSPEAR),
    KARILS_ARMOUR_SET(item = Items.KARILS_ARMOUR_SET, item1 = Items.KARILS_COIF, item2 = Items.KARILS_LEATHERTOP,
            item3 = Items.KARILS_LEATHERSKIRT, item4 = Items.KARILS_CROSSBOW),
    TORAGS_ARMOUR_SET(item = Items.TORAGS_ARMOUR_SET, item1 = Items.TORAGS_HELM, item2 = Items.TORAGS_PLATEBODY,
            item3 = Items.TORAGS_PLATELEGS, item4 = Items.TORAGS_HAMMERS),
    VERACS_ARMOUR_SET(item = Items.VERACS_ARMOUR_SET, item1 = Items.VERACS_HELM, item2 = Items.VERACS_BRASSARD,
            item3 = Items.VERACS_PLATESKIRT, item4 = Items.VERACS_FLAIL),

    /**
     * GOD DHIDE
     */

    GUTHIX_DRAGONHIDE_SET(item = Items.GUTHIX_DRAGONHIDE_SET, item1 = Items.GUTHIX_COIF, item2 = Items.GUTHIX_DRAGONHIDE,
            item3 = Items.GUTHIX_CHAPS, item4 = Items.GUTHIX_BRACERS),
    SARADOMIN_DRAGONHIDE_SET(item = Items.SARADOMIN_DRAGONHIDE_SET, item1 = Items.SARADOMIN_COIF, item2 = Items.SARADOMIN_DHIDE, 
            item3 = Items.SARADOMIN_CHAPS, item4 = Items.SARADOMIN_BRACERS),
    ZAMORAK_DRAGONHIDE_SET(item = Items.ZAMORAK_DRAGONHIDE_SET, item1 = Items.ZAMORAK_COIF, item2 = Items.ZAMORAK_DHIDE,
            item3 = Items.ZAMORAK_CHAPS, item4 = Items.ZAMORAK_BRACERS),
    ANCIENT_DRAGONHIDE_SET(item = Items.ANCIENT_DRAGONHIDE_SET, item1 = Items.ANCIENT_COIF, item2 = Items.ANCIENT_DHIDE,
            item3 = Items.ANCIENT_CHAPS, item4 = Items.ANCIENT_BRACERS),
    ARMADYL_DRAGONHIDE_SET(item = Items.ARMADYL_DRAGONHIDE_SET, item1 = Items.ARMADYL_COIF, item2 = Items.ARMADYL_DHIDE,
            item3 = Items.ARMADYL_CHAPS, item4 = Items.ARMADYL_BRACERS),
    BANDOS_DRAGONHIDE_SET(item = Items.BANDOS_DRAGONHIDE_SET, item1 = Items.BANDOS_COIF, item2 = Items.BANDOS_DHIDE,
            item3 = Items.BANDOS_CHAPS, item4 = Items.BANDOS_BRACERS),

    /**
     * GOD PAGES
     */

    BOOK_OF_BALANCE_PAGE_SET(item = Items.BOOK_OF_BALANCE_PAGE_SET, item1 = Items.GUTHIX_BALANCE1, item2 = Items.GUTHIX_BALANCE2,
            item3 = Items.GUTHIX_BALANCE3, item4 = Items.GUTHIX_BALANCE4),
    HOLY_BOOK_PAGE_SET(item = Items.HOLY_BOOK_PAGE_SET, item1 = Items.SARADOMIN_PAGE_1, item2 = Items.SARADOMIN_PAGE_2,
            item3 = Items.SARADOMIN_PAGE_3, item4 = Items.SARADOMIN_PAGE_4),
    UNHOLY_BOOK_PAGE_SET(item = Items.UNHOLY_BOOK_PAGE_SET, item1 = Items.ZAMORAK_PAGE_1, item2 = Items.ZAMORAK_PAGE_2,
            item3 = Items.ZAMORAK_PAGE_3, item4 = Items.ZAMORAK_PAGE_4),
    BOOK_OF_DARKNESS_PAGE_SET(item = Items.BOOK_OF_DARKNESS_PAGE_SET, item1 = Items.ANCIENT_PAGE_1, item2 = Items.ANCIENT_PAGE_2,
            item3 = Items.ANCIENT_PAGE_3, item4 = Items.ANCIENT_PAGE_4),
    BOOK_OF_LAW_PAGE_SET(item = Items.BOOK_OF_LAW_PAGE_SET, item1 = Items.ARMADYL_PAGE_1, item2 = Items.ARMADYL_PAGE_2,
            item3 = Items.ARMADYL_PAGE_3, item4 = Items.ARMADYL_PAGE_4),
    BOOK_OF_WAR_PAGE_SET(item = Items.BOOK_OF_WAR_PAGE_SET, item1 = Items.BANDOS_PAGE_1, item2 = Items.BANDOS_PAGE_2,
            item3 = Items.BANDOS_PAGE_3, item4 = Items.BANDOS_PAGE_4),

    /**
     * CANNON SET
     */

    DWARF_CANNON_SET(item = Items.DWARF_CANNON_SET, item1 = Items.CANNON_BASE, item2 = Items.CANNON_STAND,
            item3 = Items.CANNON_BARRELS, item4 = Items.CANNON_FURNACE);
    
    companion object {
        val values = enumValues<fouritemsets>()
    }
}

enum class threeitemsets(val item: Int, val item1: Int, val item2: Int, val item3: Int ) {

    /**
     * TEMPLE KNIGHTS SETS
     */

    INITIATE_HARNESS_M(item = Items.INITIATE_HARNESS_M, item1 = Items.INITIATE_SALLET,
            item2 = Items.INITIATE_HAUBERK, item3 = Items.INITIATE_CUISSE),
    PROSELYTE_HARNESS_M(item = Items.PROSELYTE_HARNESS_M, item1 = Items.PROSELYTE_SALLET,
            item2 = Items.PROSELYTE_HAUBERK, item3 = Items.PROSELYTE_CUISSE),
    PROSELYTE_HARNESS_F(item = Items.PROSELYTE_HARNESS_F, item1 = Items.PROSELYTE_SALLET,
            item2 = Items.PROSELYTE_HAUBERK, item3 = Items.PROSELYTE_TASSET),

    /**
     * DRAGONHIDE SETS
     */

    GREEN_DRAGONHIDE_SET(item = Items.GREEN_DRAGONHIDE_SET, item1 = Items.GREEN_DHIDE_BODY,
            item2 = Items.GREEN_DHIDE_CHAPS, item3 = Items.GREEN_DHIDE_VAMB),
    GILDED_DRAGONHIDE_SET(item = Items.GILDED_DRAGONHIDE_SET, item1 = Items.GILDED_DHIDE_BODY,
            item2 = Items.GILDED_DHIDE_CHAPS, item3 = Items.GILDED_DHIDE_VAMBS),
    BLUE_DRAGONHIDE_SET(item = Items.BLUE_DRAGONHIDE_SET, item1 = Items.BLUE_DHIDE_BODY,
            item2 = Items.BLUE_DHIDE_CHAPS, item3 = Items.BLUE_DHIDE_VAMB),
    RED_DRAGONHIDE_SET(item = Items.RED_DRAGONHIDE_SET, item1 = Items.RED_DHIDE_BODY,
            item2 = Items.RED_DHIDE_CHAPS, item3 = Items.RED_DHIDE_VAMB),
    BLACK_DRAGONHIDE_SET(item = Items.BLACK_DRAGONHIDE_SET, item1 = Items.BLACK_DHIDE_BODY,
            item2 = Items.BLACK_DHIDE_CHAPS, item3 = Items.BLACK_DHIDE_VAMB),

    /**
     * POTION SETS
     */

    COMBAT_POTION_SET(item = Items.COMBAT_POTION_SET, item1 = Items.ATTACK_POTION4,
            item2 = Items.STRENGTH_POTION4, item3 = Items.DEFENCE_POTION4),
    SUPER_POTION_SET(item = Items.SUPER_POTION_SET, item1 = Items.SUPER_ATTACK4,
            item2 = Items.SUPER_STRENGTH4, item3 = Items.SUPER_DEFENCE4),

    /**
     * MISC/COSMETIC SETS
     */

    HALLOWEEN_MASK_SET(item = Items.HALLOWEEN_MASK_SET, item1 = Items.RED_HALLOWEEN_MASK,
            item2 = Items.GREEN_HALLOWEEN_MASK, item3 = Items.BLACK_HWEEN_MASK),
    ANCESTRAL_ROBES_SET(item = Items.ANCESTRAL_ROBES_SET, item1 = Items.ANCESTRAL_HAT,
            item2 = Items.ANCESTRAL_ROBE_TOP, item3 = Items.ANCESTRAL_ROBE_BOTTOM),
    JUSTICIAR_ARMOUR_SET(item = Items.JUSTICIAR_ARMOUR_SET, item1 = Items.JUSTICIAR_FACEGUARD,
            item2 = Items.JUSTICIAR_CHESTGUARD, item3 = Items.JUSTICIAR_LEGGUARDS),
    OBSIDIAN_ARMOUR_SET(item = Items.OBSIDIAN_ARMOUR_SET, item1 = Items.OBSIDIAN_HELMET,
            item2 = Items.OBSIDIAN_PLATEBODY, item3 = Items.OBSIDIAN_PLATELEGS);
       

    companion object {
        val values = enumValues<threeitemsets>()
    }
}

enum class fiveitemsets(val item: Int, val item1: Int, val item2: Int, val item3: Int, val item4: Int, val item5: Int) {

    /**
     * MYSTIC SETS.
     */
    
    MYSTIC_SET_BLUE(item = Items.MYSTIC_SET_BLUE, item1 = Items.MYSTIC_HAT, item2 = Items.MYSTIC_ROBE_TOP,
    item3 = Items.MYSTIC_ROBE_BOTTOM, item4 = Items.MYSTIC_GLOVES, item5 = Items.MYSTIC_BOOTS),
    MYSTIC_SET_LIGHT(item = Items.MYSTIC_SET_LIGHT, item1 = Items.MYSTIC_HAT_LIGHT, item2 = Items.MYSTIC_ROBE_TOP_LIGHT,
    item3 = Items.MYSTIC_ROBE_BOTTOM_LIGHT, item4 = Items.MYSTIC_GLOVES_LIGHT, item5 = Items.MYSTIC_BOOTS_LIGHT),
    MYSTIC_SET_DARK(item = Items.MYSTIC_SET_DARK, item1 = Items.MYSTIC_HAT_DARK, item2 = Items.MYSTIC_ROBE_TOP_DARK,
    item3 = Items.MYSTIC_ROBE_BOTTOM_DARK, item4 = Items.MYSTIC_GLOVES_DARK, item5 = Items.MYSTIC_BOOTS_DARK),
    MYSTIC_SET_DUSK(item = Items.MYSTIC_SET_DUSK, item1 = Items.MYSTIC_HAT_DUSK, item2 = Items.MYSTIC_ROBE_TOP_DUSK,
    item3 = Items.MYSTIC_ROBE_BOTTOM_DUSK, item4 = Items.MYSTIC_GLOVES_DUSK, item5 = Items.MYSTIC_BOOTS_DUSK);


    companion object {
        val values = enumValues<fiveitemsets>()
    }
}

enum class sixitemsets(val item: Int, val item1: Int, val item2: Int, val item3: Int,
                       val item4: Int, val item5: Int, val item6: Int) {

    /**
     * PHAT SET
     */

    PARTYHAT_SET(item = Items.PARTYHAT_SET, item1 = Items.RED_PARTYHAT, item2 = Items.YELLOW_PARTYHAT,
            item3 = Items.BLUE_PARTYHAT, item4 = Items.PURPLE_PARTYHAT, item5 = Items.GREEN_PARTYHAT, item6 = Items.WHITE_PARTYHAT);


    companion object {
        val values = enumValues<sixitemsets>()
    }
}
