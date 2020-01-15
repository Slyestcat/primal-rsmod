package gg.rsmod.plugins.content.items.armoursets

import gg.rsmod.plugins.api.cfg.Items

enum class armoursets(val item: Int, val helmetid: Int, val chestid: Int, val legid: Int,
                      val shieldid: Int) {

    /**
     * Sea food.
     */
    IRON_SET_LG(item = Items.IRON_SET_LG, helmetid = 1153, chestid = 1115, legid = 1067, shieldid = 1191),
    IRON_SET_SK(item = Items.IRON_SET_SK, helmetid = 1153, chestid = 1115, legid = 1081, shieldid = 1191);


    companion object {
        val values = enumValues<armoursets>()
    }
}