package gg.rsmod.plugins.content.modules.tutorialisland.npcs

import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

on_npc_option(Npcs.QUEST_GUIDE, "talk-to") {
    player.queue {
        val state = player.getVarp(TutorialIsland.COMPLETION_VARP)
        if(state == 220) {
            chatNpc(npc = Npcs.QUEST_GUIDE, title = "Quest Guide", animation = 589, message = "Ah. Welcome, adventurer. I'm here to tell you all about<br>quests. Let's start by opening your quest journal.")
            player.setVarp(TutorialIsland.COMPLETION_VARP, 230)
            TutorialIsland().process(player)
        }

        if(state == 240) {
            chatAboutQuests(this)
            player.setVarp(TutorialIsland.COMPLETION_VARP, 250)
            TutorialIsland().process(player)
        }

        if(state >= 250) {
            chatNpc(npc = Npcs.QUEST_GUIDE, title = "Quest Guid", animation = 554, message = "Would you like to hear about quests again?")
            when(options("Yes!", "Nope, I'm ready to move on!", title = "Select an Option")) {
                1 -> {
                    chatPlayer("Yes!")
                    chatAboutQuests(this)
                }

                2 -> {
                    chatPlayer("Nope, I'm ready to move on!")
                }
            }
        }
    }
}

suspend fun chatAboutQuests(it: QueueTask) {
    it.chatNpc(npc = Npcs.QUEST_GUIDE, title = "Quest Guide", animation = 591, message = "When you start a quest it will change colour to yellow.<br>Once you've finished it, it will change to green. This is<br>so you can easily see what's complete, what's started,<br>and what's left to begin.")
    it.chatNpc(npc = Npcs.QUEST_GUIDE, title = "Quest Guide", animation = 591, message = "Clicking a quest in the journal will display some more<br>information on it. If you haven't started the quest, it<br>will tell you where to begin and what requirements you<br>need.")
    it.chatNpc(npc = Npcs.QUEST_GUIDE, title = "Quest Guide", animation = 589, message = "If the quest is in progress, it will remind you what to<br>do next.")
    it.chatNpc(npc = Npcs.QUEST_GUIDE, title = "Quest Guide", animation = 590, message = "It's very easy to find quest start points. Just look out<br>for the quest icon on your minimap. You should see<br>one marking this house.")
    it.chatNpc(npc = Npcs.QUEST_GUIDE, title = "Quest Guide", animation = 591, message = "The quests themselves can vary greatly from collecting<br>beads to hunting down dragons. Completing quests will<br>reward you with all sorts of things, such as new areas<br>and better weapons!")
    it.chatNpc(npc = Npcs.QUEST_GUIDE, title = "Quest Guide", animation = 591, message = "here's not a lot more I can tell you about questing.<br>You have to experience the thrill of it yourself to fully<br>understand. Let me know if you want a recap,<br>otherwise you can move on.")
}