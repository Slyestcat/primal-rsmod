package gg.rsmod.plugins.content.skills.slayer

import gg.rsmod.plugins.api.cfg.Npcs


/**
 * The master of the assignment.
 * Dictates now many points are awarded upon completion.
 */
enum class AssignmentMaster(val npcId : Int,val pointsRewarded : Int, val pointsRewarded10th : Int, val pointsRewarded50th : Int, val pointsRewarded100th : Int,val pointsRewarded250th : Int, val pointsRewarded1000th : Int, val combatlvl : Int, val slayerlvl : Int) {
    TURAEL(Npcs.TURAEL,0,0,0,0,0,0,1,1),
    MAZCHNA(Npcs.MAZCHNA,2,5,15,50,70,100,20,1),
    VANNAKA(Npcs.VANNAKA,4,20,60,100,140,200,40,1),
    CHAELDAR(Npcs.CHAELDAR,10,50,150,250,350,500,70,1),
    NIEVE(Npcs.STEVE,12,60,180,300,420,600,85,1),
    DURADEL(Npcs.DURADEL,15,75,225,375,525,750,100,50),
    KONAR_QUO_MATEN(Npcs.KONAR_QUO_MATEN,18,90,270,450,630,900,75,1),
    KRYSTILIA(Npcs.KRYSTILIA,25,125,335,625,875,1250,1,1);


}