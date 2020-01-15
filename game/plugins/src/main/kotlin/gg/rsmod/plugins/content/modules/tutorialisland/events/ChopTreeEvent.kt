package gg.rsmod.plugins.content.modules.tutorialisland.events

import gg.rsmod.game.event.Event
import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.content.modules.tutorialisland.setStaticDialog

object ChopTreeEvent : Event {
    fun execute(player: Player) {
        player.setStaticDialog("<col=0000ff>Please wait</col><br>Your character is now attempting to cut down the tree. Sit back for a moment while he does all the hard work.")
    }
}