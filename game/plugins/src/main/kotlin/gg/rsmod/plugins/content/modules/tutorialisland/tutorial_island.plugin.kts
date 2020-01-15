package gg.rsmod.plugins.content.modules.tutorialisland

import gg.rsmod.game.model.attr.NEW_ACCOUNT_ATTR
import gg.rsmod.game.model.attr.TUTORIAL_CATCH_FISH
import gg.rsmod.game.model.attr.TUTORIAL_STARTED_FISHING
import gg.rsmod.game.model.interf.DisplayMode
import gg.rsmod.game.model.priv.Privilege
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.plugins.content.modules.tutorialisland.events.*
import gg.rsmod.plugins.content.skills.fishing.FishingSpots

//on_login {
//
//    if(player.getVarp(TutorialIsland.COMPLETION_VARP) < 1000 && player.attr[NEW_ACCOUNT_ATTR] == null) {
//        TutorialIsland().process(player)
//        player.playSong(62)
//        player.canDropItems = false
//    }
//
//    val newAccount = player.attr[NEW_ACCOUNT_ATTR] ?: return@on_login
//
//    val tutorial_island_tile = Tile(3094,3107)
//
//    if (newAccount) {
//        player.queue {
//            wait(2)
//            player.moveTo(tutorial_island_tile)
//            player.setComponentText(interfaceId = 239, component = 6, text = "Newbie Melody")
//            player.queue { initTutorialIsland(this) }
//        }
//    }
//}
/*
fun initTutorialIsland(it: QueueTask) {
    val player = it.player

    player.runClientScript(2644)

    player.runClientScript(828, 1)

    // Init base varps
    player.setVarp(281, 0)
    player.setVarp(406,0)

    player.playSong(62)

    player.canDropItems = false

    TutorialIsland().process(player)
}

// Listen for player to start fishing
on_start_fishing(FishingSpots.TUTORIAL_NET.spotEntityId) {
    val started = player.attr[TUTORIAL_STARTED_FISHING]
    if(started == null) {
        player.setStaticDialog("<col=0000ff>Please wait</col><br>Your character is now attempting to catch some shrimp. Sit back for a moment while he does all the hard work.")
        player.attr.put(TUTORIAL_STARTED_FISHING, 1)
    }
}

// Listen for player to catch a shrimp
on_catch_fish(FishingSpots.TUTORIAL_NET.spotEntityId) {
    val catch = player.attr[TUTORIAL_CATCH_FISH]
    if(catch == null) {
        player.attr.put(TUTORIAL_CATCH_FISH, 1)
        player.setVarp(TutorialIsland.COMPLETION_VARP, 50)
        TutorialIsland().process(player)
    }
}

// Listen for clicking options menu
listenTabClick(InterfaceDestination.SETTINGS) {
    println("uuuuhhhh")
    if(player.getVarp(TutorialIsland.COMPLETION_VARP) == 3) {
        player.setVarp(TutorialIsland.COMPLETION_VARP, 7)
        TutorialIsland().process(player)
    }
}

// Listen for clicking inventory
listenTabClick(InterfaceDestination.INVENTORY) {
    if(player.getVarp(TutorialIsland.COMPLETION_VARP) == 30) {
        player.setVarp(TutorialIsland.COMPLETION_VARP, 40)
        TutorialIsland().process(player)
    }
}

// Listen for player to click stats tab
listenTabClick(InterfaceDestination.SKILLS) {
    if(player.getVarp(TutorialIsland.COMPLETION_VARP) == 50) {
        player.setVarp(TutorialIsland.COMPLETION_VARP, 60)
        TutorialIsland().process(player)
    }
}

// Listen for player to click quests tab
listenTabClick(InterfaceDestination.QUEST) {
    if(player.getVarp(TutorialIsland.COMPLETION_VARP) == 230) {
        player.setVarp(TutorialIsland.COMPLETION_VARP, 240)
        TutorialIsland().process(player)
    }
}


////////////////
on_event(ChopTreeEvent::class.java) {
    ChopTreeEvent.execute(player)
}

on_event(TreeCutDownEvent::class.java) {
    TreeCutDownEvent.execute(player)
}

on_event(FireStartedEvent::class.java) {
    FireStartedEvent.execute(player)
}

on_event(CookedShrimpEvent::class.java) {
    CookedShrimpEvent.execute(player)
}

on_event(CreateBreadDoughEvent::class.java) {
    CreateBreadDoughEvent.execute(player)
}

on_event(CookedBreadEvent::class.java) {
    CookedBreadEvent.execute(player)
}




/////////////////

fun listenTabClick(dest: InterfaceDestination, plugin: Plugin.() -> Unit) {
    val parents = intArrayOf(548, 161, 164)

    parents.forEach { parent ->
        val component = when(parent) {
            548 -> TutorialIsland.TAB_CHILD_IDS.get(dest)!!.get(0)
            161 -> TutorialIsland.TAB_CHILD_IDS.get(dest)!!.get(1)
            164 -> TutorialIsland.TAB_CHILD_IDS.get(dest)!!.get(2)
            else -> -1
        }

        on_button(interfaceId = parent, component = component) {
            plugin()
        }
    }
}*/