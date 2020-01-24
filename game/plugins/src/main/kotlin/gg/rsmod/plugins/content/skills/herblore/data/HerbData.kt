package gg.rsmod.plugins.content.skills.herblore.data

import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.content.skills.herblore.action.Herblore


val herbs = setOf(
        Herblore.HERB(item = Items.GRIMY_GUAM_LEAF, prefix = "guam" , xp = 2.5, level = 1, outcome = Items.GUAM_LEAF),
        Herblore.HERB(item = Items.GRIMY_MARRENTILL, prefix = "marrentill" , xp = 3.8, level = 5, outcome = Items.MARRENTILL),
        Herblore.HERB(item = Items.GRIMY_TARROMIN, prefix = "tarromin" , xp = 5.0, level = 11, outcome = Items.TARROMIN),
        Herblore.HERB(item = Items.GRIMY_HARRALANDER, prefix = "harralander" , xp = 6.3, level = 20, outcome = Items.HARRALANDER),
        Herblore.HERB(item = Items.GRIMY_RANARR_WEED, prefix = "ranarr_weed" , xp = 7.5, level = 25, outcome = Items.RANARR_WEED),
        Herblore.HERB(item = Items.GRIMY_TOADFLAX, prefix = "toadflax" , xp = 8.0, level = 30, outcome = Items.TOADFLAX),
        Herblore.HERB(item = Items.GRIMY_IRIT_LEAF, prefix = "irit_leaf" , xp = 8.8, level = 40, outcome = Items.IRIT_LEAF),
        Herblore.HERB(item = Items.GRIMY_AVANTOE, prefix = "avantoe" , xp = 10.0, level = 48, outcome = Items.AVANTOE),
        Herblore.HERB(item = Items.GRIMY_KWUARM, prefix = "kwuarm" , xp = 11.3, level = 54, outcome = Items.KWUARM),
        Herblore.HERB(item = Items.GRIMY_SNAPDRAGON, prefix = "snapdragon" , xp = 11.8, level = 59, outcome = Items.SNAPDRAGON),
        Herblore.HERB(item = Items.GRIMY_CADANTINE, prefix = "cadantine" , xp = 12.5, level = 65, outcome = Items.CADANTINE),
        Herblore.HERB(item = Items.GRIMY_LANTADYME, prefix = "lantadyme" , xp = 13.1, level = 67, outcome = Items.LANTADYME),
        Herblore.HERB(item = Items.GRIMY_DWARF_WEED, prefix = "dwarf_weed" , xp = 13.8, level = 70, outcome = Items.DWARF_WEED),
        Herblore.HERB(item = Items.GRIMY_TORSTOL, prefix = "torstol" , xp = 13.8, level = 75, outcome = Items.TORSTOL)
)