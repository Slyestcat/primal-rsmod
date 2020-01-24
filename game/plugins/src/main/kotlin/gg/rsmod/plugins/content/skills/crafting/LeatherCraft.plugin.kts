package gg.rsmod.plugins.content.skills.crafting

import gg.rsmod.plugins.content.skills.crafting.data.Leathers
import gg.rsmod.game.model.attr.OTHER_ITEM_ID_ATTR
import gg.rsmod.game.model.attr.INTERACTING_ITEM_ID

val leatherDefs = Leathers.leatherDefinitions

/**
 * The whittling action instance
 */


/**
 * Handles using a knife on logs
 */
leatherDefs.keys.forEach { leathers ->
    on_item_on_item(item1 = Items.NEEDLE, item2 = leathers) {
        craftLeather(player, leathers) }
}

/**
 * Opens the prompt to show the log's fletchable items
 *
 * @param player    The player instance
 */
fun craftLeather(player: Player, leatherItem: Int) {
    val craftables = leatherDefs[leatherItem]?.values?.map { craftable -> craftable.id }?.toIntArray() ?: return
    player.queue { produceItemBox(*craftables, type = 12, logic = ::leather) }
}

/**
 * Handles the whittling of the log into the selected item
 *
 * @param player    The player instance
 * @param item      The item the player is trying to whittle the log into
 * @param amount    The number of items the player is trying to smelt
 */

fun leather(player: Player, item: Int, amount: Int) {
    val leatherItem = if(leatherDefs.containsKey(player.attr[INTERACTING_ITEM_ID])){
        player.attr[INTERACTING_ITEM_ID]
    } else if(leatherDefs.containsKey(player.attr[OTHER_ITEM_ID_ATTR])){
        player.attr[OTHER_ITEM_ID_ATTR]
    } else {
        null
    }
    leatherItem ?: return

    val leatherOptions = leatherDefs[leatherItem]?.get(item) ?: return

    player.interruptQueues()
    player.resetInteractions()
    player.queue {
        //leatherAction.leathers(this, leatherItem, leatherOptions, amount)
    }
}