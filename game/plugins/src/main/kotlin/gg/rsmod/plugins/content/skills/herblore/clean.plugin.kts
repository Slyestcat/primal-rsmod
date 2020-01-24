package gg.rsmod.plugins.content.skills.herblore

import gg.rsmod.plugins.content.skills.herblore.action.Herblore
import gg.rsmod.plugins.content.skills.herblore.data.herbs

herbs.forEach { herb ->

    on_item_option(item = herb.item, option = "clean") {
        player.queue {
            Herblore.cleanherb(this, herb)
        }
    }
}

