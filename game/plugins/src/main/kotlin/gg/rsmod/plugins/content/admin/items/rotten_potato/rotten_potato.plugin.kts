package gg.rsmod.plugins.content.admin.items.rotten_potato

import gg.rsmod.game.model.priv.Privilege

on_item_option(Items.ROTTEN_POTATO,"eat") {
    checkPrivileges(player, Privilege.ADMIN_POWER, Items.ROTTEN_POTATO)
    player.queue(TaskPriority.STRONG) { RottenPotatoMenu().openEatMenu(this) }
}

fun checkPrivileges(player: Player, privilege: String, item: Int) {
    if(!player.privilege.powers.contains(privilege.toLowerCase())) {
        player.inventory.remove(item = Items.ROTTEN_POTATO, assureFullRemoval = true)
        player.message("<col=ff0000>You are no longer an Mod and should not have this item!</col>")
        return
    }
}