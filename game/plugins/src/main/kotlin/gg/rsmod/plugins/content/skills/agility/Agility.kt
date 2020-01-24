package gg.rsmod.plugins.content.skills.agility

import gg.rsmod.game.model.Tile
import gg.rsmod.game.model.attr.AttributeKey
import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.api.Skills
import gg.rsmod.plugins.api.ext.message

val CROSSING_OBSTACLES_LEFT = AttributeKey<Int>()
val AGILITY_EXPERIENCE_ATTRIBUTE = AttributeKey<Double>()

object Agility {

    data class OBSTACLES(val id: Int, val level: Int, val startAnim: Int, val course: ObstacleData, val startPos: Tile, val endPos: Tile, val cycle1: Int, val cycle2: Int, val option: String, val directionality: Int, val experience: Double, val startCourseObstacle : Boolean , val lastObstacle : Boolean)

    fun crossed(player: Player) {
        val crossingsLeft = player.attr.get(CROSSING_OBSTACLES_LEFT)
        val agilityExperience = player.attr.get(AGILITY_EXPERIENCE_ATTRIBUTE)
        val EXTRA_EXPERENCE_MULTIPLIER = 3

        if (crossingsLeft != null && agilityExperience != null) {
            if (crossingsLeft == 0) {
                val actualExperience = agilityExperience * EXTRA_EXPERENCE_MULTIPLIER
                player.message("Received extra XP for completing the course")
                player.addXp(Skills.AGILITY, actualExperience)
            } else {
                player.message("Did not complete the course yet")
            }
        }
    }
}