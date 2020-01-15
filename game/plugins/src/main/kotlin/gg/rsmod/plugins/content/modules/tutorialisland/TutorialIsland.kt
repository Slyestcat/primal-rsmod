package gg.rsmod.plugins.content.modules.tutorialisland

import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.queue.TaskPriority
import gg.rsmod.game.sync.block.UpdateBlockType
import gg.rsmod.plugins.api.InterfaceDestination
import gg.rsmod.plugins.api.ext.*

class TutorialIsland {
    companion object {
        val COMPLETION_VARP = 281
        val PROGRESS_VARP = 406

        val FLASH_TAB_VARBIT = 3756

        var GUIDE_NPC_INDEX: Int = 0
        var SURVIVAL_EXPERT_NPC_INDEX: Int = 0
        var MASTER_CHEF_NPC_INDEX: Int = 0
        var QUEST_GUIDE_NPC_INDEX: Int = 0
        var MINING_INSTRUCTOR_NPC_INDEX: Int = 0


        val TAB_CHILD_IDS: HashMap<InterfaceDestination, Array<Int>> = hashMapOf(
                Pair(InterfaceDestination.SETTINGS, arrayOf(35,39,38)),
                Pair(InterfaceDestination.INVENTORY, arrayOf(51,54,53)),
                Pair(InterfaceDestination.SKILLS, arrayOf(49,52,58)),
                Pair(InterfaceDestination.QUEST, arrayOf(50,53,59))
        )

        val HIDDEN_INTERFACES = arrayOf(
                InterfaceDestination.ATTACK,
                InterfaceDestination.SKILLS,
                InterfaceDestination.QUEST,
                InterfaceDestination.INVENTORY,
                InterfaceDestination.EQUIPMENT,
                InterfaceDestination.PRAYER,
                InterfaceDestination.MAGIC,
                InterfaceDestination.SOCIAL,
                InterfaceDestination.ACCOUNT_MANAGEMENT,
                InterfaceDestination.CLAN_CHAT,
                InterfaceDestination.SETTINGS,
                InterfaceDestination.EMOTES,
                InterfaceDestination.MUSIC
        )
    }

    private fun init(player: Player, state: Int) {
        player.openInterface(interfaceId = 614, dest = InterfaceDestination.WALKABLE)

        if(state <= 2) {
            // Chat stuff
            player.setStaticDialog("<col=0000ff>Getting started</col><br>Before you begin, have a read through the controls guide in the top left of the screen. When you're ready to get started, click on the Gielinor Guide. He is indicated by a flashing yellow arrow.")
        }

        if(state >= 3) {
            player.openInterface(InterfaceDestination.SETTINGS)
        }

        if(state >= 30) {
            player.openInterface(InterfaceDestination.INVENTORY)
        }

        if(state >= 50) {
            player.openInterface(InterfaceDestination.SKILLS)
        }

        if(state >= 230) {
            player.openInterface(InterfaceDestination.QUEST)
        }
    }

