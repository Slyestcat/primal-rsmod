
import gg.rsmod.plugins.content.skills.prayer.Prayer
import gg.rsmod.plugins.content.skills.prayer.bones

bones.forEach { bone ->

    on_item_option(item = bone.item, option = "Bury") {
        val item = player.getInteractingItem()
        player.queue {
            Prayer.start(this, item,bone)
        }
    }

    on_item_on_npc(item = bone.item + 1, npc = Npcs.ELDER_CHAOS_DRUID_7995) {
        player.queue {
            var item = player.getInteractingItem()
            Prayer.dialog(this,item)
        }
    }


}


