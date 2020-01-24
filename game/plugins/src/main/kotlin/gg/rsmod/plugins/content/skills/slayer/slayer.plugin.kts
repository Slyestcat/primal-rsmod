
import gg.rsmod.game.model.attr.KILLER_ATTR
import gg.rsmod.plugins.content.magic.TeleportType
import gg.rsmod.plugins.content.magic.teleport
import gg.rsmod.plugins.content.skills.slayer.AssignmentRepository
import gg.rsmod.plugins.content.skills.slayer.SlayerHandler
import gg.rsmod.plugins.content.skills.slayer.SlayerHandler.decreaseTask
import net.runelite.cache.definitions.NpcDefinition


AssignmentRepository.assignments.forEach { mob ->
    mob.mobIds.forEach { obj ->

        on_npc_death(npc = obj) {
            if(npc.name.startsWith(obj) || npc.name.endsWith(obj.toLowerCase())) {
                val killer = npc.attr[KILLER_ATTR]?.get()
                decreaseTask(killer as Player,npc)
            }
        }
    }

}


