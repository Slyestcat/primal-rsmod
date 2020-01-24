package gg.rsmod.plugins.content.skills.agility

import gg.rsmod.game.model.Direction
import gg.rsmod.game.model.Tile

enum class ObstacleData(val total : Int) {
        AL_KHARID_ROOFTOP(5),
        GNOME(1), // lets test it
        BARBARIAN(5),
        WILDERNESS(5),
        PYRAMID(5)
        // actually wait
}

val obstacles = setOf<Agility.OBSTACLES>(
        Agility.OBSTACLES(id = 23145, level = 1, course = ObstacleData.GNOME, experience = 300.0, startAnim = 762, startPos = Tile(2473, 3436), endPos = (Tile(2473, 3429)), cycle1 = 10, cycle2 = 300, option = "walk-across", directionality = Direction.SOUTH.angle, startCourseObstacle = true, lastObstacle = true)
)