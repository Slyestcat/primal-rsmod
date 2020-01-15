package gg.rsmod.plugins.service.sql.models

import org.jetbrains.exposed.sql.*
import java.math.BigInteger

object PlayerModel : Table("Players") {
    //val id = integer("id").autoIncrement().primaryKey()
    val id = long("id").autoIncrement().primaryKey()
    val username = varchar("username", 60).uniqueIndex()
    val displayName = varchar("display_name", 60).uniqueIndex()
    val emailAddress = varchar("emailAddress", 60).nullable()
    val x = integer("position_x")
    val height = integer("position_y")
    val z = integer("position_z")
    val privilege = integer("privilege").default(1)
    val runEnergy = float("run_energy").default(100.toFloat())
    val displayMode = integer("display_mode").default(0)
    val hash = varchar("password_hash", 60)
    val appearanceLooks0 = integer("appearanceLooks0")
    val appearanceLooks1 = integer("appearanceLooks1")
    val appearanceLooks2 = integer("appearanceLooks2")
    val appearanceLooks3 = integer("appearanceLooks3")
    val appearanceLooks4 = integer("appearanceLooks4")
    val appearanceLooks5 = integer("appearanceLooks5")
    val appearanceLooks6 = integer("appearanceLooks6")
    val appearanceColors0 = integer("appearanceColors0")
    val appearanceColors1 = integer("appearanceColors1")
    val appearanceColors2 = integer("appearanceColors2")
    val appearanceColors3 = integer("appearanceColors3")
    val appearanceColors4 = integer("appearanceColors4")
    val appearanceGender = integer("appearanceGender")
    val xteaKeyOne = integer("xtea_one")
    val xteaKeyTwo = integer("xtea_two")
    val xteaKeyThree = integer("xtea_three")
    val xteaKeyFour = integer("xtea_four")
}
