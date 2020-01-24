package gg.rsmod.plugins.content.skills.herblore.data

import gg.rsmod.plugins.api.cfg.Items

enum class PotionData (val id: Int, val firstMaterial: Int, val secondMaterial: Int, val level: Int, val animation: Int, val herbxp: Double) {

    GUAM(id = Items.GUAM_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.GUAM_LEAF,  level = 1, animation = 363 , herbxp = 3.0),
    MARRENTILL(id = Items.MARRENTILL_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.MARRENTILL,  level = 5, animation = 363 , herbxp = 5.0),
    TARROMIN(id = Items.TARROMIN_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.TARROMIN,  level = 12, animation = 363 , herbxp = 12.0),
    HARRALANDER(id = Items.HARRALANDER_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.HARRALANDER,  level = 22, animation = 363 , herbxp = 22.0),
    RANARR(id = Items.RANARR_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.RANARR_WEED,  level = 30, animation = 363 , herbxp = 30.0),
    TOADFLAX(id = Items.TOADFLAX_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.TOADFLAX,  level = 34, animation = 363 , herbxp = 34.0),
    IRIT(id = Items.IRIT_POTION_UNF, firstMaterial = Items.GUAM_POTION_UNF, secondMaterial = Items.IRIT_LEAF,  level = 45, animation = 363 , herbxp = 45.0),
    AVANTOE(id = Items.AVANTOE_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.AVANTOE,  level = 50, animation = 363 , herbxp = 50.0),
    KWUARM(id = Items.KWUARM_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.KWUARM,  level = 55, animation = 363 , herbxp = 55.0),
    SNAPDRAGON(id = Items.SNAPDRAGON_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.SNAPDRAGON,  level = 63, animation = 363 , herbxp = 63.0),
    CADANTINE(id = Items.CADANTINE_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.CADANTINE,  level = 66, animation = 363 , herbxp = 66.0),
    LANTADYME(id = Items.LANTADYME_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.LANTADYME,  level = 69, animation = 363 , herbxp = 69.0),
    DWARF_WEED(id = Items.DWARF_WEED_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.DWARF_WEED,  level = 72, animation = 363 , herbxp = 72.0),
    TORSTOL(id = Items.TORSTOL_POTION_UNF, firstMaterial = Items.VIAL_OF_WATER, secondMaterial = Items.TORSTOL,  level = 78, animation = 363 , herbxp = 78.0),

