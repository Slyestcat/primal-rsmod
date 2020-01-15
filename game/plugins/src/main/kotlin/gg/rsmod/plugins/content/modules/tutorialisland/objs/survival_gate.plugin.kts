package gg.rsmod.plugins.content.modules.tutorialisland.objs

import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

val gate = world.getObject(Tile(3089, 3092, 0), 0)
val ext = world.getObject(Tile(3089, 3091, 0), 0)

val OBJS = intArrayOf(Objs.GATE_9470, Objs.GATE_9708)

OBJS.forEach { obj ->
        on_obj_option(obj, "Open") {
            if(player.getVarp(TutorialIsland.COMPLETION_VARP) == 120) {
            player.queue {
                val new_gate = DynamicObject(1566, 0, 1, Tile(3090, 3092, 0))
                val new_ext = DynamicObject(1565, 0, 1, Tile(3091, 3092))

                val rep_gate = DynamicObject(gate!!, 83)
                val rep_ext = DynamicObject(ext!!, 83)

                world.queue {
                    val old_gate = DynamicObject(9470, 0, 2, Tile(3089, 3092, 0))
                    val old_ext = DynamicObject(9708, 0, 2, Tile(3089, 3091, 0))
                    world.remove(gate)
                    world.remove(ext)
                    world.spawn(rep_gate)
                    world.spawn(rep_ext)
                    world.spawn(new_gate)
                    world.spawn(new_ext)
                    wait(3)
                    world.remove(rep_gate)
                    world.remove(rep_ext)
                    world.remove(new_gate)
                    world.remove(new_ext)
                    world.spawn(old_gate)
                    world.spawn(old_ext)
                }

                val tile = player.tile.transform(-1, 0)
                player.walkTo(tile, MovementQueue.StepType.NORMAL, false)
                player.setVarp(TutorialIsland.COMPLETION_VARP, 130)
                player.setVarp(TutorialIsland.PROGRESS_VARP, 4)
                TutorialIsland().process(player)
            }
        }
    }
}