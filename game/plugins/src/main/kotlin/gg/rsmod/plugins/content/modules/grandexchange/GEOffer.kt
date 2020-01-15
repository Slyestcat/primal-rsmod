package gg.rsmod.plugins.content.modules.grandexchange

data class  GEOffer(
        val id: Int,
        val username: String,
        val slot: Int,
        val state: Int,
        val item_id: Int,
        val price: Int,
        val quantity: Int,
        val quantityFilled: Int,
        val spent: Int,
        val type: Int,
        val quantityCollected: Int,
        val coinsCollected: Int
)