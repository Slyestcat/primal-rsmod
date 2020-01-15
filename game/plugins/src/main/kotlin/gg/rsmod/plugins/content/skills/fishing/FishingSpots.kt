package gg.rsmod.plugins.content.skills.fishing

import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.api.cfg.Npcs

enum class FishingSpots(val spotEntityId: Int, val option: String, val toolId: Int, val baitId: Int, val animation: Int, vararg fish: Fish) {
    TUTORIAL_NET(Npcs.FISHING_SPOT_3317, "net", Items.SMALL_FISHING_NET, -1, 621, Fish.SHRIMP),
    NET(Npcs.FISHING_SPOT_1530, "net", Items.SMALL_FISHING_NET, -1, 621, Fish.SHRIMP, Fish.ANCHOVIES),
    BAIT(Npcs.FISHING_SPOT_1530, "bait", Items.FISHING_ROD, Items.FISHING_BAIT, 622, Fish.SARDINE, Fish.HERRING);

    private val fish = fish

    fun getFish(): Array<out Fish> { return this.fish
    }
}