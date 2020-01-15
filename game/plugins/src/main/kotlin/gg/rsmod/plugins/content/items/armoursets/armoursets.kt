package gg.rsmod.plugins.content.items.armoursets

import gg.rsmod.plugins.api.cfg.Items

enum class armoursets(val item: Int, val helmetid: Int, val chestid: Int, val legid: Int,
                      val shieldid: Int) {

    /**
     * Standard PlateMetal.
     */
    IRON_SET_LG(item = Items.IRON_SET_LG, helmetid = Items.IRON_FULL_HELM, chestid = Items.IRON_PLATEBODY, 
            legid = Items.IRON_PLATELEGS, shieldid = Items.IRON_KITESHIELD),
    IRON_SET_SK(item = Items.IRON_SET_SK, helmetid = Items.IRON_FULL_HELM, chestid = Items.IRON_PLATEBODY,
            legid = Items.IRON_PLATESKIRT, shieldid = Items.IRON_KITESHIELD),
    STEEL_SET_LG(item = Items.STEEL_SET_LG, helmetid = Items.STEEL_FULL_HELM, chestid = Items.STEEL_PLATEBODY, 
            legid = Items.STEEL_PLATELEGS, shieldid = Items.STEEL_KITESHIELD),
    STEEL_SET_SK(item = Items.STEEL_SET_SK, helmetid = Items.STEEL_FULL_HELM, chestid = Items.STEEL_PLATEBODY,
            legid = Items.STEEL_PLATESKIRT, shieldid = Items.STEEL_KITESHIELD),
    BLACK_SET_LG(item = Items.BLACK_SET_LG, helmetid = Items.BLACK_FULL_HELM, chestid = Items.BLACK_PLATEBODY, 
            legid = Items.BLACK_PLATELEGS, shieldid = Items.BLACK_KITESHIELD),
    BLACK_SET_SK(item = Items.BLACK_SET_SK, helmetid = Items.BLACK_FULL_HELM, chestid = Items.BLACK_PLATEBODY,
            legid = Items.BLACK_PLATESKIRT, shieldid = Items.BLACK_KITESHIELD),
    MITHRIL_SET_LG(item = Items.MITHRIL_SET_LG, helmetid = Items.MITHRIL_FULL_HELM, chestid = Items.MITHRIL_PLATEBODY, 
            legid = Items.MITHRIL_PLATELEGS, shieldid = Items.MITHRIL_KITESHIELD),
    MITHRIL_SET_SK(item = Items.MITHRIL_SET_SK, helmetid = Items.MITHRIL_FULL_HELM, chestid = Items.MITHRIL_PLATEBODY,
            legid = Items.MITHRIL_PLATESKIRT, shieldid = Items.MITHRIL_KITESHIELD),
    ADAMANT_SET_LG(item = Items.ADAMANT_SET_LG, helmetid = Items.ADAMANT_FULL_HELM, chestid = Items.ADAMANT_PLATEBODY,
            legid = Items.ADAMANT_PLATELEGS, shieldid = Items.ADAMANT_KITESHIELD),
    ADAMANT_SET_SK(item = Items.ADAMANT_SET_SK, helmetid = Items.ADAMANT_FULL_HELM, chestid = Items.ADAMANT_PLATEBODY,
            legid = Items.ADAMANT_PLATESKIRT, shieldid = Items.ADAMANT_KITESHIELD),
    RUNE_ARMOUR_SET_LG(item = Items.RUNE_ARMOUR_SET_LG, helmetid = Items.RUNE_FULL_HELM, chestid = Items.RUNE_PLATEBODY,
            legid = Items.RUNE_PLATELEGS, shieldid = Items.RUNE_KITESHIELD),
    RUNE_ARMOUR_SET_SK(item = Items.RUNE_ARMOUR_SET_SK, helmetid = Items.RUNE_FULL_HELM, chestid = Items.RUNE_PLATEBODY,
            legid = Items.RUNE_PLATESKIRT, shieldid = Items.RUNE_KITESHIELD),
    DRAGON_ARMOUR_SET_LG(item = Items.DRAGON_ARMOUR_SET_LG, helmetid = Items.DRAGON_FULL_HELM, chestid = Items.DRAGON_PLATEBODY,
            legid = Items.DRAGON_PLATELEGS, shieldid = Items.DRAGON_KITESHIELD),
    DRAGON_ARMOUR_SET_SK(item = Items.DRAGON_ARMOUR_SET_SK, helmetid = Items.DRAGON_FULL_HELM, chestid = Items.DRAGON_PLATEBODY,
            legid = Items.DRAGON_PLATESKIRT, shieldid = Items.DRAGON_KITESHIELD),
    /**
     * Trimmed PlateMetal.
     */
    IRON_TRIMMED_SET_LG(item = Items.IRON_TRIMMED_SET_LG, helmetid = Items.IRON_FULL_HELM_T, chestid = Items.IRON_PLATEBODY_T,
            legid = Items.IRON_PLATELEGS_T, shieldid = Items.IRON_KITESHIELD_T),
    IRON_TRIMMED_SET_SK(item = Items.IRON_TRIMMED_SET_SK, helmetid = Items.IRON_FULL_HELM_T, chestid = Items.IRON_PLATEBODY_T,
            legid = Items.IRON_PLATESKIRT_T, shieldid = Items.IRON_KITESHIELD_T),
    STEEL_TRIMMED_SET_LG(item = Items.STEEL_TRIMMED_SET_LG, helmetid = Items.STEEL_FULL_HELM_T, chestid = Items.STEEL_PLATEBODY_T,
            legid = Items.STEEL_PLATELEGS_T, shieldid = Items.STEEL_KITESHIELD_T),
    STEEL_TRIMMED_SET_SK(item = Items.STEEL_TRIMMED_SET_SK, helmetid = Items.STEEL_FULL_HELM_T, chestid = Items.STEEL_PLATEBODY_T,
            legid = Items.STEEL_PLATESKIRT_T, shieldid = Items.STEEL_KITESHIELD_T),
    BLACK_TRIMMED_SET_LG(item = Items.BLACK_TRIMMED_SET_LG, helmetid = Items.BLACK_FULL_HELM_T, chestid = Items.BLACK_PLATEBODY_T,
            legid = Items.BLACK_PLATELEGS_T, shieldid = Items.BLACK_KITESHIELD_T),
    BLACK_TRIMMED_SET_SK(item = Items.BLACK_TRIMMED_SET_SK, helmetid = Items.BLACK_FULL_HELM_T, chestid = Items.BLACK_PLATEBODY_T,
            legid = Items.BLACK_PLATESKIRT_T, shieldid = Items.BLACK_KITESHIELD_T),
    MITHRIL_TRIMMED_SET_LG(item = Items.MITHRIL_TRIMMED_SET_LG, helmetid = Items.MITHRIL_FULL_HELM_T, chestid = Items.MITHRIL_PLATEBODY_T,
            legid = Items.MITHRIL_PLATELEGS_T, shieldid = Items.MITHRIL_KITESHIELD_T),
    MITHRIL_TRIMMED_SET_SK(item = Items.MITHRIL_TRIMMED_SET_SK, helmetid = Items.MITHRIL_FULL_HELM_T, chestid = Items.MITHRIL_PLATEBODY_T,
            legid = Items.MITHRIL_PLATESKIRT_T, shieldid = Items.MITHRIL_KITESHIELD_T),
    ADAMANT_TRIMMED_SET_LG(item = Items.ADAMANT_TRIMMED_SET_LG, helmetid = Items.ADAMANT_FULL_HELM_T, chestid = Items.ADAMANT_PLATEBODY_T,
            legid = Items.ADAMANT_PLATELEGS_T, shieldid = Items.ADAMANT_KITESHIELD_T),
    ADAMANT_TRIMMED_SET_SK(item = Items.ADAMANT_TRIMMED_SET_SK, helmetid = Items.ADAMANT_FULL_HELM_T, chestid = Items.ADAMANT_PLATEBODY_T,
            legid = Items.ADAMANT_PLATESKIRT_T, shieldid = Items.ADAMANT_KITESHIELD_T),
    RUNE_TRIMMED_SET_LG(item = Items.RUNE_TRIMMED_SET_LG, helmetid = Items.RUNE_FULL_HELM_T, chestid = Items.RUNE_PLATEBODY_T,
            legid = Items.RUNE_PLATELEGS_T, shieldid = Items.RUNE_KITESHIELD_T),
    RUNE_TRIMMED_SET_SK(item = Items.RUNE_TRIMMED_SET_SK, helmetid = Items.RUNE_FULL_HELM_T, chestid = Items.RUNE_PLATEBODY_T,
            legid = Items.RUNE_PLATESKIRT_T, shieldid = Items.RUNE_KITESHIELD_T),
    /**
     * GOLD Trimmed PlateMetal.
     */
    IRON_GOLDTRIMMED_SET_LG(item = Items.IRON_GOLDTRIMMED_SET_LG, helmetid = Items.IRON_FULL_HELM_G, chestid = Items.IRON_PLATEBODY_G,
            legid = Items.IRON_PLATELEGS_G, shieldid = Items.IRON_KITESHIELD_G),
    IRON_GOLDTRIMMED_SET_SK(item = Items.IRON_GOLDTRIMMED_SET_SK, helmetid = Items.IRON_FULL_HELM_G, chestid = Items.IRON_PLATEBODY_G,
            legid = Items.IRON_PLATESKIRT_G, shieldid = Items.IRON_KITESHIELD_G),
    STEEL_GOLDTRIMMED_SET_LG(item = Items.STEEL_GOLDTRIMMED_SET_LG, helmetid = Items.STEEL_FULL_HELM_G, chestid = Items.STEEL_PLATEBODY_G,
            legid = Items.STEEL_PLATELEGS_G, shieldid = Items.STEEL_KITESHIELD_G),
    STEEL_GOLDTRIMMED_SET_SK(item = Items.STEEL_GOLDTRIMMED_SET_SK, helmetid = Items.STEEL_FULL_HELM_G, chestid = Items.STEEL_PLATEBODY_G,
            legid = Items.STEEL_PLATESKIRT_G, shieldid = Items.STEEL_KITESHIELD_G),
    BLACK_GOLDTRIMMED_SET_LG(item = Items.BLACK_GOLDTRIMMED_SET_LG, helmetid = Items.BLACK_FULL_HELM_G, chestid = Items.BLACK_PLATEBODY_G,
            legid = Items.BLACK_PLATELEGS_G, shieldid = Items.BLACK_KITESHIELD_G),
    BLACK_GOLDTRIMMED_SET_SK(item = Items.BLACK_GOLDTRIMMED_SET_SK, helmetid = Items.BLACK_FULL_HELM_G, chestid = Items.BLACK_PLATEBODY_G,
            legid = Items.BLACK_PLATESKIRT_G, shieldid = Items.BLACK_KITESHIELD_G),
    MITHRIL_GOLDTRIMMED_SET_LG(item = Items.MITHRIL_GOLDTRIMMED_SET_LG, helmetid = Items.MITHRIL_FULL_HELM_G, chestid = Items.MITHRIL_PLATEBODY_G,
            legid = Items.MITHRIL_PLATELEGS_G, shieldid = Items.MITHRIL_KITESHIELD_G),
    MITHRIL_GOLDTRIMMED_SET_SK(item = Items.MITHRIL_GOLDTRIMMED_SET_SK, helmetid = Items.MITHRIL_FULL_HELM_G, chestid = Items.MITHRIL_PLATEBODY_G,
            legid = Items.MITHRIL_PLATESKIRT_G, shieldid = Items.MITHRIL_KITESHIELD_G),
    ADAMANT_GOLDTRIMMED_SET_LG(item = Items.ADAMANT_GOLDTRIMMED_SET_LG, helmetid = Items.ADAMANT_FULL_HELM_G, chestid = Items.ADAMANT_PLATEBODY_G,
            legid = Items.ADAMANT_PLATELEGS_G, shieldid = Items.ADAMANT_KITESHIELD_G),
    ADAMANT_GOLDTRIMMED_SET_SK(item = Items.ADAMANT_GOLDTRIMMED_SET_SK, helmetid = Items.ADAMANT_FULL_HELM_G, chestid = Items.ADAMANT_PLATEBODY_G,
            legid = Items.ADAMANT_PLATESKIRT_G, shieldid = Items.ADAMANT_KITESHIELD_G),
    RUNE_GOLDTRIMMED_SET_LG(item = Items.RUNE_GOLDTRIMMED_SET_LG, helmetid = Items.RUNE_FULL_HELM_G, chestid = Items.RUNE_PLATEBODY_G,
            legid = Items.RUNE_PLATELEGS_G, shieldid = Items.RUNE_KITESHIELD_G),
    RUNE_GOLDTRIMMED_SET_SK(item = Items.RUNE_GOLDTRIMMED_SET_SK, helmetid = Items.RUNE_FULL_HELM_G, chestid = Items.RUNE_PLATEBODY_G,
            legid = Items.RUNE_PLATESKIRT_G, shieldid = Items.RUNE_KITESHIELD_G),
    GILDED_ARMOUR_SET_LG(item = Items.GILDED_ARMOUR_SET_LG, helmetid = Items.GILDED_FULL_HELM, chestid = Items.GILDED_PLATEBODY,
            legid = Items.GILDED_PLATELEGS, shieldid = Items.GILDED_KITESHIELD),
    GILDED_ARMOUR_SET_SK(item = Items.GILDED_ARMOUR_SET_SK, helmetid = Items.GILDED_FULL_HELM, chestid = Items.GILDED_PLATEBODY,
            legid = Items.GILDED_PLATESKIRT, shieldid = Items.GILDED_KITESHIELD),
    /**
     * GOD PlateMetal.
     */
    BANDOS_RUNE_ARMOUR_SET_LG(item = Items.BANDOS_RUNE_ARMOUR_SET_LG, helmetid = Items.BANDOS_FULL_HELM, chestid = Items.BANDOS_PLATEBODY,
            legid = Items.BANDOS_PLATELEGS, shieldid = Items.BANDOS_KITESHIELD),
    BANDOS_RUNE_ARMOUR_SET_SK(item = Items.BANDOS_RUNE_ARMOUR_SET_SK, helmetid = Items.BANDOS_FULL_HELM, chestid = Items.BANDOS_PLATEBODY,
            legid = Items.BANDOS_PLATESKIRT, shieldid = Items.BANDOS_KITESHIELD),
    ARMADYL_RUNE_ARMOUR_SET_LG(item = Items.ARMADYL_RUNE_ARMOUR_SET_LG, helmetid = Items.ARMADYL_FULL_HELM, chestid = Items.ARMADYL_PLATEBODY,
            legid = Items.ARMADYL_PLATELEGS, shieldid = Items.ARMADYL_KITESHIELD),
    ARMADYL_RUNE_ARMOUR_SET_SK(item = Items.ARMADYL_RUNE_ARMOUR_SET_SK, helmetid = Items.ARMADYL_FULL_HELM, chestid = Items.ARMADYL_PLATEBODY,
            legid = Items.ARMADYL_PLATESKIRT, shieldid = Items.ARMADYL_KITESHIELD),
    ANCIENT_RUNE_ARMOUR_SET_LG(item = Items.ANCIENT_RUNE_ARMOUR_SET_LG, helmetid = Items.ANCIENT_FULL_HELM, chestid = Items.ANCIENT_PLATEBODY,
            legid = Items.ANCIENT_PLATELEGS, shieldid = Items.ANCIENT_KITESHIELD),
    ANCIENT_RUNE_ARMOUR_SET_SK(item = Items.ANCIENT_RUNE_ARMOUR_SET_SK, helmetid = Items.ANCIENT_FULL_HELM, chestid = Items.ANCIENT_PLATEBODY,
            legid = Items.ANCIENT_PLATESKIRT, shieldid = Items.ANCIENT_KITESHIELD),
    ZAMORAK_ARMOUR_SET_LG(item = Items.ZAMORAK_ARMOUR_SET_LG, helmetid = Items.ZAMORAK_FULL_HELM, chestid = Items.ZAMORAK_PLATEBODY,
            legid = Items.ZAMORAK_PLATELEGS, shieldid = Items.ZAMORAK_KITESHIELD),
    ZAMORAK_ARMOUR_SET_SK(item = Items.ZAMORAK_ARMOUR_SET_SK, helmetid = Items.ZAMORAK_FULL_HELM, chestid = Items.ZAMORAK_PLATEBODY,
            legid = Items.ZAMORAK_PLATESKIRT, shieldid = Items.ZAMORAK_KITESHIELD),
    SARADOMIN_ARMOUR_SET_LG(item = Items.SARADOMIN_ARMOUR_SET_LG, helmetid = Items.SARADOMIN_FULL_HELM, chestid = Items.SARADOMIN_PLATEBODY,
            legid = Items.SARADOMIN_PLATELEGS, shieldid = Items.SARADOMIN_KITESHIELD),
    SARADOMIN_ARMOUR_SET_SK(item = Items.SARADOMIN_ARMOUR_SET_SK, helmetid = Items.SARADOMIN_FULL_HELM, chestid = Items.SARADOMIN_PLATEBODY,
            legid = Items.SARADOMIN_PLATESKIRT, shieldid = Items.SARADOMIN_KITESHIELD),
    GUTHIX_ARMOUR_SET_LG(item = Items.GUTHIX_ARMOUR_SET_LG, helmetid = Items.GUTHIX_FULL_HELM, chestid = Items.GUTHIX_PLATEBODY,
            legid = Items.GUTHIX_PLATELEGS, shieldid = Items.GUTHIX_KITESHIELD),
    GUTHIX_ARMOUR_SET_SK(item = Items.GUTHIX_ARMOUR_SET_SK, helmetid = Items.GUTHIX_FULL_HELM, chestid = Items.GUTHIX_PLATEBODY,
            legid = Items.GUTHIX_PLATESKIRT, shieldid = Items.GUTHIX_KITESHIELD),

    /**
     * BARROWS SETS.
     */

    AHRIMS_ARMOUR_SET(item = Items.AHRIMS_ARMOUR_SET, helmetid = Items.AHRIMS_HOOD, chestid = Items.AHRIMS_ROBETOP,
            legid = Items.AHRIMS_ROBESKIRT, shieldid = Items.AHRIMS_STAFF),
    DHAROKS_ARMOUR_SET(item = Items.DHAROKS_ARMOUR_SET, helmetid = Items.DHAROKS_HELM, chestid = Items.DHAROKS_PLATEBODY,
            legid = Items.DHAROKS_PLATELEGS, shieldid = Items.DHAROKS_GREATAXE),
    GUTHAN_ARMOUR_SET(item = Items.GUTHANS_ARMOUR_SET, helmetid = Items.GUTHANS_HELM, chestid = Items.GUTHANS_PLATEBODY,
            legid = Items.GUTHANS_CHAINSKIRT, shieldid = Items.GUTHANS_WARSPEAR),
    KARILS_ARMOUR_SET(item = Items.KARILS_ARMOUR_SET, helmetid = Items.KARILS_COIF, chestid = Items.KARILS_LEATHERTOP,
            legid = Items.KARILS_LEATHERSKIRT, shieldid = Items.KARILS_CROSSBOW),
    TORAGS_ARMOUR_SET(item = Items.TORAGS_ARMOUR_SET, helmetid = Items.TORAGS_HELM, chestid = Items.TORAGS_PLATEBODY,
            legid = Items.TORAGS_PLATELEGS, shieldid = Items.TORAGS_HAMMERS),
    VERACS_ARMOUR_SET(item = Items.VERACS_ARMOUR_SET, helmetid = Items.VERACS_HELM, chestid = Items.VERACS_BRASSARD,
            legid = Items.VERACS_PLATESKIRT, shieldid = Items.VERACS_FLAIL);

    /**
     * MYSTIC SETS.

    MYSTIC_SET_BLUE(item = Items.MYSTIC_SET_BLUE, helmetid = Items.MYSTIC_HAT, chestid = Items.MYSTIC_ROBE_TOP,
            legid = Items.MYSTIC_ROBE_BOTTOM, shieldid = Items.MYSTIC_GLOVES),
    MYSTIC_SET_LIGHT(item = Items.MYSTIC_SET_LIGHT, helmetid = Items.MYSTIC_HAT_LIGHT, chestid = Items.MYSTIC_ROBE_TOP_LIGHT,
            legid = Items.MYSTIC_ROBE_BOTTOM_LIGHT, shieldid = Items.MYSTIC_GLOVES_LIGHT),
    MYSTIC_SET_DARK(item = Items.MYSTIC_SET_DARK, helmetid = Items.MYSTIC_HAT_DARK, chestid = Items.MYSTIC_ROBE_TOP_DARK,
            legid = Items.MYSTIC_ROBE_BOTTOM_DARK, shieldid = Items.MYSTIC_GLOVES_DARK),
    MYSTIC_SET_DUSK(item = Items.MYSTIC_SET_DUSK, helmetid = Items.MYSTIC_HAT_DUSK, chestid = Items.MYSTIC_ROBE_TOP_DUSK,
            legid = Items.MYSTIC_ROBE_BOTTOM_DUSK, shieldid = Items.MYSTIC_GLOVES_DUSK)

     */


    companion object {
        val values = enumValues<armoursets>()
    }
}