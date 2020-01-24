package gg.rsmod.plugins.content.skills.slayer

import gg.rsmod.game.model.Tile
import gg.rsmod.plugins.content.skills.slayer.AssignmentRepository.assignments

class SlayerAssignment(val name: String, val location: Tile, val levelReq: Int, val combatReq: Int, val master: AssignmentMaster, val amount: IntRange, val mobIds: List<String>) {

    companion object {

        val NO_ASSIGNMENT = assignment("", Tile(0, 0), 0,0, AssignmentMaster.MAZCHNA, 0..0) { mob{""} }

        /**
         * Creates an assignment.
         */
        fun assignment(name : String, location : Tile, levelReq : Int, combatReq : Int,master: AssignmentMaster, amount : IntRange, ids : AssignmentBuilder.() -> List<String>) : SlayerAssignment{
            return SlayerAssignment(name, location, levelReq,combatReq, master, amount, ids.invoke(AssignmentBuilder()))
        }

        /**
         * Finds the assignment for the provided name and
         * returns it ot [NO_TASK] if none is found to match.
         */
        fun forName(name : String) : SlayerAssignment {
            return assignments.stream().filter { it.name == name }.findAny().orElse(NO_ASSIGNMENT)
        }
    }

    /**
     * Checks if the mob provided is part of the assignment.
     */
    fun isMob(id : String) : Boolean {
        println("ID: $id mobs $mobIds")
        return mobIds.contains(id)
    }
}

/**
 * Used to build assignments.
 */
class AssignmentBuilder {

    val mobsList = emptyList<String>().toMutableList()

    fun mob(id : () -> String) : List<String> {
        mobsList.add(id.invoke())
        return mobsList
    }

}
