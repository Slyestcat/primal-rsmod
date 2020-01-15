package gg.rsmod.plugins.content.modules.grandexchange.npcs.bankers

import gg.rsmod.plugins.api.cfg.Npcs
import gg.rsmod.plugins.api.ext.player
import gg.rsmod.plugins.content.inter.bank.openBank

val BANKERS = intArrayOf(Npcs.BANKER_2117, Npcs.BANKER_2118, Npcs.BANKER_2119)

BANKERS.forEach { npc ->
    on_npc_option(npc, "bank", 1) {
        player.openBank()
    }
}