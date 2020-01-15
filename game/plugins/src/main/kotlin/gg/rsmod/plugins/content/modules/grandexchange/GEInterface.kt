package gg.rsmod.plugins.content.modules.grandexchange

import gg.rsmod.game.fs.def.ItemDef
import gg.rsmod.game.model.container.ContainerStackType
import gg.rsmod.game.model.container.ItemContainer
import gg.rsmod.game.model.container.key.GE_RETURN_KEY
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.item.Item
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.game.model.queue.TaskPriority
import gg.rsmod.plugins.api.InterfaceDestination
import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.api.ext.*
import gg.rsmod.plugins.content.modules.grandexchange.api.GEApi

/**
 * @author Kyle Escobar
 */

/**
 * Controller for open / interacting with GE interface
 * @param player        [Player] object
 */
class GEInterface(val player: Player) {

    companion object {
        val MAIN_SCREEN = 465
        val TAB_SCREEN = 467
        val ITEM_EXAMINE_COMPONENT = 25
    }

    /**
     * Opens the main GE Interface
     */
    fun open() {
        player.openInterface(MAIN_SCREEN, InterfaceDestination.MAIN_SCREEN)
        player.openInterface(TAB_SCREEN, InterfaceDestination.TAB_AREA)
        player.setInterfaceEvents(MAIN_SCREEN, 7, 2..2, 6)
        player.setInterfaceEvents(MAIN_SCREEN, 7, 3..4, 2)
        player.setInterfaceEvents(MAIN_SCREEN, 8, 2..2, 6)
        player.setInterfaceEvents(MAIN_SCREEN, 8, 3..4, 2)
        player.setInterfaceEvents(MAIN_SCREEN, 9, 2..2, 6)
        player.setInterfaceEvents(MAIN_SCREEN, 9, 3..4, 2)
        player.setInterfaceEvents(MAIN_SCREEN, 10, 2..2, 6)
        player.setInterfaceEvents(MAIN_SCREEN, 10, 3..4, 2)
        player.setInterfaceEvents(MAIN_SCREEN, 11, 2..2, 6)
        player.setInterfaceEvents(MAIN_SCREEN, 11, 3..4, 2)
        player.setInterfaceEvents(MAIN_SCREEN, 12, 2..2, 6)
        player.setInterfaceEvents(MAIN_SCREEN, 12, 3..4, 2)
        player.setInterfaceEvents(MAIN_SCREEN, 13, 2..2, 6)
        player.setInterfaceEvents(MAIN_SCREEN, 13, 3..4, 2)
        player.setInterfaceEvents(MAIN_SCREEN, 14, 2..2, 6)
        player.setInterfaceEvents(MAIN_SCREEN, 14, 3..4, 2)
        player.setInterfaceEvents(MAIN_SCREEN, 22, 0..0, 2)
        player.setInterfaceEvents(MAIN_SCREEN, 23, 2..3, 1038)
        player.setInterfaceEvents(MAIN_SCREEN, 6, 0..0, 6)
        player.setInterfaceEvents(MAIN_SCREEN,24,0..13, 2)
        player.setInterfaceEvents(TAB_SCREEN, 0, 0..27,1026)

        player.runClientScript(828, 1)
        player.runClientScript(2524, -1, -1)
        player.runClientScript(915,3)

        resetVarps()

        // Fetch offers from api
        GrandExchange.getPlayerOffers(player)
    }

    private fun resetVarps() {
        player.setVarbit(GrandExchange.VARBIT_PRICE, 0)
        player.setVarbit(GrandExchange.VARBIT_QUANITY, 0)
        player.setVarp(GrandExchange.VARP_ITEM_ID, -1)
        player.setVarp(GrandExchange.VARP_QUANITY, 0)
        player.setVarp(GrandExchange.VARP_PRICE, 0)
        player.setVarp(GrandExchange.VARP_SLOT, 0)

        player.setVarbit(GrandExchange.VARBIT_OFFER_CREATION_TYPE, 0)
        //player.setVarbit(GrandExchange.VARBIT_OFFER_OPEN,0)
    }

    fun close() {
        player.closeInputDialog()
        player.closeInterface(TAB_SCREEN)
        player.setVarbit(GrandExchange.VARBIT_PRICE, 0)
        player.setVarbit(GrandExchange.VARBIT_QUANITY, 0)
        player.setVarp(GrandExchange.VARP_ITEM_ID, -1)

        player.setVarbit(GrandExchange.VARBIT_OFFER_CREATION_TYPE, -1)

        player.setComponentText(MAIN_SCREEN, ITEM_EXAMINE_COMPONENT, "")
    }

    fun openOffer(slot: Int, type: Int) {
        println("Slot: $slot type: $type")
        val slotShift = (slot+1) shl 4
        player.setVarp(GrandExchange.VARP_SLOT, slotShift)

        if(type == 0) {
            player.setVarbit(GrandExchange.VARBIT_OFFER_CREATION_TYPE, 0)
            player.queue(TaskPriority.WEAK) { buyItemSearch(this) }
        }

        if(type == 1) {
            player.setVarbit(GrandExchange.VARBIT_OFFER_CREATION_TYPE, 1)
        }
    }

    fun closeOffer(type: Int) {
        player.closeInputDialog()
        player.setComponentText(MAIN_SCREEN, ITEM_EXAMINE_COMPONENT, "")

        if(type == 1) {
            player.setVarbit(GrandExchange.VARBIT_OFFER_CREATION_TYPE, -1)
        }

        resetVarps()
    }

    suspend fun buyItemSearch(it: QueueTask) {
        val player = it.player

        clearOfferItem()

        val item = it.searchItemInput("What would you like to buy?")
        // Once an item is selected
        player.setVarp(GrandExchange.VARP_ITEM_ID, item)
        player.setVarbit(GrandExchange.VARBIT_QUANITY, 1)
        player.setVarbit(GrandExchange.VARBIT_PRICE, 1)
        player.setVarp(GrandExchange.VARP_QUANITY, 1)
        player.setVarp(GrandExchange.VARP_PRICE, 1)

        val def = player.world.definitions.get(ItemDef::class.java, item)

        player.setComponentText(MAIN_SCREEN, ITEM_EXAMINE_COMPONENT, def.examine!!)
    }

    fun clearOfferItem() {
        player.setVarp(GrandExchange.VARP_ITEM_ID, -1)
        player.setVarbit(GrandExchange.VARBIT_PRICE, 0)
        player.setVarbit(GrandExchange.VARBIT_QUANITY, 0)
        player.setVarp(GrandExchange.VARP_QUANITY, 0)
        player.setVarp(GrandExchange.VARP_PRICE, 0)
        player.setComponentText(MAIN_SCREEN, ITEM_EXAMINE_COMPONENT, "")
    }

    fun createSellOffer(item: Int) {
        val def = player.world.definitions.get(ItemDef::class.java, item)
        player.setVarp(GrandExchange.VARP_ITEM_ID, item)
        player.setVarbit(GrandExchange.VARBIT_QUANITY, 1)
        player.setVarbit(GrandExchange.VARBIT_PRICE, 1)
        player.setVarp(GrandExchange.VARP_QUANITY, Int.MIN_VALUE+1)
        player.setVarp(GrandExchange.VARP_PRICE, 1)
        if(def.examine != null) {
            player.setComponentText(MAIN_SCREEN, ITEM_EXAMINE_COMPONENT, def.examine!!)
        }
        player.playSound(3927, 1, 0)
    }
}