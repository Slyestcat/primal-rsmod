package gg.rsmod.plugins.content.modules.tutorialisland.npcs

import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

/**
 * Chat progression with the gielinor guide in the first room of
 * tutorial island.
 * Reliving this make me so nostalgic
 */

on_npc_option(Npcs.GIELINOR_GUIDE, "talk-to") {
    player.queue(TaskPriority.WEAK) {
        if(player.getVarp(TutorialIsland.COMPLETION_VARP) < 7) {
            this.chatNpc(npc = Npcs.GIELINOR_GUIDE, title = "Gielinor Guide", message = "Greetings! I see you are a new arrival to the world of Gielinor. My job is to welcome all new visitors. So welcome!")

            this.chatNpc(npc = Npcs.GIELINOR_GUIDE, title = "Gielinor Guide", message = "You have already learned the first thing needed to succeed in this world: talking to other people!")

            this.chatNpc(npc = Npcs.GIELINOR_GUIDE, title = "Gielinor Guide", message = "You will find many inhabitants of this world have useful things to say to you. By clicking on them you can talk to them.")

            if(player.getVarp(TutorialIsland.COMPLETION_VARP) < 3) {
                this.chatNpc(npc = Npcs.GIELINOR_GUIDE, title = "Gielinor Guide", message = "Before we get going, if you could be so kind to let me know how much experience you have with Old School Runescape, that would be wonderful!")

                this.chatNpc(message = "To answer, simply click your chosen answer on the following screen.")

                val playerExperience = when (this.options("I am brand new! This is my first time here.", "I've played in the past, but not recently.", "I am an experienced player.", title = "What's your experience with Old School Runescape?")) {
                    1 -> {
                        this.chatPlayer(title = this.player.username, message = "I am brand new! This is my first time here.")
                    }

                    2 -> {
                        this.chatPlayer(title = this.player.username, message = "I've played in the past, but not recently.")
                    }

                    3 -> {
                        this.chatPlayer(title = this.player.username, message = "I am an experienced player.")
                    }
                    else -> {
                    }
                }

                player.setVarp(TutorialIsland.COMPLETION_VARP, 3)
            }

            if(player.getVarp(TutorialIsland.COMPLETION_VARP) == 3) {
                this.chatNpc(npc = Npcs.GIELINOR_GUIDE, title = "Gielinor Guide", message = "Now then, let's start by looking at your options menu.")
                TutorialIsland().process(player)
            }
        }

        if(player.getVarp(TutorialIsland.COMPLETION_VARP) == 7) {
            this.chatNpc(npc = Npcs.GIELINOR_GUIDE, title = "Gielinor Guide", message = "Looks like you're making good progress! The menu<br>you've just opened is one of many. You'll learn about<br>the rest as you progress through the tutorial.")

            player.setVarp(TutorialIsland.COMPLETION_VARP, 10)

            this.chatNpc(npc = Npcs.GIELINOR_GUIDE, title= "Gielinor Guide", message = "Anyway, I'd say it's time for you to go and meet your<br>first instructor!")

            TutorialIsland().process(player)
            player.closeInputDialog()
        }

        if(player.getVarp(TutorialIsland.COMPLETION_VARP) == 10) {
            this.chatNpc(npc = Npcs.GIELINOR_GUIDE, title = "Gielinor Guide", message = "To continue the tutorial go through that door over there and speak to your first instructor!")
        }
    }
}