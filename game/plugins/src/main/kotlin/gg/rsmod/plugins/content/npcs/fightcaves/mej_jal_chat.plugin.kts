package gg.rsmod.plugins.content.npcs.fightcaves

/**
 * Tzhaar Mej Jal Chat Plugin
 *
 * mej_jal_chat.plugin.kts
 * @author: Movee
 */

suspend fun npcDialogue(it: QueueTask) {
    it.chatNpc("I am the guardian of these Fight caves, can I help you JalYt?")
    when(it.options( "How many waves are the Fight caves?", "Can I sell you a firecape?", "Nevermind", title = "Select an option")) {
        1 -> {
            it.chatPlayer("How many waves are the Fight caves?")
            it.chatNpc("There are 63 waves in the Fight caves.")
        }

        2 -> {
            if(it.player.inventory.contains(Items.FIRE_CAPE)) {
                when(it.options( "Sell your firecape 8000 tokkul", "Nevermind", title = "Select an option")) {
                    1 -> {
                        it.player.inventory.remove(Items.FIRE_CAPE)
                        it.player.inventory.remove(Items.TOKKUL, 8000)
                        it.player.message("You have sold your firecape.")
                    }
                }
            } else {
                it.chatPlayer("Can I sell you a firecape?")
                it.chatNpc("You could, but you don't have a firecape to sell me!")
            }
        }
    }
}

spawn_npc(Npcs.TZHAARMEJJAL, 2440,5168,0,1, Direction.NORTH)

on_npc_option(Npcs.TZHAARMEJJAL, "Talk to") {
    player.queue { npcDialogue(this) }
}

on_npc_option(Npcs.TZHAARMEJJAL, "Exchange fire cape") {
    if(player.inventory.contains(Items.FIRE_CAPE)) {
        player.inventory.remove(Items.FIRE_CAPE)

        val PROBABILITY_FOR_PET = 200

        if(world.chance(1, PROBABILITY_FOR_PET)) {
            // GIVE PET
        }

    } else {
        player.message("You do not have a fire cape to exchange!")
    }
}