package gg.rsmod.plugins.content.modules.tutorialisland.npcs

import gg.rsmod.plugins.api.GameframeTab
import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.api.cfg.Npcs
import gg.rsmod.plugins.api.ext.*
import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

on_npc_option(Npcs.MINING_INSTRUCTOR, "talk-to") {
    player.queue {
        val state = player.getVarp(TutorialIsland.COMPLETION_VARP)

        if(state == 260) {
            chatNpc(npc = Npcs.MINING_INSTRUCTOR, title = "Mining Instructor", animation = 591, message = "Hi there. You must be new around here. So what do I<br>call you? 'Newcomer' seems so impersonal, and if we're<br>going to be working together, I'd rather call you by<br>name.")
            chatPlayer(message = "You can call me ${player.username}.", animation = 588)
            chatNpc(npc = Npcs.MINING_INSTRUCTOR, title= "Mining Instructor", animation = 589, message = "Ok then, ${player.username}. My name is Dezzick and I'm a<br>miner by trade. Let's teach you how to mine.")
            chatNpc(npc = Npcs.MINING_INSTRUCTOR, title = "Mining Instructor", animation = 570, message = "Mining is very simple, all you need is a pickaxe. The<br>rocks around here contain tin and copper. Why don't<br>you get started by mining some? If you're unsure<br>which is which, you can prospect them to find out.")

            player.setVarp(TutorialIsland.COMPLETION_VARP, 270)
            player.inventory.add(Items.BRONZE_PICKAXE, 1)
            player.focusTab(GameframeTab.INVENTORY)
            itemMessageBox(item = Items.BRONZE_PICKAXE, message = "The mining instructor gives you a <col=000080>bronze pickaxe<col=000000>.")
            TutorialIsland().process(player)
        }
    }
}