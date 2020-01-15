package gg.rsmod.plugins.content.modules.grandexchange

import gg.rsmod.game.model.World
import gg.rsmod.game.model.container.ContainerStackType
import gg.rsmod.game.model.container.ItemContainer
import gg.rsmod.game.model.container.key.ContainerKey
import gg.rsmod.game.model.container.key.GE_RETURN_KEY
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.item.Item
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.api.ext.*
import gg.rsmod.plugins.content.modules.grandexchange.api.GEApi

object GrandExchange {
    val VARBIT_QUANITY = 4396
    val VARBIT_PRICE = 4398
    val VARP_QUANITY = 563
    val VARP_PRICE = 1043
    val VARP_ITEM_ID = 1151
    val VARBIT_OFFER_CREATION_TYPE = 4397
    val VARBIT_OFFER_OPEN = 4439
    val VARP_SLOT = 375

    val OFFER_COMPONENTS = intArrayOf(7,8,9,10,11,12,13,14)

    val SOUND_ERROR = 3926
    val SOUND_OFFER_CREATED = 3925

    val RETURN_KEYS = hashMapOf(
            Pair(0,518),
            Pair(1,519),
            Pair(2,520),
            Pair(3,521),
            Pair(4,522),
            Pair(5,523),
            Pair(6,539),
            Pair(7,540)
    )

    fun getPlayerOffers(player: Player) {
        val offers = GEApi.getOffers(player)
            for(i in (0..7)) {
                val offer = this.getOfferBySlot(i, offers)
                if(offer != null) {
                    player.sendGrandExchangeOffer(offer.slot, offer.state, offer.item_id, offer.price, offer.quantity, offer.quantityFilled, offer.spent)
                    if((offer.type == 0 && offer.state == 5) || (offer.type == 1 && offer.state == 13)) {
                        val container = getReturnItems(offer, player.world)
                        if(!container.isEmpty) {
                            player.sendItemContainer(RETURN_KEYS.get(offer.slot)!!, container)
                        }
                    }
                } else {
                    player.sendGrandExchangeOffer(i, 0, 0, 0, 0, 0, 0)
                }
            }
    }

    fun createOffer(it: QueueTask): Boolean {
        val player = it.player
        val slot = (player.getVarp(GrandExchange.VARP_SLOT) shr 4)-1
        var state = 1
        val item_id = player.getVarp(GrandExchange.VARP_ITEM_ID)
        var quantity = 1
        val type = player.getVarbit(GrandExchange.VARBIT_OFFER_CREATION_TYPE)
        val price = player.getVarp(GrandExchange.VARP_PRICE)

        var error = false
        var errorType = 0

        if(item_id == -1) { return false }
        when(type) {
            0 -> {
                state = 2
                quantity = player.getVarp(GrandExchange.VARP_QUANITY)

                val coins = player.inventory.getItemCount(Items.COINS_995)
                if(coins < price*quantity) {
                    error = true
                    errorType = 1
                }
            }

            1 -> {
                state = 10
                quantity = (player.getVarp(GrandExchange.VARP_QUANITY)+Int.MAX_VALUE)+1
            }
        }

        if(error) {
            when(errorType) {
                0 -> {
                    player.playSound(GrandExchange.SOUND_ERROR)
                    player.filterableMessage("<col=ff0000>An unknown error occurred talking to the Grand Exchange backend.</col>")
                    return false
                }

                1 -> {
                    player.playSound(GrandExchange.SOUND_ERROR)
                    player.filterableMessage("This offer costs ${price*quantity} coins. You haven't got enough coins.")
                    return false
                }
            }
        }

        if(GEApi.createOffer(player, slot, state, item_id, price, quantity, type)) {
            player.playSound(GrandExchange.SOUND_OFFER_CREATED)
            player.closeGrandExchange()
            player.openGrandExchange()
            if(type == 0) {
                player.inventory.remove(Items.COINS_995, (price*quantity))
            } else {
                player.inventory.remove(item_id, quantity)
            }
        } else {
            player.playSound(GrandExchange.SOUND_ERROR)
            player.filterableMessage("<col=ff0000>An error occurred when trying to create your offer.</col>")
            return false
        }

        return true
    }

    private fun getOfferBySlot(slot: Int, offers: MutableList<GEOffer>): GEOffer? {
        for(offer in offers) {
            if(offer.slot == slot) {
                return offer
            }
        }
        return null
    }

    private fun getReturnItems(offer: GEOffer, world: World): ItemContainer {
        val container = ItemContainer(world.definitions, 2, ContainerStackType.STACK)
        // buy order
        if(offer.type == 0) {
            // completed
            if(offer.state == 5) {
                // Cancelled
                if(offer.quantityFilled == 0 && offer.spent == 0) {
                    container.add(Item(Items.COINS_995, offer.price*offer.quantity))
                } else {
                    val diffCoins = (offer.price*offer.quantity)-offer.spent
                    container.add(Item(offer.item_id, offer.quantityFilled))
                    container.add(Item(Items.COINS_995, diffCoins))
                }
            }
        }
        return container
    }
}