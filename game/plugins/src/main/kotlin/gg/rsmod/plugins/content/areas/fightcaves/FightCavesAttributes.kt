package gg.rsmod.plugins.content.areas.fightcaves

import gg.rsmod.game.model.attr.AttributeKey
import gg.rsmod.game.model.entity.Npc
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.timer.TimerKey
import gg.rsmod.plugins.api.cfg.Npcs

/**
 * @author: Movee
 * FightCavesAttributes.kt
 */

val DEFAULT_WAVE_START = 0

val TZ_KIH = Npcs.TZKIH

val TZ_KEK = Npcs.TZKEK_3119

val TZ_KEK_2 = Npcs.TZKEK_3120

val TOK_XIL = Npcs.TOKXIL_3121

val TOK_XIL_SPAWN = Npcs.TOKXIL_3122

val YT_MEJKOT = Npcs.YTMEJKOT

val YT_MEJKOT_SPAWN = Npcs.YTMEJKOT_3124

val KET_ZEK = Npcs.KETZEK

val KET_ZEK_SPAWN = Npcs.KETZEK_3126

val TZTOK_JAD = Npcs.TZTOKJAD

val waveNpcs = arrayOf(intArrayOf(TZ_KIH), intArrayOf(TZ_KIH, TZ_KIH), intArrayOf(TZ_KEK), intArrayOf(TZ_KEK, TZ_KIH), intArrayOf(TZ_KEK, TZ_KIH, TZ_KIH), intArrayOf(TZ_KEK, TZ_KEK), intArrayOf(TOK_XIL), intArrayOf(TOK_XIL, TZ_KIH), intArrayOf(TOK_XIL, TZ_KIH, TZ_KIH), intArrayOf(TOK_XIL, TZ_KEK), intArrayOf(TOK_XIL, TZ_KEK, TZ_KIH), intArrayOf(TOK_XIL, TZ_KEK, TZ_KIH, TZ_KIH), intArrayOf(TOK_XIL, TZ_KEK, TZ_KEK), intArrayOf(TOK_XIL, TOK_XIL_SPAWN), intArrayOf(YT_MEJKOT), intArrayOf(YT_MEJKOT, TZ_KIH), intArrayOf(YT_MEJKOT, TZ_KIH, TZ_KIH), intArrayOf(YT_MEJKOT, TZ_KEK), intArrayOf(YT_MEJKOT, TZ_KEK, TZ_KIH), intArrayOf(YT_MEJKOT, TZ_KEK, TZ_KIH, TZ_KIH), intArrayOf(YT_MEJKOT, TZ_KEK, TZ_KEK), intArrayOf(YT_MEJKOT, TOK_XIL), intArrayOf(YT_MEJKOT, TOK_XIL, TZ_KIH), intArrayOf(YT_MEJKOT, TOK_XIL, TZ_KIH, TZ_KIH), intArrayOf(YT_MEJKOT, TOK_XIL, TZ_KEK), intArrayOf(YT_MEJKOT, TOK_XIL, TZ_KEK, TZ_KIH), intArrayOf(YT_MEJKOT, TOK_XIL, TZ_KEK, TZ_KIH, TZ_KIH), intArrayOf(YT_MEJKOT, TOK_XIL, TZ_KEK, TZ_KEK), intArrayOf(YT_MEJKOT, TOK_XIL, TOK_XIL), intArrayOf(YT_MEJKOT, YT_MEJKOT_SPAWN), intArrayOf(KET_ZEK), intArrayOf(KET_ZEK, TZ_KIH), intArrayOf(KET_ZEK, TZ_KIH, TZ_KIH), intArrayOf(KET_ZEK, TZ_KEK), intArrayOf(KET_ZEK, TZ_KEK, TZ_KIH), intArrayOf(KET_ZEK, TZ_KEK, TZ_KIH, TZ_KIH), intArrayOf(KET_ZEK, TZ_KEK, TZ_KEK), intArrayOf(KET_ZEK, TOK_XIL), intArrayOf(KET_ZEK, TOK_XIL, TZ_KIH), intArrayOf(KET_ZEK, TOK_XIL, TZ_KIH, TZ_KIH), intArrayOf(KET_ZEK, TOK_XIL, TZ_KEK), intArrayOf(KET_ZEK, TOK_XIL, TZ_KEK, TZ_KIH), intArrayOf(KET_ZEK, TOK_XIL, TZ_KEK, TZ_KIH, TZ_KIH), intArrayOf(KET_ZEK, TOK_XIL, TZ_KEK, TZ_KEK), intArrayOf(KET_ZEK, TOK_XIL, TOK_XIL), intArrayOf(KET_ZEK, YT_MEJKOT), intArrayOf(KET_ZEK, YT_MEJKOT, TZ_KIH), intArrayOf(KET_ZEK, YT_MEJKOT, TZ_KIH, TZ_KIH), intArrayOf(KET_ZEK, YT_MEJKOT, TZ_KEK), intArrayOf(KET_ZEK, YT_MEJKOT, TZ_KEK, TZ_KIH), intArrayOf(KET_ZEK, YT_MEJKOT, TZ_KEK, TZ_KIH, TZ_KIH), intArrayOf(KET_ZEK, YT_MEJKOT, TZ_KEK, TZ_KEK), intArrayOf(KET_ZEK, YT_MEJKOT, TOK_XIL), intArrayOf(KET_ZEK, YT_MEJKOT, TOK_XIL, TZ_KIH), intArrayOf(KET_ZEK, YT_MEJKOT, TOK_XIL, TZ_KIH, TZ_KIH), intArrayOf(KET_ZEK, YT_MEJKOT, TOK_XIL, TZ_KEK), intArrayOf(KET_ZEK, YT_MEJKOT, TOK_XIL, TZ_KEK, TZ_KIH), intArrayOf(KET_ZEK, YT_MEJKOT, TOK_XIL, TZ_KEK, TZ_KIH, TZ_KIH), intArrayOf(KET_ZEK, YT_MEJKOT, TOK_XIL, TZ_KEK, TZ_KEK), intArrayOf(KET_ZEK, YT_MEJKOT, TOK_XIL, TOK_XIL), intArrayOf(KET_ZEK, YT_MEJKOT, YT_MEJKOT), intArrayOf(KET_ZEK, KET_ZEK_SPAWN), intArrayOf(TZTOK_JAD))

