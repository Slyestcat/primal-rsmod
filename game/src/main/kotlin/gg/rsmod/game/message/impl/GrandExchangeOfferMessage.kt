package gg.rsmod.game.message.impl

import gg.rsmod.game.message.Message

data class GrandExchangeOfferMessage(val slot: Int, val state: Int, val itemId: Int, val price: Int, val quantity: Int, val quantityFilled: Int, val spent: Int): Message