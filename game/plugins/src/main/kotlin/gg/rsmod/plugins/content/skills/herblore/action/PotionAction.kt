package gg.rsmod.plugins.content.skills.herblore.action

import gg.rsmod.game.fs.DefinitionSet
import gg.rsmod.game.fs.def.ItemDef
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.plugins.api.Skills
import gg.rsmod.plugins.api.ext.messageBox
import gg.rsmod.plugins.api.ext.player
import gg.rsmod.plugins.content.skills.herblore.data.PotionData

class PotionAction (private val defs: DefinitionSet) {

    /**
     * A map of attached items to their item names
     */
    private val itemNames = PotionData.potionDefinitions.keys.associate { it to defs.get(ItemDef::class.java, it).name.toLowerCase() }

    /**
     * A map of material ids to their item names
     */
    private val materialNames = PotionData.potionDefinitions.values.flatMap { listOf(it.firstMaterial, it.secondMaterial) }.associate { it to defs.get(ItemDef::class.java, it).name.toLowerCase() }

    /**
     * Handles the attachment of item one to item two
     *
     * @param task      The queued action task
     * @param attached  The attached definition
     * @param amount    The amount of items the player is trying to make
     */
    suspend fun makepotion(task: QueueTask, attached: PotionData, amount: Int) {
        if (!canmake(task, attached))
            return

        val player = task.player
        val inventory = player.inventory

        val firstMaterialCount = inventory.getItemCount(attached.firstMaterial)
        val secondMaterialCount = inventory.getItemCount(attached.secondMaterial)
        val maxCount = Math.min(Math.min(amount, firstMaterialCount), secondMaterialCount)

        // Wait two ticks to follow OSRS behavior
        task.wait(2)
        var completed = 0
        while(completed < maxCount) {
            player.animate(attached.animation)
            task.wait(2)

            player.lock()
            // This is here again to prevent a TOCTTOU attack
            if (!canmake(task, attached, sendMessageBox = false)){
                player.unlock()
                break
            }

            val firstMaterialIndex = inventory.getItemIndex(attached.firstMaterial, true)
            val removeFirstMaterial = inventory.remove(item = attached.firstMaterial, assureFullRemoval = true)
            if (removeFirstMaterial.hasFailed()){
                player.unlock()
                break
            }

            val removeSecondMaterial = inventory.remove(item = attached.secondMaterial, assureFullRemoval = true)
            if (removeSecondMaterial.hasFailed()){
                inventory.add(item = attached.firstMaterial, beginSlot = firstMaterialIndex)
                player.unlock()
                break
            }

            inventory.add(attached.id)
            player.addXp(Skills.HERBLORE, attached.herbxp)
            completed++
            player.unlock()
        }
    }

    /**
     * Checks if the user has the required level, one of each item, and the required tool (if any).
     *
     * @param task              The queued task
     * @param attached          The attached definition
     * @param sendMessageBox    Whether or not to send the error message
     */
    private suspend fun canmake(task: QueueTask, attached: PotionData, sendMessageBox: Boolean = true) : Boolean {
        val player = task.player
        val inventory = player.inventory
        if (inventory.getItemCount(attached.firstMaterial) < 1 || inventory.getItemCount(attached.secondMaterial) < 1) {
            if (sendMessageBox)
                task.messageBox("You need ${materialNames[attached.firstMaterial]} and a ${materialNames[attached.secondMaterial]} to make a ${itemNames[attached.id]}")
            return false
        }
        
        if (player.getSkills().getCurrentLevel(Skills.HERBLORE) < attached.level) {
            if(sendMessageBox)
                task.messageBox("You need a ${Skills.getSkillName(player.world, Skills.HERBLORE)} level of at least ${attached.level} to fletch ${itemNames[attached.id]}.")
            return false
        }

        return true
    }
}