    fun process(player: Player) {
        this.init(player, player.getVarp(281))

        val state = player.getVarp(COMPLETION_VARP)

        if(state < 3) {
            if(state < 2) {
                player.queue(TaskPriority.WEAK) {
                    val appearance = selectAppearance() ?: return@queue
                    player.appearance = appearance
                    player.addBlock(UpdateBlockType.APPEARANCE)
                    player.setVarp(281, 2)
                    process(player)
                }
            }
        }

        if(state < 10) {
            if(state < 3 || state == 7) {
                // Hint GIELENOR GUIDE
                player.sendHintArrow(1, GUIDE_NPC_INDEX, 0, 0)

                if(state == 7) {
                    player.setVarbit(TutorialIsland.FLASH_TAB_VARBIT, -1)
                    player.setStaticDialog("<col=0000ff>Options menu</col><br>On the side panel, you can now see a variety of game options such as screen brightness and music volume. Don't worry about these too much for now, they will become clearer as you explore the game. Talk to the Gielinor Guide to continue.")
                    player.sendHintArrow(1, TutorialIsland.GUIDE_NPC_INDEX, 0, 0)
                }
            }

            if(state == 3) {
                player.sendHintArrow(0,0,0,0)
                player.setVarbit(FLASH_TAB_VARBIT, 12)
                player.setStaticDialog("<col=0000ff>Options menu</col><br>Please click on the flashing spanner icon found at the bottom right of your screen. This will display your options menu.")
            }
        }

        if(state == 10) {
            player.setStaticDialog("<col=0000ff>Moving on</col><br>It's time to meet your first instructor. To continue, all you need to do is click on the door. It's indicated by a flashing yellow arrow. Remember, you can use your arrow keys to rotate the camera.")
            player.sendHintArrow(3, 3098, 3107, 128)
        }

        if(state == 20) {
            player.setStaticDialog("<col=0000ff>Moving around</col><br>Follow the path to find the next instructor. Clicking on the ground will walk you to that point. You can also move around by clicking a point on the minimap in the top right corner. Talk to the survival expert to continue the tutorial.")
            player.sendHintArrow(1, TutorialIsland.SURVIVAL_EXPERT_NPC_INDEX, 0,0)
        }

        if(state == 30) {
            player.sendHintArrow(0,0,0,0)
            player.setStaticDialog("<col=0000ff>You've been given an item</col><br>To view the item you've been given, you'll need to open your inventory. To do so, click on the flashing backpack icon to the right hand side of your screen.")
            player.setVarbit(FLASH_TAB_VARBIT, 4)
        }

        if(state == 40) {
            player.setVarbit(FLASH_TAB_VARBIT, -1)
            player.setStaticDialog("<col=0000ff>Fishing</col><br>This is your inventory. You can view all of your items here, including the net you've just been given. Let's use it to catch some shrimp. To start fishing, just click on the sparkling fishing spot, indicated by the flashing arrow.]")
            player.sendHintArrow(2, 3101, 3092, 0)
        }

        if(state == 50) {
            player.sendHintArrow(0,0,0,0)
            player.setVarbit(FLASH_TAB_VARBIT, 2)
            player.setStaticDialog("<col=0000ff>You've gained some experience</col><br>Click on the flashing bar graph icon near the inventory button to see your skills menu.")
        }

        if(state == 60) {
            player.setVarbit(FLASH_TAB_VARBIT, -1)
            player.setStaticDialog("<col=0000ff>Skills and Experience</col><br>On this menu you can view your skills. Your skills can be leveled up by earning experience, which is gained by performing various activities. As you level up your skills, you will earn new unlocks. Speak to the survival expert to continue.")
            player.setVarp(PROGRESS_VARP, 3)
            player.sendHintArrow(1, SURVIVAL_EXPERT_NPC_INDEX, 0, 0)
        }

        if(state == 70) {
            player.sendHintArrow(4, 3099, 3095, 150)
            player.setStaticDialog("<col=0000ff>Woodcutting</col><br>It's time to cook your shrimp. However, you require a fire to do that which means you need some logs. You can cut down trees using your Woodcutting skill, all you need is an axe. Give it a go by clicking on one of the trees in the area.")
        }

        if(state == 80) {
            player.sendHintArrow(0,0,0,0)
            player.setStaticDialog("<col=0000ff>Firemaking</col><br>Now that you have some logs, it's time to light a fire. First, click on the tinderbox in your inventory. Then, with the tinderbox highlighted, click on the logs to use the tinderbox on them.")
        }

        if(state == 90) {
            player.setStaticDialog("<col=0000ff>Cooking</col><br>Now it's time to get cooking. To do so, click on the shrimp in your inventory. Then, with the shrimp highlighted, click on a fire to cook them. If you look at the top left of the screen, you'll see the instructions that you're giving to your character.")
        }

        if(state == 120) {
            player.setStaticDialog("<col=0000ff>Moving on</col><br>Well done, you've just cooked your first meal! Speak to the survival expert if you want a recap, otherwise you can move on. Click on the gate shown and follow the path. Remember, you can use your arrow keys to rotate the camera.")
            player.sendHintArrow(4, 3089,3092, 65)
        }

        if(state == 130) {
            player.setStaticDialog("<col=0000ff>Moving on</col><br>Follow the path until you get to the door with the yellow arrow above it. Click on the door to open it. Remember that you can also move around by clicking on the minimap in the top right.")
            player.sendHintArrow(3, 3079, 3084,128)
        }

        if(state == 140) {
            player.setStaticDialog("<col=0000ff>Cooking</col><br>Talk to the chef indicated. He will teach you the more advanced aspects of Cooking such as combining ingredients.")
            player.sendHintArrow(1, MASTER_CHEF_NPC_INDEX, 0, 0)
        }

        if(state == 150) {
            player.sendHintArrow(0,0,0,0)
            player.setStaticDialog("<col=0000ff>Making dough</col><br>This is the base for many meals. To make dough you must mix flour with water. To do so, click on the flour in your inventory. Then, with the flour highlighted, click on the water to combine them into dough.")
        }

        if(state == 160) {
            player.sendHintArrow(4,3075,3081,65)
            player.setStaticDialog("<col=0000ff>Cooking dough</col><br>Now you have made the dough, you can bake it into some bread. To do so, just click on the indicated range.")
        }

        if(state == 170) {
            player.sendHintArrow(4, 3072,3090,128)
            player.setStaticDialog("<col=0000ff>Moving on</col><br>Well done! You've baked your first loaf of bread. As you gain experience in Cooking, you will be able to make other things like pies and cakes. You can now use the next door to move on. If you need a recap on anything, talk to the master chef.")
        }

        if(state == 180) {
            player.sendHintArrow(5, 3086,3126,128)
            player.setStaticDialog("<col=0000ff>Moving on</col><br>Follow the path to the next guide. When you get there, click on the door to pass through it. Remember, you can use your arrow keys to rotate the camera.")
            player.setVarp(PROGRESS_VARP, 6)
        }

        if(state == 220) {
            player.sendHintArrow(1, QUEST_GUIDE_NPC_INDEX, 0, 0)
            player.setStaticDialog("<col=0000ff>Quests</col><br>It's time to learn about quests! Just talk to the quest guide to get started.")
        }

        if(state == 230) {
            player.sendHintArrow(0,0,0,0)
            player.setStaticDialog("<col=0000ff>Quest journal</col><br>Click on the flashing icon to the left of your inventory.")
            player.setVarbit(FLASH_TAB_VARBIT, 3)
        }

        if(state == 240) {
            player.setStaticDialog("<col=0000ff>Quest journal</col><br>This is your quest journal. It lists every quest in the game. Talk to the quest guide again for an explanation on how it works.")
            player.setVarbit(FLASH_TAB_VARBIT, -1)
            player.sendHintArrow(1, QUEST_GUIDE_NPC_INDEX, 0, 0)
        }

        if(state == 250) {
            player.sendHintArrow(2, 3088,3119,5)
            player.setStaticDialog("<col=0000ff>Moving on</col><br>It's time to enter some caves. Click on the ladder to go down to the next area.")
        }

        if(state == 260) {
            player.setStaticDialog("<col=0000ff>Mining and Smithing</col><br>Next let's get you a weapon, or more to the point, you can make your first weapon yourself. Don't panic, the mining instructor will help you. Talk to him and he'll tell you all about it.")
            player.sendHintArrow(1, MINING_INSTRUCTOR_NPC_INDEX, 0, 0)
            player.playSong(144)
        }
    }
}