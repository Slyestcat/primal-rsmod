package gg.rsmod.plugins.content.admin.items.rotten_strawberry

import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.plugins.api.ext.player
import gg.rsmod.plugins.api.ext.scrollableOptions

class RottenStrawberryMenu {
    suspend fun openTestMenu(it: QueueTask) {
        val player = it.player
        when(it.scrollableOptions("Test change chatbox icons", title = "Admin test menu")) {
            0 -> {
                player.username = "<img=1> ${player.username}"
            }
        }
    }
}