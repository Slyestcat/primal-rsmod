package gg.rsmod.game.message.encoder

import gg.rsmod.game.message.MessageEncoder
import gg.rsmod.game.message.impl.GrandExchangeOfferMessage

class GrandExchangeOfferEncoder: MessageEncoder<GrandExchangeOfferMessage>() {
    override fun extract(message: GrandExchangeOfferMessage, key: String): Number = when(key) {
        "slot" -> message.slot
        "state" -> message.state
        "itemId" -> message.itemId
        "price" -> message.price
        "quantity" -> message.quantity
        "quantityFilled" -> message.quantityFilled
        "spent" -> message.spent
        else -> throw Exception("Unhandled key value.")
    }

    override fun extractBytes(message: GrandExchangeOfferMessage, key: String): ByteArray = throw Exception("Unhandled key value.")
}