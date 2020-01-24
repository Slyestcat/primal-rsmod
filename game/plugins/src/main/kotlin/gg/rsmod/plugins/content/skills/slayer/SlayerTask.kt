package gg.rsmod.plugins.content.skills.slayer


class SlayerTask(var amount : Int, val assignment : SlayerAssignment) {

    companion object {
        val NO_TASK = SlayerTask(0, SlayerAssignment.NO_ASSIGNMENT)

    }



}