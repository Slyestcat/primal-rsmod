package gg.rsmod.plugins.content.admin.cmd

import gg.rsmod.game.model.priv.Privilege

on_command("adminitems", Privilege.ADMIN_POWER) {
    val args = player.getCommandArgs()
    tryWithUsage(player, args, "Usage - ::adminitems [?Player Name]") {
        var target: Player? = null
        if(args.size == 0) {
            target = player
        }
        else if(args.size == 1) {
            // Search for player name
            target = world.getPlayerForName(args[0])
        }

        if(target == null) {
            player.message("${args[0]} is either not online or was not found. Please try again.")
            return@tryWithUsage
        }

        val items = intArrayOf(
                Items.ROTTEN_POTATO,
                Items.FIREWORK,
                Items.HOLIDAY_TOOL,
                Items.ROTTEN_EGG,
                Items.ROTTEN_CABBAGE,
                Items.ROTTEN_CARROT,
                Items.ROTTEN_STRAWBERRY,
                Items.WARHAMMER,
                Items.HALBERD,
                Items.POISONED_DAGGERP
        )

        items.forEach { item ->
            val itemObject = Item(item, 1)
            itemObject.getDef(world.definitions).tradeable = false

            target.inventory.set(target.inventory.nextFreeSlot, itemObject)
        }

        player.message("You have given <col=0000ff>$target.name</col> the admin items.")
    }
}

fun tryWithUsage(player: Player, args: Array<String>, failMessage: String, tryUnit: Function1<Array<String>, Unit>) {
    try {
        tryUnit.invoke(args)
    } catch (e: Exception) {
        player.message(failMessage)
        e.printStackTrace()
    }
}