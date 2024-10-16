package gg.rsmod.plugins.service.sql.models

import org.jetbrains.exposed.sql.*

object SkillModel : Table("Skills") {
    val id = integer("id").autoIncrement().primaryKey()
    val playerId = (long("player_id") references PlayerModel.id).nullable()
    val skill = integer("skill_id")
    val xp = float("xp").default(0.toFloat())
    val lvl = integer("lvl").default(3)
}
