package gg.rsmod.plugins.content.modules.tutorialisland.npcs

import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

on_npc_option(Npcs.SURVIVAL_EXPERT, "talk-to") {
    player.queue(TaskPriority.WEAK) {
        val player = this.player
        val complete = player.getVarp(TutorialIsland.COMPLETION_VARP)

        if(complete == 20) {
            chatNpc(npc = Npcs.SURVIVAL_EXPERT, title = "Survival Expert", message = "Hello there, newcomer. My name is Brynna. My job is<br>to teach you about the skills you can use to survive in<br>this world.")
            chatNpc(npc = Npcs.SURVIVAL_EXPERT, title = "Survival Expert", message = "The first skill we're going to look at is Fishing. There's<br>some shrimp in this pond here. Let's try and catch<br>some.")

            itemMessageBox(item = Items.SMALL_FISHING_NET, message = "The survival expert gives you a <col=000080>small fishing net<col=000000>.")

            player.inventory.add(Items.SMALL_FISHING_NET, 1)

            player.setVarp(TutorialIsland.COMPLETION_VARP, 30)
            TutorialIsland().process(player)
        }

        if(complete < 60) {
            chatNpc(npc = Npcs.SURVIVAL_EXPERT, title = "Survival Expert", message = "The first skill we're going to look at is Fishing. There's<br>some shrimp in this pond here. Let's try and catch<br>some.")
        }

        if(complete == 60) {
            chatPlayer(message = "I've managed to catch some shrimp.")
            chatNpc(npc = Npcs.SURVIVAL_EXPERT, title = "Survival Expert", message = "Excellent work. Now that you have some shrimp, you're<br>going to want to cook them. To do that, you'll need a<br>fire. This brings us on to the Woodcutting and<br>Firemaking skills.")

            player.setVarp(TutorialIsland.COMPLETION_VARP, 70)
            player.inventory.add(Items.BRONZE_AXE, 1)
            player.inventory.add(Items.TINDERBOX, 1)

            itemMessageBox(item = Items.BRONZE_AXE, message = "The survival expert gives you a <col=000080>bronze axe<col=000000> and a<br><col=000000><col=000080>tinderbox<col=000000>.")

            TutorialIsland().process(player)
        }
    }
}