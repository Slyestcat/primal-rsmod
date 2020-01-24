package gg.rsmod.plugins.content.skills.herblore.action

import gg.rsmod.plugins.content.skills.herblore.data.PotionData

val attachedDefs = PotionData.potionDefinitions

/**
 * The item attaching action instance
 */
val attachAction = PotionAction(world.definitions)

/**
 * Handles using the firstMaterial on the secondMaterial
 */
attachedDefs.values.forEach { attached ->
    on_item_on_item(item1 = attached.firstMaterial, item2 = attached.secondMaterial) { makeAttached(player, attached.id) }
}

/**
 * Opens the prompt to get the quantity to attach unless they can only attach one
 *
 * @param player    The player instance
 * @param attached  The attached item ID the user is trying to make
 */
fun makeAttached(player: Player, attached: Int) {
    val attachedDef = attachedDefs[attached] ?: return
    val maxAttached = Math.min(player.inventory.getItemCount(attachedDef.firstMaterial), player.inventory.getItemCount(attachedDef.secondMaterial))
    when (maxAttached) {
        0 -> return
        1 -> attach(player, attached, 1)
        else -> player.queue { produceItemBox(attachedDef.id, type = 10,  maxItems = maxAttached, logic = ::attach) }
    }
}

/**
 * Handles the attachment into the selected item
 *
 * @param player    The player instance
 * @param item      The attached item id the player is trying make
 * @param amount    The number of items the player is trying to make
 */

fun attach(player: Player, item: Int, amount: Int) {
    val attachedDef = attachedDefs[item] ?: return

    player.interruptQueues()
    player.resetInteractions()
    player.queue {
        attachAction.makepotion(this, attachedDef, amount)
    }
}
