package gg.rsmod.plugins.content.areas.lumbridge.shops

import gg.rsmod.plugins.content.mechanics.shops.CoinCurrency

spawn_npc(Npcs.BOB, 3230, 3203, 0, 2)


create_shop("Bob's Brilliant Axes.", CoinCurrency()) {
    items[0] = ShopItem(Items.BRONZE_PICKAXE, 5, 1, 0)
    items[1] = ShopItem(Items.BRONZE_AXE, 10, 16,9)
    items[2] = ShopItem(Items.IRON_AXE, 5, 56, 33)
    items[3] = ShopItem(Items.STEEL_AXE, 3, 200, 120)
    items[4] = ShopItem(Items.IRON_BATTLEAXE, 5, 182, 109)
    items[5] = ShopItem(Items.STEEL_BATTLEAXE, 2, 650, 390)
    items[6] = ShopItem(Items.MITHRIL_BATTLEAXE, 1, 1690, 1014)
}


//on_npc_option(Npcs.BOB, "talk-to") {
//    player.queue { talkToInit(this) }
//}

//on_npc_option(Npcs.BOB, "trade") {
//    player.openShop("Bob's Brilliant Axes")
//}

suspend fun talkToInit(it: QueueTask) {
    when(it.options("Give me a quest!", "Have you anything to sell?", "Can you repair my items for me?")) {
        1 -> {
            it.chatPlayer("Give me a quest!")
            it.chatNpc(npc = Npcs.BOB, message = "Get yer' own!")
        }
        2 -> {
            it.chatPlayer("Have you anything to sell?")
            it.chatNpc(npc = Npcs.BOB, message = "Yes! I buy and sell axes! Take your pick (or axe)!")
            it.player.openShop("Bob's Brilliant Axes.")
        }
    }
}