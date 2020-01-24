package gg.rsmod.plugins.content.admin

import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.api.ext.message

class AdminPrivilege {
    companion object {
        fun check(player: Player, privilege: String, item: Int) {
            if(!player.privilege.powers.contains(privilege.toLowerCase())) {
                player.inventory.remove(item = item, assureFullRemoval = true)
                player.message("<col=ff0000>You are no longer an Mod and should not have this item!</col>")
                return
            }
        }
    }
}