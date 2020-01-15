package gg.rsmod.plugins.content.modules.tutorialisland.events

import gg.rsmod.game.event.Event
import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.api.ext.itemMessageBox
import gg.rsmod.plugins.api.ext.setVarp
import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

object CookedBreadEvent : Event {
    fun execute(player: Player) {
        player.queue { itemMessageBox(item = Items.BREAD, message = "You manage to bake some bread.") }
        player.setVarp(TutorialIsland.COMPLETION_VARP, 170)
        TutorialIsland().process(player)
    }
}