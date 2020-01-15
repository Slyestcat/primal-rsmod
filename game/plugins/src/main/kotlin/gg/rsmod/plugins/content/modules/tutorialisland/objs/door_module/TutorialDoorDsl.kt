package gg.rsmod.plugins.content.modules.tutorialisland.objs.door_module

import gg.rsmod.game.model.Tile
import gg.rsmod.game.plugin.KotlinPlugin

fun KotlinPlugin.init_tutorial_door(init: TutorialDoorDsl.Builder.() -> Unit) {
    val builder = TutorialDoorDsl.Builder()
    init(builder)

    TutorialDoorManager.tutorialDoors.add(builder.build())
}

object TutorialDoorDsl {
    @DslMarker
    annotation class TutorialDoorDslMarker

    @TutorialDoorDslMarker
    class Builder {

        private val tutorialdoor = TutorialDoor()

        fun build() = tutorialdoor

        fun config(init: TutorialDoorDsl.ConfigBuilder.() -> Unit) {
            val builder = ConfigBuilder()
            init(builder)

            tutorialdoor.setObj(builder.obj)
            tutorialdoor.setReplacementObj(builder.replaceObj)
            tutorialdoor.setReplacementRot(builder.replaceRot)
            tutorialdoor.setDoorTile(builder.doorTile)
            tutorialdoor.setRequiredVarpState(builder.requiredVarpState)
            tutorialdoor.setTargetTile(builder.targetTile)
            tutorialdoor.setAfterActionVarpState(builder.afterActionVarpState)
        }
    }

    @TutorialDoorDslMarker
    class ConfigBuilder {
        var obj: Int = -1

        var replaceObj: Int = -1

        var replaceRot: Int = 1

        var doorTile: Tile = Tile(0,0,0)

        var requiredVarpState: Int = -1

        var targetTile: Tile = Tile(0,0,0)

        var afterActionVarpState: Int = -1
    }
}