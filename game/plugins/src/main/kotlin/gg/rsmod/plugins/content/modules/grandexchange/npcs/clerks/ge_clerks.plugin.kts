package gg.rsmod.plugins.content.modules.grandexchange.npcs.clerks

import gg.rsmod.plugins.api.cfg.Npcs
import gg.rsmod.plugins.api.ext.player

val CLERKS = intArrayOf(Npcs.GRAND_EXCHANGE_CLERK, Npcs.GRAND_EXCHANGE_CLERK_2149, Npcs.GRAND_EXCHANGE_CLERK_2150, Npcs.GRAND_EXCHANGE_CLERK_2151)

CLERKS.forEach { npc ->
    on_npc_option(npc, "exchange", 1) {
        player.openGrandExchange()
    }
}