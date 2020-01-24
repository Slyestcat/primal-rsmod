package gg.rsmod.plugins.content.admin.items.rotten_strawberry

import gg.rsmod.game.model.priv.Privilege
import gg.rsmod.plugins.content.admin.AdminPrivilege

on_item_option(Items.ROTTEN_STRAWBERRY, "king black dragon") {
    AdminPrivilege.check(player, Privilege.ADMIN_POWER, Items.ROTTEN_STRAWBERRY)
    player.queue(TaskPriority.STANDARD) { RottenStrawberryMenu().openTestMenu(this) }
}