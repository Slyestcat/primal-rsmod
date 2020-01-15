package gg.rsmod.plugins.content.modules.tutorialisland.events

import gg.rsmod.game.event.Event
import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.api.ext.setVarp
import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

object FireStartedEvent : Event {
    fun execute(player: Player) {
        player.setVarp(TutorialIsland.COMPLETION_VARP, 90)
        TutorialIsland().process(player)
    }
}