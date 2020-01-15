package gg.rsmod.plugins.content.modules.grandexchange.api

import com.google.gson.Gson
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.service.serializer.api.Api
import gg.rsmod.plugins.content.modules.grandexchange.GEOffer

object GEApi {
    val props = Api.props

    fun getOffers(player: Player): MutableList<GEOffer> {
        val url = "${props.get<String>("api_url")!!}/grandexchange/offer"
        val response = khttp.get(
                url = url,
                headers = mapOf(
                        "Accept" to "application/json",
                        "Authorization" to "Bearer ${player.accessToken}"
                )
        )
        return Gson().fromJson(response.text, Array<GEOffer>::class.java).toMutableList()
    }

    fun createOffer(player: Player, slot: Int, state: Int, item_id: Int, price: Int, quantity: Int, type: Int): Boolean {
        val url = "${props.get<String>("api_url")!!}/grandexchange/offer"

        val response = khttp.post(
                url = url,
                data = mapOf(
                        "slot" to slot,
                        "state" to state,
                        "item_id" to item_id,
                        "price" to price,
                        "quantity" to quantity,
                        "type" to type
                ),
                headers = mapOf(
                        "Accept" to "application/json",
                        "Authorization" to "Bearer ${player.accessToken}"
                )
        )
        if(response.statusCode != 200) {
            return false
        }
        return true
    }
}