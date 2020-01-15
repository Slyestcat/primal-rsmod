package gg.rsmod.plugins.content.modules.tutorialisland.objs.door_module

TutorialDoorManager.tutorialDoors.forEach { door ->
    on_obj_option(door.getObj(), "open") {
        TutorialDoorManager.openDoor(player, door)
    }
}