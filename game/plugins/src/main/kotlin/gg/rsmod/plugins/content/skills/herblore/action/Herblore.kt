package gg.rsmod.plugins.content.skills.herblore.action

import gg.rsmod.game.model.LockState
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.plugins.api.Skills
import gg.rsmod.plugins.api.ext.filterableMessage
import gg.rsmod.plugins.api.ext.player

object Herblore {

    data class HERB(val item: Int, val prefix: String, val xp: Double, val level : Int , val outcome : Int)

    suspend fun cleanherb(it: QueueTask, herb: HERB) {
        if(!canClean(it.player, herb)) {
            return
        }
        val player = it.player
        val inventory = player.inventory
        val removegrimy = inventory.remove(item = herb.item)

        if (removegrimy.hasSucceeded()) {
            inventory.add(herb.outcome)
        }

        player.filterableMessage("You clean the ${herb.prefix}.")

        while(true) {
            player.lock = LockState.DELAY_ACTIONS
            player.addXp(Skills.HERBLORE, herb.xp)
            player.lock = LockState.NONE

            if(!canClean(player, herb)) {
                player.animate(-1)
                break
            }
            player.animate(-1)

            break
        }
        it.wait(1)
    }
}

private fun canClean(player: Player, herb: Herblore.HERB): Boolean {
    if(player.getSkills().getCurrentLevel(Skills.HERBLORE) < herb.level) {
        player.filterableMessage("You need a Herblore level of ${herb.level} to clean ${herb.prefix}.")
        return false
    }

    return true
}

