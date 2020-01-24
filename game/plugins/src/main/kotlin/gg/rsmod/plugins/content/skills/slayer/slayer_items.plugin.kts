
import gg.rsmod.plugins.content.magic.TeleportType
import gg.rsmod.plugins.content.magic.teleport
import gg.rsmod.plugins.content.skills.slayer.AssignmentMaster
import gg.rsmod.plugins.content.skills.slayer.SlayerHandler

arrayOf(Items.SLAYER_RING_1, Items.SLAYER_RING_2,Items.SLAYER_RING_3,Items.SLAYER_RING_4,Items.SLAYER_RING_5,Items.SLAYER_RING_6,Items.SLAYER_RING_7,Items.SLAYER_RING_8,Items.SLAYER_RING_ETERNAL).forEach { items ->

    on_item_option(item = items, option = "Check") {
        player.queue {
            SlayerHandler.checkTask(this)
         }
    }

    on_equipment_option(item = items, option = "Check") {
        player.queue {
            SlayerHandler.checkTask(this)
        }
    }

    on_item_option(item = items, option = "Rub") {
        player.queue {
            slayerRingOptions(this.player.getInteractingItem(),this)
        }
    }

    on_equipment_option(item = items, option = "Teleport") {
        player.queue {
            slayerRingteleport(this.player.getInteractingItem(),this,"equipment")
        }
    }

    on_equipment_option(item = items, option = "Master") {
        player.queue { dialogMasters(this,player) }
    }

    on_equipment_option(item = items, option = "Log") {
        SlayerHandler.openLog()
    }

    on_equipment_option(item = items, option = "Partner") {

    }

}

on_item_option(item = 4155, option = "Check") {
    player.queue {
        SlayerHandler.checkTask(this)
    }
}

on_item_option(item = 4155, option = "Activate") {
    player.queue {
        dialogMasters(this,player)
    }
}

on_item_option(item = 4155, option = "Log") {
   SlayerHandler.openLog()
}


suspend fun slayerRingOptions(item : Item,it: QueueTask) {
    when (it.options("Teleport","Contact Master","Open Log","Cancel", title = if(SlayerHandler.slayerTask.amount == 0) "No Task" else "Assigment:${SlayerHandler.slayerTask.amount} x ${ SlayerHandler.slayerTask.assignment.name}}")) {
        1 ->  {
            slayerRingteleport(item,it,"inventory")
        }
        2 -> it.player.queue { dialogMasters(this,player) }

        3 -> SlayerHandler.openLog()
    }
}

suspend fun slayerRingteleport(item : Item,it: QueueTask, type : String) {
    when (it.options("Teleport to the Slayer Tower","Teleport to the Fremennik Slayer Dungeon","Teleport to Tarn's Lair","Teleport to the Stronghold Slayer Cave","Teleport to Dark Beasts", title = "Choose an destination")) {
        1 ->  teleport(item,it.player,Tile(3428,3532,0),type)
        2 ->  teleport(item,it.player,Tile(2806,10002,0),type)
        3 ->  teleport(item,it.player,Tile(2911,3519,0),type)
        4 ->  teleport(item,it.player,Tile(2911,3519,0),type)
        5 ->  teleport(item,it.player,Tile(2911,3519,0),type)
    }
}

fun teleport(item : Item,player : Player, tile : Tile, type : String){
    player.teleport(tile,TeleportType.GLORY)
    when (type) {
        "inventory" -> when {
            item.id != Items.SLAYER_RING_ETERNAL && item.id != Items.SLAYER_RING_1 -> {
                player.inventory.remove(item)
                player.inventory.add(item.id + 1)
            }
            item.id != Items.SLAYER_RING_ETERNAL && item.id == Items.SLAYER_RING_1 -> {
                player.inventory.remove(item)
                player.filterableMessage("<col=FF0000>The Slayer Ring crumbles to dust!</col>")
            }
        }
        else -> when {
            item.id != Items.SLAYER_RING_ETERNAL && item.id != Items.SLAYER_RING_1 -> {
                player.equipment[EquipmentType.RING.id] = Item(item.id + 1)
            }
            item.id != Items.SLAYER_RING_ETERNAL && item.id == Items.SLAYER_RING_1 -> {
                player.equipment[EquipmentType.RING.id] = null
                player.filterableMessage("@red@The Slayer Ring crumbles to dust!")
            }
        }
    }
}

suspend fun dialogMasters(it: QueueTask, player : Player) {

    val master : AssignmentMaster  = AssignmentMaster.valueOf(SlayerHandler.slayerTask.assignment.master.name)

    if(SlayerHandler.slayerTask.amount == 0) {
        it.chatNpc("Please come and visit me for a task",npc =  master.npcId)
        return
    }
    it.chatNpc("'Ello, and what are you after then?",npc =  master.npcId)

    when (it.options("Do you have anything to trade?","Have you any rewards for me","Er... Nothing...")) {
        1 -> {
            it.chatPlayer("Do you have anything to trade?")
            it.chatNpc("I have a wide selection of Slayer equipment; take a look!", npc =  master.npcId)
            it.wait(1)
            SlayerHandler.open_shop(player)
        }
        2 -> {
            when (it.options("I am here to discuss any rewards I might be eligible for.","How do I earn co-op points to spend on rewards?","About the Task System...","Er...nothing...")) {
                1 -> System.out.println("f")
                2 -> {
                    it.chatNpc("You'll gain co-op reward points if you complete at least half of your contribution to a task with a friend.<br> That means you need to be in a group for most of the time you're working on the task,<br> but it doesn't matter if your friend beats you to the majority of kills!<br> You'll still have been in a group for most of your contribution,<br> so you're still entitled to a co-op reward point.", npc =  master.npcId)
                    when (it.options("View rewards.","Where can I use the co-op food and potion rewards?","That's all, thanks.")) {
                        1 -> System.out.println("Open Rewards")
                        2 -> {
                            it.chatNpc("The rewards can be used in most of the areas we commonly send you to complete your tasks.", npc =  master.npcId)
                            when (it.options("View rewards.","How do I earn co-op points to spend on rewards?","That's all, thanks.")) {
                                1 -> System.out.println("Open Rewards")
                                2 -> it.chatNpc("You'll gain co-op reward points if you complete at least half of your contribution to a task with a friend.<br> That means you need to be in a group for most of the time you're working on the task,<br> but it doesn't matter if your friend beats you to the majority of kills!<br> You'll still have been in a group for most of your contribution,<br> so you're still entitled to a co-op reward point.", npc =  master.npcId)
                            }
                        }
                    }
                }
            }
        }
    }
}


