package gg.rsmod.plugins.content.skills.slayer

import gg.rsmod.game.model.entity.Npc
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.plugins.api.Skills.SLAYER
import gg.rsmod.plugins.api.ext.filterableMessage
import gg.rsmod.plugins.api.ext.openShop
import gg.rsmod.plugins.api.ext.player
import kotlin.streams.toList


object SlayerHandler {

    var slayerTask : SlayerTask = SlayerTask.NO_TASK

    /**
     * Handles decreasing the amount for the player's slayer task
     * and handles the experience and completing tasks when the
     * amount reaches 0.
     */
    fun decreaseTask(player: Player,mob : Npc) {

        slayerTask.amount--
        giveExperience(player, mob)

        if(slayerTask.amount == 0) {
            completeTask(player, slayerTask.assignment)
            slayerTask = SlayerTask.NO_TASK
        }
    }

    /**
     * Gives the player an appropriate level of experience based
     * on the [Mob]'s maximum health.
     */
    private fun giveExperience(player: Player, mob : Npc) {
        player.addXp(SLAYER, mob.getMaxHp().toDouble())
    }
    /**
     * Gives the player an appropriate slayer points
     * on the [points]'s number.
*/
    private fun getPoints(points : Int, master : AssignmentMaster) : Int {
            //return when {
           // points % master.pointsRewarded10th == 0 -> master.pointsRewarded10th
          //  points % master.pointsRewarded50th == 0 -> master.pointsRewarded50th
           // points % master.pointsRewarded50th == 0 -> master.pointsRewarded50th
           // points % master.pointsRewarded100th == 0 -> master.pointsRewarded100th
           // points % master.pointsRewarded250th == 0 -> master.pointsRewarded250th
           // points % master.pointsRewarded1000th == 0 -> master.pointsRewarded1000th

        //}
        return master.pointsRewarded
    }

    /**
     * Handles completing a slayer task.
     */
    fun completeTask(player: Player, assignment: SlayerAssignment) {
        player.slayerPoints += getPoints(player.slayerPoints,assignment.master)
        player.slayerTasksDone += 1


        player.filterableMessage("You have completed a" +
                " ${assignment.master.toString().toLowerCase()} slayer task for" +
                " ${getPoints(player.slayerPoints,assignment.master)} points!"

        )
        player.filterableMessage( "Return to a slayer master for a new task.")

    }

    fun checkTask(it: QueueTask) {
        val player = it.player
        var message : String = when {
            slayerTask.amount == 0 -> "You need somthing new to hunt."
            else -> "You're assigned to kill ${slayerTask.assignment.name}; ${slayerTask.amount} more to go."
        }

        player.filterableMessage(message)

    }

    fun hasLevel(player : Player, level : Int, combat : Int) : Boolean {
        return player.getSkills()[SLAYER].currentLevel <= level && player.combatLevel <= combat
    }

    fun giveTask(player: Player, master: AssignmentMaster) {
        slayerTask = SlayerTask(slayerTask.assignment.amount.random(),
                AssignmentRepository.assignments.stream()
                        .filter { it.master == master  && hasLevel(player,it.levelReq,it.combatReq) }
                        .toList()
                        .random() ?: return giveTask(player, AssignmentMaster.MAZCHNA)
        )
    }

    fun openLog() {

    }

    fun open_shop(p: Player) {
        p.openShop("Slayer Equipment")
    }


}