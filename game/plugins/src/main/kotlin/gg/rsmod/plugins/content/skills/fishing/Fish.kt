package gg.rsmod.plugins.content.skills.fishing

import gg.rsmod.plugins.api.cfg.Items

enum class Fish(val fishItem: Int, val level: Int, val xp: Double) {
    SHRIMP(Items.RAW_SHRIMPS, 1, 10.0),
    ANCHOVIES(Items.RAW_ANCHOVIES, 15, 40.0),
    SARDINE(Items.RAW_SARDINE, 5, 20.0),
    HERRING(Items.RAW_HERRING, 10, 30.0)
}