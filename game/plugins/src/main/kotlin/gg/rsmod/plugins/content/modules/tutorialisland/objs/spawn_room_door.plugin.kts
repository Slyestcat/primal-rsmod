package gg.rsmod.plugins.content.modules.tutorialisland.objs

import gg.rsmod.game.model.entity.DynamicObject
import gg.rsmod.game.model.queue.TaskPriority
import gg.rsmod.plugins.api.ext.getInteractingGameObj
import gg.rsmod.plugins.api.ext.getVarp
import gg.rsmod.plugins.api.ext.player
import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

val DOOR_CLOSED = 9398
val DOOR_OPEN = 1539

on_obj_option(DOOR_CLOSED, "open") {
    val obj = player.getInteractingGameObj()

    if(player.getVarp(TutorialIsland.COMPLETION_VARP) >= 10) {
        player.queue(TaskPriority.STRONG) {

            world.queue {
                val open = DynamicObject(DOOR_OPEN, 0, 1, obj.tile)
                world.remove(obj)
                world.spawn(open)
                wait(2)
                world.remove(open)
                world.spawn(DynamicObject(obj))
            }

            player.playSound(62,1,0)

            player.walkTo(this, 3098,3107,MovementQueue.StepType.NORMAL, false)
            player.setVarp(TutorialIsland.COMPLETION_VARP, 20)
            player.setVarp(TutorialIsland.PROGRESS_VARP, 2)
            TutorialIsland().process(player)
        }
    }
}
