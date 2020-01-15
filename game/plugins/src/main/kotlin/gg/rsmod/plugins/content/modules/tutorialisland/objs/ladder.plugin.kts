package gg.rsmod.plugins.content.modules.tutorialisland.objs

import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

on_obj_option(Objs.LADDER_9726, "climb-down") {
    if(player.getVarp(TutorialIsland.COMPLETION_VARP) == 250) {
        player.queue {
            player.animate(827)
            wait(3)
            player.moveTo(Tile(3088, 9520, 0))
            player.animate(-1)
            player.setVarp(TutorialIsland.COMPLETION_VARP, 260)
            TutorialIsland().process(player)
        }
    }
}