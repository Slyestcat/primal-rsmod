package gg.rsmod.plugins.content.admin.items.rotten_potato

import gg.rsmod.game.model.Tile
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.plugins.api.ext.*
import gg.rsmod.plugins.content.combat.isBeingAttacked

class RottenPotatoMenu {
    suspend fun openEatMenu(it: QueueTask) {
        when(it.scrollableOptions(
                "Teleport to Home",
                "Teleport to Jail",
                "Teleport to Player",
                "Teleport Player to me",
                "Teleport to Coordinate",
                "Teleport Player to Coordinate",
                "Teleport Area to Coordinate",
                "Teleport Area to Player",
                "Change Teleport animation", title = "Teleport Menu")) {
            0 -> {
                it.player.moveTo(it.player.world.gameContext.home)
            }

            1 -> {
                val jailTile = Tile(3110,3157,2)
                it.player.moveTo(jailTile)
            }

            2 -> {
                val p = it.inputPlayer("Enter a player name.")
                if(p == null) {
                    it.player.message("<col=ff0000>The player with that name was not found.</col>")
                    return
                }

                it.player.moveTo(p.tile)
            }

            3 -> {
                val p = it.inputPlayer("Enter a player name.")
                if(p == null) {
                    it.player.message("<col=ff0000>The player with that name was not found.</col>")
                    return
                }

                p.moveTo(it.player.tile)
            }

            4 -> {
                val cord = it.inputString("Enter coordinate: (x,z,height)")
                val c = cord.split(",")
                val tile = Tile(c[0].toInt(), c[1].toInt(), c[2].toInt())
                it.player.moveTo(tile)
            }

            5 -> {
                val p = it.inputPlayer("Enter player name.")
                val c = it.inputString("Enter Coordinate: (x,z,height)")
                val tile = Tile(c[0].toInt(), c[1].toInt(), c[2].toInt())
                p!!.moveTo(tile)
                it.player.message("<col=ff0000>You have moved ${p.username} to the entered coordinate.</col>")
            }

            6 -> {
                it.player.message("<col=ff0000>This feature has not been implemented.</col>")
            }

            7 -> {
                it.player.message("<col=ff0000>This feature has not been implemented.</col>")
            }
        }
    }

    fun openSliceMenu(it: QueueTask) {

    }

    fun openPeelMenu(it: QueueTask) {

    }

    fun openMashMenu(it: QueueTask) {

    }

    suspend fun QueueTask.wait_and_check_combat(cycles: Int): Boolean {
        for (i in 0 until cycles) {
            wait(1)
            if (player.isBeingAttacked()) {
                terminate()
                return false
            }
        }
        return true
    }
}