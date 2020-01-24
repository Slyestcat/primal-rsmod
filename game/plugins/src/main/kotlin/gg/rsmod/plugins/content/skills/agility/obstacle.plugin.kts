package gg.rsmod.plugins.content.skills.agility

obstacles.forEach { agil ->
    on_obj_option(agil.id, agil.option) {
        player.queue {
            if (agil.level > player.getSkills().getCurrentLevel(Skills.AGILITY)) {
                player.message("You need a level off ${agil.level} to access this object")
            } else {
                if (agil.startCourseObstacle) {
                    player.attr.put(CROSSING_OBSTACLES_LEFT, agil.course.total)
                }

                player.lock()
                player.animate(agil.startAnim)
                player.forceMove(this, ForcedMovement.of(agil.startPos, agil.endPos, agil.cycle1, agil.cycle2, agil.directionality))

                if (!agil.lastObstacle)
                    player.addXp(Skills.AGILITY, agil.experience)

                player.unlock()

                var crossingsLeft = player.attr.get(CROSSING_OBSTACLES_LEFT)

                if (crossingsLeft != null) {
                    if (crossingsLeft.minus(1) >= 0) {
                        player.attr.put(CROSSING_OBSTACLES_LEFT, crossingsLeft.minus(1))
                        crossingsLeft = player.attr.get(CROSSING_OBSTACLES_LEFT)

                        if (crossingsLeft == 0 && agil.lastObstacle) {
                            player.attr.put(AGILITY_EXPERIENCE_ATTRIBUTE, agil.experience)
                            Agility.crossed(player)
                        }
                    }
                }

            }
        }
    }
}