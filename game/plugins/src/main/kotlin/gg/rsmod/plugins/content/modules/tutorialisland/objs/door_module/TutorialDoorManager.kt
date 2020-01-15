package gg.rsmod.plugins.content.modules.tutorialisland.objs.door_module

import gg.rsmod.game.model.MovementQueue
import gg.rsmod.game.model.entity.DynamicObject
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.plugins.api.ext.getVarp
import gg.rsmod.plugins.api.ext.playSound
import gg.rsmod.plugins.api.ext.player
import gg.rsmod.plugins.api.ext.setVarp
import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

object TutorialDoorManager {
    val tutorialDoors: ArrayList<TutorialDoor> = arrayListOf()

    private val OPEN_DOOR_SFX = 62

    fun openDoor(player: Player, door: TutorialDoor) {
        /**
         * Check if player has [requiredVarpState]
         */
        if(player.getVarp(TutorialIsland.COMPLETION_VARP) != door.getRequiredVarpState()) {
            return
        }

        player.queue { openDoorTask(this, door) }
    }

    private fun openDoorTask(it: QueueTask, door: TutorialDoor) {
        val player = it.player
        val world = it.player.world
        val DOOR = world.getObject(door.getDoorTile(), 0)

        player.playSound(OPEN_DOOR_SFX, 1, 0)

        world.queue {
            val OPEN_DOOR = DynamicObject(door.getReplaceObj(), 0, door.getReplaceRot(), door.getDoorTile())
            world.remove(DOOR!!)
            world.spawn(OPEN_DOOR)
            wait(3)
            val CLOSED_DOOR = DynamicObject(door.getObj(), 0, DOOR.rot, door.getDoorTile())
            world.remove(OPEN_DOOR)
            world.spawn(CLOSED_DOOR)
        }

        player.walkTo(door.getTargetTile(), MovementQueue.StepType.NORMAL, false)
        player.setVarp(TutorialIsland.COMPLETION_VARP, door.getAfterActionVarpState())
        TutorialIsland().process(player)
    }
}