package gg.rsmod.plugins.content.modules.tutorialisland

import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.queue.TaskPriority
import gg.rsmod.plugins.api.InterfaceDestination
import gg.rsmod.plugins.api.ext.*

fun Player.openChangeDisplayNameInterface() {
    val player = this
    player.runClientScript(2234, 400,400)
    player.openInterface(dest = InterfaceDestination.MAIN_SCREEN, interfaceId = 558)

    player.runClientScript(1974, "<col=0000ff>Choosing a Display Name</col><br>Before you get started, you'll need to pick a unique display name. Please follow the instructions on the open interface to set your name.")

    player.runClientScript(2014, 0, 0, 0, 0, 0, 0)
    player.runClientScript(2015,0)
}

fun Player.setStaticDialog(message: String) {
    this.queue(TaskPriority.WEAK) {
        this.player.openInterface(parent = 162, child = 560, interfaceId = 263, isModal = false)
        this.player.runClientScript(1974, message)
    }
}