    //POTS
    ATTACK_POTION3(id = Items.ATTACK_POTION3, firstMaterial = Items.GUAM_POTION_UNF, secondMaterial = Items.EYE_OF_NEWT,  level = 3, animation = 363 , herbxp = 25.0),
    ANTIPOISON3(id = Items.ANTIPOISON3, firstMaterial = Items.MARRENTILL_POTION_UNF, secondMaterial = Items.UNICORN_HORN_DUST,  level = 5, animation = 363 , herbxp = 37.5),
    STRENGTH_POTION3(id = Items.STRENGTH_POTION3, firstMaterial = Items.TARROMIN_POTION_UNF, secondMaterial = Items.LIMPWURT_ROOT,  level = 12, animation = 363 , herbxp = 50.0),
    COMPOST_POTION3(id = Items.COMPOST_POTION3, firstMaterial = Items.HARRALANDER_POTION_UNF, secondMaterial = Items.VOLCANIC_ASH,  level = 22, animation = 363 , herbxp = 60.0),
    RESTORE_POTION3(id = Items.RESTORE_POTION3, firstMaterial = Items.HARRALANDER_POTION_UNF, secondMaterial = Items.RED_SPIDERS_EGGS,  level = 22, animation = 363 , herbxp = 62.5),
    ENERGY_POTION3(id = Items.ENERGY_POTION3, firstMaterial = Items.HARRALANDER_POTION_UNF, secondMaterial = Items.CHOCOLATE_DUST,  level = 26, animation = 363 , herbxp = 67.5),
    DEFENCE_POTION3(id = Items.DEFENCE_POTION3, firstMaterial = Items.RANARR_POTION_UNF, secondMaterial = Items.WHITE_BERRIES,  level = 30, animation = 363 , herbxp = 75.0),
    AGILITY_POTION3(id = Items.AGILITY_POTION3, firstMaterial = Items.TOADFLAX_POTION_UNF, secondMaterial = Items.TOADS_LEGS,  level = 34, animation = 363 , herbxp = 80.0),
    COMBAT_POTION3(id = Items.COMBAT_POTION3, firstMaterial = Items.HARRALANDER_POTION_UNF, secondMaterial = Items.GOAT_HORN_DUST,  level = 36, animation = 363 , herbxp = 84.0),
    PRAYER_POTION3(id = Items.PRAYER_POTION3, firstMaterial = Items.RANARR_POTION_UNF, secondMaterial = Items.SNAPE_GRASS,  level = 38, animation = 363 , herbxp = 87.5),
    SUPER_ATTACK3(id = Items.SUPER_ATTACK3, firstMaterial = Items.IRIT_POTION_UNF, secondMaterial = Items.EYE_OF_NEWT,  level = 45, animation = 363 , herbxp = 100.0),
    SUPERANTIPOISON3(id = Items.SUPERANTIPOISON3, firstMaterial = Items.IRIT_POTION_UNF, secondMaterial = Items.UNICORN_HORN_DUST,  level = 48, animation = 363 , herbxp = 106.3),
    FISHING_POTION3(id = Items.FISHING_POTION3, firstMaterial = Items.AVANTOE_POTION_UNF, secondMaterial = Items.SNAPE_GRASS,  level = 50, animation = 363 , herbxp = 112.5),
    SUPER_ENERGY3(id = Items.SUPER_ENERGY3, firstMaterial = Items.AVANTOE_POTION_UNF, secondMaterial = Items.MORT_MYRE_FUNGUS,  level = 52, animation = 363 , herbxp = 117.5),
    HUNTER_POTION3(id = Items.HUNTER_POTION3, firstMaterial = Items.AVANTOE_POTION_UNF, secondMaterial = Items.KEBBIT_TEETH_DUST,  level = 53, animation = 363 , herbxp = 120.0),
    SUPER_STRENGTH3(id = Items.SUPER_STRENGTH3, firstMaterial = Items.KWUARM_POTION_UNF, secondMaterial = Items.LIMPWURT_ROOT,  level = 55, animation = 363 , herbxp = 125.0),
    WEAPON_POISON3(id = Items.WEAPON_POISON, firstMaterial = Items.KWUARM_POTION_UNF, secondMaterial = Items.DRAGON_SCALE_DUST,  level = 60, animation = 363 , herbxp = 137.5),
    SUPER_RESTORE3(id = Items.SUPER_RESTORE3, firstMaterial = Items.SNAPDRAGON_POTION_UNF, secondMaterial = Items.RED_SPIDERS_EGGS,  level = 63, animation = 363 , herbxp = 142.5),
    SUPER_DEFENCE3(id = Items.SUPER_DEFENCE3, firstMaterial = Items.CADANTINE_POTION_UNF, secondMaterial = Items.WHITE_BERRIES,  level = 66, animation = 363 , herbxp = 150.0),
    ANTIDOTE3(id = Items.ANTIDOTE3, firstMaterial = Items.TOADFLAX_POTION_UNF, secondMaterial = Items.YEW_ROOTS,  level = 68, animation = 363 , herbxp = 155.0),
    ANTIFIRE_POTION3(id = Items.ANTIFIRE_POTION3, firstMaterial = Items.LANTADYME_POTION_UNF, secondMaterial = Items.DRAGON_SCALE_DUST,  level = 69, animation = 363 , herbxp = 157.5),
    RANGING_POTION3(id = Items.RANGING_POTION3, firstMaterial = Items.DWARF_WEED_POTION_UNF, secondMaterial = Items.WINE_OF_ZAMORAK,  level = 72, animation = 363 , herbxp = 162.5),
    MAGIC_POTION3(id = Items.MAGIC_POTION3, firstMaterial = Items.LANTADYME_POTION_UNF, secondMaterial = Items.POTATO_CACTUS,  level = 76, animation = 363 , herbxp = 172.5),
    STAMINA_POTION3(id = Items.STAMINA_POTION3, firstMaterial = Items.SUPER_ENERGY3, secondMaterial = Items.AMYLASE_CRYSTAL,  level = 77, animation = 363 , herbxp = 102.0),
    ZAMORAK_BREW3(id = Items.ZAMORAK_BREW3, firstMaterial = Items.TORSTOL_POTION_UNF, secondMaterial = Items.JANGERBERRIES,  level = 78, animation = 363 , herbxp = 175.0),
    SARADOMIN_BREW3(id = Items.SARADOMIN_BREW3, firstMaterial = Items.TOADFLAX_POTION_UNF, secondMaterial = Items.CRUSHED_NEST,  level = 81, animation = 363 , herbxp = 180.0),
    EXTENDED_ANTIFIRE3(id = Items.EXTENDED_ANTIFIRE3, firstMaterial = Items.ANTIFIRE_POTION3, secondMaterial = Items.LAVA_SCALE_SHARD,  level = 84, animation = 363 , herbxp = 110.0),
    ANTIVENOM3(id = Items.ANTIVENOM3, firstMaterial = Items.ANTIDOTE3, secondMaterial = Items.ZULRAHS_SCALES,  level = 87, animation = 363 , herbxp = 120.0),
    SUPER_ANTIFIRE_POTION3(id = Items.SUPER_ANTIFIRE_POTION3, firstMaterial = Items.ANTIFIRE_POTION3, secondMaterial = Items.CRUSHED_SUPERIOR_DRAGON_BONES,  level = 92, animation = 363 , herbxp = 130.0),
    ANTI_VENOM(id = Items.ANTIVENOM4, firstMaterial = Items.ANTIVENOM3, secondMaterial = Items.TORSTOL,  level = 94, animation = 363 , herbxp = 125.0),
    EXTENDED_SUPER_ANTIFIRE3(id = Items.EXTENDED_SUPER_ANTIFIRE3, firstMaterial = Items.SUPER_ANTIFIRE_POTION3, secondMaterial = Items.LAVA_SCALE_SHARD,  level = 98, animation = 363 , herbxp = 160.0);




    companion object {
        val potionDefinitions = values().associate { it.id to it}
    }

}