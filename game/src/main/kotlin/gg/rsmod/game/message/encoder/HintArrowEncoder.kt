package gg.rsmod.game.message.encoder

import gg.rsmod.game.message.MessageEncoder
import gg.rsmod.game.message.impl.HintArrowMessage

class HintArrowEncoder : MessageEncoder<HintArrowMessage>() {
    override fun extract(message: HintArrowMessage, key: String): Number = when(key) {
        "arrow_type" -> message.arrow_type
        "index_or_x" -> message.index_or_x
        "arrow_y" -> message.arrow_y
        "offset_z" -> message.offset_z
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: HintArrowMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}