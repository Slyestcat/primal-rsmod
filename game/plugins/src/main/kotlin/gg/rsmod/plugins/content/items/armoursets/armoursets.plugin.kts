package gg.rsmod.plugins.content.items.armoursets

val BANKBOOTHS = Objs.ALL_BANK_BOOTHS
val BANKERS = Npcs.ALL_BANKERS


BANKBOOTHS.forEach { booth ->
    fouritemsets.values.forEach { set ->
        on_item_on_obj(obj = booth, item = set.item) {
            if (player.inventory.freeSlotCount > 3) {
                if (player.inventory.remove(item = set.item).hasSucceeded()) {
                    player.inventory.add(item = set.item1)
                    player.inventory.add(item = set.item2)
                    player.inventory.add(item = set.item3)
                    player.inventory.add(item = set.item4)
                } else {
                    player.message("Something went wrong.")
                }
            } else {
                player.message("You don't have enough inventory space.")
            }
        }
    }
}

BANKERS.forEach { banker ->
    fouritemsets.values.forEach { set ->
        on_item_on_npc(npc = banker, item = set.item) {
            if (player.inventory.freeSlotCount > 3) {
                if (player.inventory.remove(item = set.item).hasSucceeded()) {
                    player.inventory.add(item = set.item1)
                    player.inventory.add(item = set.item2)
                    player.inventory.add(item = set.item3)
                    player.inventory.add(item = set.item4)
                } else {
                    player.message("Something went wrong.")
                }
            } else {
                player.message("You don't have enough inventory space.")
            }
        }
    }
}

BANKBOOTHS.forEach { booth ->
    threeitemsets.values.forEach { set ->
        on_item_on_obj(obj = booth, item = set.item) {
            if (player.inventory.freeSlotCount > 2) {
                if (player.inventory.remove(item = set.item).hasSucceeded()) {
                    player.inventory.add(item = set.item1)
                    player.inventory.add(item = set.item2)
                    player.inventory.add(item = set.item3)
                } else {
                    player.message("Something went wrong.")
                }
            } else {
                player.message("You don't have enough inventory space.")
            }
        }
    }
}

BANKERS.forEach { banker ->
    threeitemsets.values.forEach { set ->
        on_item_on_npc(npc = banker, item = set.item) {
            if (player.inventory.freeSlotCount > 2) {
                if (player.inventory.remove(item = set.item).hasSucceeded()) {
                    player.inventory.add(item = set.item1)
                    player.inventory.add(item = set.item2)
                    player.inventory.add(item = set.item3)
                } else {
                    player.message("Something went wrong.")
                }
            } else {
                player.message("You don't have enough inventory space.")
            }
        }
    }
}

BANKBOOTHS.forEach { booth ->
    fiveitemsets.values.forEach { set ->
        on_item_on_obj(obj = booth, item = set.item) {
            if (player.inventory.freeSlotCount > 4) {
                if (player.inventory.remove(item = set.item).hasSucceeded()) {
                    player.inventory.add(item = set.item1)
                    player.inventory.add(item = set.item2)
                    player.inventory.add(item = set.item3)
                    player.inventory.add(item = set.item4)
                    player.inventory.add(item = set.item5)
                } else {
                    player.message("Something went wrong.")
                }
            } else {
                player.message("You don't have enough inventory space.")
            }
        }
    }
}

BANKERS.forEach { banker ->
    fiveitemsets.values.forEach { set ->
        on_item_on_npc(npc = banker, item = set.item) {
            if (player.inventory.freeSlotCount > 4) {
                if (player.inventory.remove(item = set.item).hasSucceeded()) {
                    player.inventory.add(item = set.item1)
                    player.inventory.add(item = set.item2)
                    player.inventory.add(item = set.item3)
                    player.inventory.add(item = set.item4)
                    player.inventory.add(item = set.item5)
                } else {
                    player.message("Something went wrong.")
                }
            } else {
                player.message("You don't have enough inventory space.")
            }
        }
    }
}

BANKBOOTHS.forEach { booth ->
    sixitemsets.values.forEach { set ->
        on_item_on_obj(obj = booth, item = set.item) {
            if (player.inventory.freeSlotCount > 5) {
                if (player.inventory.remove(item = set.item).hasSucceeded()) {
                    player.inventory.add(item = set.item1)
                    player.inventory.add(item = set.item2)
                    player.inventory.add(item = set.item3)
                    player.inventory.add(item = set.item4)
                    player.inventory.add(item = set.item5)
                    player.inventory.add(item = set.item6)
                } else {
                    player.message("Something went wrong.")
                }
            } else {
                player.message("You don't have enough inventory space.")
            }
        }
    }
}

BANKERS.forEach { banker ->
    sixitemsets.values.forEach { set ->
        on_item_on_npc(npc = banker, item = set.item) {
            if (player.inventory.freeSlotCount > 5) {
                if (player.inventory.remove(item = set.item).hasSucceeded()) {
                    player.inventory.add(item = set.item1)
                    player.inventory.add(item = set.item2)
                    player.inventory.add(item = set.item3)
                    player.inventory.add(item = set.item4)
                    player.inventory.add(item = set.item5)
                    player.inventory.add(item = set.item6)
                } else {
                    player.message("Something went wrong.")
                }
            } else {
                player.message("You don't have enough inventory space.")
            }
        }
    }
}