val SOUTH_WEST = intArrayOf(2381, 5071)

val SOUTH_EAST = intArrayOf(2419, 5083)

val SOUTH = intArrayOf(2403, 5075)

val CENTRE = intArrayOf(2398, 5089)

val NORTH_WEST = intArrayOf(2382, 5105)

val IN_FIGHTCAVES = AttributeKey<Boolean>("INFIGHTCAVES")

val STARTED_FIGHTCAVES = AttributeKey<Boolean>("STARTEDFIGHTCAVES")

val FIGHTCAVES_WAVE = AttributeKey<Int>("FIGHTCAVESWAVE")

val FIGHTCAVES_BOTTOMLEFT_X = AttributeKey<Int>("FIGHTCAVESLASTX")

val FIGHTCAVES_BOTTOMLEFT_Z = AttributeKey<Int>("FIGHTCAVESLASTZ")

val FIGHTCAVES_NPC_SPAWNINDEX = AttributeKey<Int>("FIGHTCAVENPCSPAWNINDEX")

val FIGHTCAVES_NPC_ARRAYLIST = AttributeKey<ArrayList<Int>>("FIGHTCAVENPCARRAYLIST")

val FIGHTCAVES_HEALERS_RESPAWN = AttributeKey<Boolean>()

val FIGHTCAVES_HEALERS_JAD = AttributeKey<Npc>()

val FIGHTCAVES_HEALERS_TARGET = AttributeKey<Player>()

val FIGHTCAVES_JAD_ASSIGNED_HEALERS = AttributeKey<ArrayList<Npc>>()

val SAVE_COORDINATES_TIMER = TimerKey()

val SAVE_COORDINATES_TIMER_DELAY = 3

val HEALER_TIMER = TimerKey()

val HEALERS_WALK_TIMER = TimerKey()

val HEALER_TIMER_DELAY = 3

val spawnCoordinates = arrayOf(SOUTH_EAST, SOUTH_WEST, CENTRE, NORTH_WEST, SOUTH_WEST, SOUTH_EAST, SOUTH, NORTH_WEST, CENTRE, SOUTH_EAST, SOUTH_WEST, SOUTH, NORTH_WEST, CENTRE, SOUTH)
