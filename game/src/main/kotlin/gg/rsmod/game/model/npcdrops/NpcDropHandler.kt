package gg.rsmod.game.model.npcdrops

import gg.rsmod.game.model.Tile
import gg.rsmod.game.model.entity.GroundItem
import gg.rsmod.game.model.entity.Npc
import gg.rsmod.game.model.entity.Player
import java.lang.Math.random
import kotlin.math.nextUp
import kotlin.random.Random

class NpcDropHandler {
    companion object {
        fun processDrop(npc: Npc, killer: Player, deathTile: Tile) {
            val dropDef = npc.dropTableDef

            // Spawn always table items
            dropDef.always_table.forEach { drop ->
                val preItem = drop.getItem()
                npc.world.spawn(GroundItem(preItem.id, preItem.amount, deathTile, killer))
            }

            // For each roll
            var roll: Int = 1
            while(roll <= dropDef.table_rolls) {

                var table: MutableList<NPCDropEntry>? = null

                while(table == null) {

                    if(dropDef.very_rare_table.size == 0 && dropDef.rare_table.size == 0 && dropDef.uncommon_table.size == 0 && dropDef.common_table.size == 0) {
                        break
                    }

                    val rand_table = Random.nextDouble(0.0, 100.00)
                    if (rand_table <= dropDef.very_rare_table_chance && dropDef.very_rare_table.size > 0) {
                        table = dropDef.very_rare_table
                        break
                    } else if (rand_table <= dropDef.rare_table_chance && dropDef.rare_table.size > 0) {
                        table = dropDef.rare_table
                        break
                    } else if (rand_table <= dropDef.uncommon_table_chance && dropDef.uncommon_table.size > 0) {
                        table = dropDef.uncommon_table
                        break
                    } else if (rand_table <= dropDef.common_table_chance && dropDef.common_table.size > 0) {
                        table = dropDef.common_table
                        break
                    }
                }

                if(table != null) {
                    // Choose random item from table
                    var tableItemIndex = 0
                    if(table.size > 1) {
                        tableItemIndex = (0..(table.size-1)).random()
                    }

                    val item = table.get(tableItemIndex).getItem()
                    npc.world.spawn(GroundItem(item.id, item.amount, deathTile, killer))
                }
                roll++
            }
        }
    }
}