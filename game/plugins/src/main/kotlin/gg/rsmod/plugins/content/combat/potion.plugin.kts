import gg.rsmod.plugins.content.combat.Potions

val STAT_REPLENISH = TimerKey()

on_login {
    player.timers[STAT_REPLENISH] = 100
}

on_timer(STAT_REPLENISH) {
    player.getSkills().replenishStats()
    player.timers[STAT_REPLENISH] = 100
}

Potions.Potion.values().forEach { pot ->
    pot.ids.forEach { id ->
        on_item_option(item = id, option = "drink") {
            Potions.consume(p = player, potion = pot, id = id)
        }
        on_item_option(item = id, option = "empty") {
            player.inventory.remove(id, 1, beginSlot = player.getInteractingItemSlot())
            if (id == Items.GUTHIX_REST1 || id == Items.GUTHIX_REST2 || id == Items.GUTHIX_REST3 || id == Items.GUTHIX_REST4) {
                player.inventory.add(Items.EMPTY_CUP)
                player.message("You empty the cup.")
            } else {
                player.inventory.add(Items.VIAL)
                player.message("You empty the vial.")
            }
        }
    }
}