package gg.rsmod.plugins.content.modules.grandexchange

import gg.rsmod.plugins.api.ext.player
import kotlin.math.ceil

/**
 * Buy / Sell buttons
 */
GrandExchange.OFFER_COMPONENTS.forEach { component ->
    on_button(GEInterface.MAIN_SCREEN, component) {
        val slot = player.getInteractingSlot()
        player.openGrandExchangeOffer((component-7), slot-3)
    }
}

/**
 * Back button
 */
on_button(GEInterface.MAIN_SCREEN, 4) {
    player.closeGrandExchangeOffer()
}

/**
 * Called on GE Interface closed
 */
on_interface_close(GEInterface.MAIN_SCREEN) {
    player.closeGrandExchange()
}

/**
 * GE Inventory Offer item
 */
on_button(GEInterface.TAB_SCREEN, 0) {
    val opt = player.getInteractingOption()
    val slot = player.getInteractingSlot()
    if(opt == 1) {
        val item = player.inventory.get(slot)
        if(item != null) {
            val def = player.world.definitions.get(ItemDef::class.java,item.id)
            if(!def.tradeable) {
                player.filterableMessage("You can't trade that item on the Grand Exchange.")
                return@on_button
            }
            player.setVarbit(GrandExchange.VARBIT_OFFER_OPEN, 1)
            player.setVarbit(GrandExchange.VARBIT_OFFER_CREATION_TYPE, 1)
            GEInterface(player).createSellOffer(item.id)
        }
    }
}

/**
 * GE Offer screen buttons
 */
on_button(GEInterface.MAIN_SCREEN, 24) {
    val slot = player.getInteractingSlot()
    if(slot == 0) {
        player.reselectGrandExchangeOfferItem()
    }
    else if(player.getVarp(GrandExchange.VARP_ITEM_ID) != -1) {
        var max = -1
        if(player.inventory.getItemCount(player.getVarp(GrandExchange.VARP_ITEM_ID)) > 0 && player.getVarbit(GrandExchange.VARBIT_OFFER_CREATION_TYPE) == 1) { max = player.inventory.getItemCount(player.getVarp(GrandExchange.VARP_ITEM_ID)) }
        when(slot) {
            1 -> { player.changeGEQuantity(-1,max) }
            2 -> { player.changeGEQuantity(1,max) }
            3 -> { player.changeGEQuantity(1,max) }
            4 -> { player.changeGEQuantity(10,max) }
            5 -> { player.changeGEQuantity(100,max) }
            6 -> { player.changeGEQuantity(1000,max) }
            7 -> { }
            8 -> { player.changeGEPrice(-1) }
            9 -> { player.changeGEPrice(1) }
            10 -> { player.changeGEPrice(-1*ceil(player.getVarp(GrandExchange.VARP_PRICE).toDouble()/20).toInt()) }
            11 -> { }
            12 -> { }
            13 -> { player.changeGEPrice(ceil(player.getVarp(GrandExchange.VARP_PRICE).toDouble()/20).toInt()) }
        }
    }
}

/**
 * GE Confirm Offer big button
 */
on_button(GEInterface.MAIN_SCREEN, 27) {
    player.queue(TaskPriority.STRONG) { GrandExchange.createOffer(this) }
}