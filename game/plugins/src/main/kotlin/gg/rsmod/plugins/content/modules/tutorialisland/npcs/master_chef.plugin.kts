package gg.rsmod.plugins.content.modules.tutorialisland.npcs

import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

on_npc_option(Npcs.MASTER_CHEF, "talk-to") {
    player.queue {
        val state = player.getVarp(TutorialIsland.COMPLETION_VARP)
        if(state == 140) {
            chatNpc(npc = Npcs.MASTER_CHEF, title = "Master Chef", message = "Ah! Welcome, newcomer. I am the Master Chef, Lev. It<br>is here that I will teach you how to cook food truly fit<br>for a king.")
            chatPlayer(message = "I already know how to cook. Brynna taught me just<br>now.", animation = 607)
            chatNpc(npc = Npcs.MASTER_CHEF, title = "Master Chef", animation = 607, message = "Hahahahahaha! You call THAT cooking? Some shrimp<br>on an open log fire? Oh, no, no, no. I am going to<br>teach you the fine art of cooking bread.")

            player.setVarp(TutorialIsland.COMPLETION_VARP, 150)
            player.inventory.add(Items.POT_OF_FLOUR, 1)
            player.inventory.add(Items.BUCKET_OF_WATER, 1)

            itemMessageBox(item = Items.POT_OF_FLOUR, message = "The master chef gives you some <col=000080>flour<col=000000> and some <col=000080>water<col=000000>.")
            TutorialIsland().process(player)
        }

        else {
            checkForRequiredItems(player)
        }
    }
}

fun checkForRequiredItems(player: Player) {
    if(!player.inventory.contains(Items.POT_OF_FLOUR) || !player.inventory.contains(Items.BUCKET_OF_WATER)) {
        player.queue {
            player.inventory.add(Items.POT_OF_FLOUR, 1)
            player.inventory.add(Items.BUCKET_OF_WATER, 1)

            itemMessageBox(item = Items.POT_OF_FLOUR, message = "The master chef gives you some <col=000080>flour<col=000000> and some <col=000080>water<col=000000>.")
            TutorialIsland().process(player)
        }
    }
}