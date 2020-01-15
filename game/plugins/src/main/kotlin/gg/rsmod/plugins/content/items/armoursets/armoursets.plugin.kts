package gg.rsmod.plugins.content.items.armoursets

armoursets.values.forEach { armoursets ->
    on_item_on_obj(obj = Objs.BANK_BOOTH_10355, item = armoursets.item) { //TODO add ability to use with all BANK IDs
        if (player.inventory.remove(item = armoursets.item).hasSucceeded() && player.inventory.freeSlotCount > 3) {
            player.inventory.add(item = armoursets.helmetid)
            player.inventory.add(item = armoursets.chestid)
            player.inventory.add(item = armoursets.legid)
            player.inventory.add(item = armoursets.shieldid)
        } else {
            player.message("You don't have enough inventory space.")
        }
    }

    on_item_on_npc(npc = Npcs.BANKER_2117, item = armoursets.item) {//TODO add ability to use with all BANKERS/GE clerks
        if (player.inventory.remove(item = armoursets.item).hasSucceeded() && player.inventory.freeSlotCount > 3) {
            player.inventory.add(item = armoursets.helmetid)
            player.inventory.add(item = armoursets.chestid)
            player.inventory.add(item = armoursets.legid)
            player.inventory.add(item = armoursets.shieldid)
        } else {
            player.message("You don't have enough inventory space.")
        }
    }
}


