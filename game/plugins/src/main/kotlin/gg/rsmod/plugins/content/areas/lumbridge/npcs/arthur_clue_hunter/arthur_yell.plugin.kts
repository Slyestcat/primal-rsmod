package gg.rsmod.plugins.content.areas.lumbridge.npcs.arthur_clue_hunter

val YELL_TIMER = TimerKey()

val YELLS = hashMapOf<Int, String>(
        Pair(2113, "Hmm.... What could this mean?"),
        Pair(4276, "I've got it!"),
        Pair(4278, "Why is this so hard..."),
        Pair(2109, "I'm going to be rich!")
)

val NPCS = intArrayOf(Npcs.ARTHUR_THE_CLUE_HUNTER)

NPCS.forEach { npcId ->
    on_npc_spawn(npcId) {
        val npcObj = npc
        npcObj.timers[YELL_TIMER] = world.random(15..25)
    }
}

on_timer(YELL_TIMER) {
    val npc = npc
    val yellArray = ArrayList<Int>(YELLS.keys)
    val random = (0..(yellArray.size-1)).random()
    val yell = YELLS.get(yellArray.get(random))
    npc.animate(yellArray.get(random))
    npc.forceChat(yell!!)
    npc.timers[YELL_TIMER] = world.random(15..25)
}