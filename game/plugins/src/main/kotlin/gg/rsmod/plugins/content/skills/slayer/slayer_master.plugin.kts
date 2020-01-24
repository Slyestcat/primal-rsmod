import gg.rsmod.plugins.content.mechanics.shops.CoinCurrency
import gg.rsmod.plugins.content.skills.slayer.AssignmentMaster
import gg.rsmod.plugins.content.skills.slayer.SlayerHandler

arrayOf(Npcs.TURAEL, Npcs.KRYSTILIA,Npcs.MAZCHNA,Npcs.VANNAKA,Npcs.CHAELDAR,Npcs.KONAR_QUO_MATEN,Npcs.STEVE,Npcs.DURADEL).forEach { masters ->

    on_npc_option(npc = masters, option = "Talk-to") {
        player.queue { dialogMasters(this,player) }
    }

    on_npc_option(npc = masters, option = "Trade") {
        SlayerHandler.open_shop(player)
    }

    on_npc_option(npc = masters, option = "Assignment") {
        player.queue { dialogAssignment(player,this) }
    }

    on_npc_option(npc = masters, option = "Rewards") {
        player.queue { dialogAssignment(player,this) }
    }
}

suspend fun dialogAssignment(player : Player,it: QueueTask) {

    when {

        SlayerHandler.slayerTask.amount == 0 -> {
            val master : AssignmentMaster  = AssignmentMaster.valueOf(it.player.getInteractingNpc().name.toUpperCase().replace(" ","_"))
            if(SlayerHandler.hasLevel(player,master.slayerlvl,player.combatLevel)) {
                it.chatNpc("Please come back to me when you are stronger!")
            } else {
                SlayerHandler.giveTask(it.player,master)
                it.chatPlayer("I need another assignment.")
                it.chatNpc("Excellent, you're doing great. Your new task is to kill<br> ${SlayerHandler.slayerTask.amount} ${SlayerHandler.slayerTask.assignment.name} ")
            }

        }
        else -> it.chatNpc("You're currently assigned to kill ${SlayerHandler.slayerTask.assignment.name}; only ${SlayerHandler.slayerTask.amount}<br>more to go. Your reward point tally is ${it.player.slayerTasksDone}")
    }
}

suspend fun dialogMasters(it: QueueTask, player : Player) {

    it.chatNpc("'Ello, and what are you after then?")

    when (it.options("I need another assignment.","Do you have anything to trade?","Have you any rewards for me","Er... Nothing...")) {
        1 ->  {
            when {
                SlayerHandler.slayerTask.amount == 0 -> {
                    SlayerHandler.giveTask(it.player,AssignmentMaster.valueOf(it.player.getInteractingNpc().name.toUpperCase().replace(" ","_")))
                    it.chatPlayer("I need another assignment.")
                    it.chatNpc("Excellent, you're doing great. Your new task is to kill<br> ${SlayerHandler.slayerTask.amount} ${SlayerHandler.slayerTask.assignment.name} ")
                    when (it.options("Got any tips for me?","Okay, great!")) {
                        1 -> System.out.println("f")
                        2 -> {
                            it.chatPlayer("Okay, great!")
                            it.chatNpc("Good luck! Don't forget to come back when you need a <br> new assignment.")
                        }

                    }
                }
                else -> it.chatNpc("You're currently assigned to kill ${SlayerHandler.slayerTask.assignment.name}; only ${SlayerHandler.slayerTask.amount}<br>more to go. Your reward point tally is ${it.player.slayerTasksDone}")
            }
        }
        2 -> {
            it.chatPlayer("Do you have anything to trade?")
            it.chatNpc("I have a wide selection of Slayer equipment; take a look!")
            it.wait(1)
            SlayerHandler.open_shop(player)
        }
        3 -> {
            when (it.options("I am here to discuss any rewards I might be eligible for.","How do I earn co-op points to spend on rewards?","About the Task System...","Er...nothing...")) {
                1 -> System.out.println("f")
                2 -> {
                    it.chatNpc("You'll gain co-op reward points if you complete at least half of your contribution to a task with a friend.<br> That means you need to be in a group for most of the time you're working on the task,<br> but it doesn't matter if your friend beats you to the majority of kills!<br> You'll still have been in a group for most of your contribution,<br> so you're still entitled to a co-op reward point.")
                    when (it.options("View rewards.","Where can I use the co-op food and potion rewards?","That's all, thanks.")) {
                        1 -> System.out.println("Open Rewards")
                        2 -> {
                            it.chatNpc("The rewards can be used in most of the areas we commonly send you to complete your tasks.")
                            when (it.options("View rewards.","How do I earn co-op points to spend on rewards?","That's all, thanks.")) {
                                1 -> System.out.println("Open Rewards")
                                2 -> it.chatNpc("You'll gain co-op reward points if you complete at least half of your contribution to a task with a friend.<br> That means you need to be in a group for most of the time you're working on the task,<br> but it doesn't matter if your friend beats you to the majority of kills!<br> You'll still have been in a group for most of your contribution,<br> so you're still entitled to a co-op reward point.")
                            }
                        }
                    }
                }
            }
        }
    }
}

create_shop("Slayer Equipment", CoinCurrency(), purchasePolicy = PurchasePolicy.BUY_STOCK) {
    items[0] = ShopItem(Items.ENCHANTED_GEM, 50,1,0)
    items[1] = ShopItem(Items.MIRROR_SHIELD, 50,5000,3000)
    items[2] = ShopItem(Items.LEAFBLADED_SPEAR, 50,31000,18600)
    items[3] = ShopItem(Items.BROAD_ARROWS, 50000,60,36)
    items[4] = ShopItem(Items.BAG_OF_SALT, 5000,10,6)
    items[5] = ShopItem(Items.ROCK_HAMMER, 50,500,300)
    items[6] = ShopItem(Items.FACEMASK, 50,200,120)
    items[7] = ShopItem(Items.EARMUFFS, 50,200,150)
    items[8] = ShopItem(Items.NOSE_PEG, 50,200,120)
    items[9] = ShopItem(Items.SLAYERS_STAFF, 50,21000,12600)
    items[10] = ShopItem(Items.SPINY_HELMET, 50,650,390)
    items[11] = ShopItem(Items.FISHING_EXPLOSIVE, 5000,60,36)
    items[12] = ShopItem(Items.ICE_COOLER, 5000,1,0)
    items[13] = ShopItem(Items.SLAYER_GLOVES, 50,200,120)
    items[14] = ShopItem(Items.UNLIT_BUG_LANTERN, 50,130,78)
    items[15] = ShopItem(Items.INSULATED_BOOTS, 50,200,120)
    items[16] = ShopItem(Items.FUNGICIDE_SPRAY_10, 50,1,0)
    items[17] = ShopItem(Items.FUNGICIDE, 5000,10,6)
    items[18] = ShopItem(Items.WITCHWOOD_ICON, 50,900,540)
    items[19] = ShopItem(Items.SLAYER_BELL, 50,150,90)
    items[20] = ShopItem(Items.BROAD_ARROWHEADS, 3000,55,33)
    items[21] = ShopItem(Items.BROAD_ARROWHEAD_PACK, 800,5500,3300)
    items[22] = ShopItem(Items.UNFINISHED_BROAD_BOLTS, 5000,55,33)
    items[23] = ShopItem(Items.UNFINISHED_BROAD_BOLT_PACK, 1000,5500,3300)
    items[24] = ShopItem(Items.ROCK_THROWNHAMMER, 5000,200,120)
    items[25] = ShopItem(Items.BOOTS_OF_STONE, 50,200,120)


}