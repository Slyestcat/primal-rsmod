package gg.rsmod.plugins.api.dsl

import gg.rsmod.game.model.item.Item
import gg.rsmod.game.model.npcdrops.NPCDropEntry
import gg.rsmod.game.model.npcdrops.NpcDropTableBuilder
import gg.rsmod.game.plugin.KotlinPlugin

fun KotlinPlugin.set_drop_table(npcId: Int, init: NpcDropsDsl.Builder.() -> Unit) {
    val builder = NpcDropsDsl.Builder()
    init(builder)

    set_drop_table(npcId, builder.build())
}

object NpcDropsDsl {
    @DslMarker
    annotation class DropTableDslMarker

    @DropTableDslMarker
    class Builder {
        private val dropTableBuilder = NpcDropTableBuilder()

        fun build() = dropTableBuilder.build()

        fun config(init: ConfigBuilder.() -> Unit) {
            val builder = ConfigBuilder()
            init(builder)

            dropTableBuilder.setTableRolls(builder.table_rolls)
            dropTableBuilder.setCommonTableChance(builder.common_table_chance)
            dropTableBuilder.setUncommonTableChance(builder.uncommon_table_chance)
            dropTableBuilder.setRareTableChance(builder.rare_drop_table_chance)
            dropTableBuilder.setVeryRareTableChance(builder.very_rare_drop_table_chance)
        }

        fun drop_table(init: DropTableBuilder.() -> Unit) {
            val builder = DropTableBuilder()
            init(builder)

            builder.always_table.forEach { item ->
                dropTableBuilder.getAlwaysTable().add(item)
            }

            builder.common_table.forEach { item ->
                dropTableBuilder.getCommonTable().add(item)
            }

            builder.uncommon_table.forEach { item ->
                dropTableBuilder.getUncommonTable().add(item)
            }

            builder.rare_table.forEach { item ->
                dropTableBuilder.getRareTable().add(item)
            }

            builder.very_rare_table.forEach { item ->
                dropTableBuilder.getVeryRareTable().add(item)
            }
        }
    }


    @DropTableDslMarker
    class ConfigBuilder {
        /**
         * The number of times the normal table will rolled for drops
         */
        var table_rolls: Int = 1

        /**
         * The different loot table chances in percentage [double]. These all must add up to 100.0 for a proper loot table
         */

        var common_table_chance: Double = 95.8984375 // chance: 100.0-the other tables chance sum

        var uncommon_table_chance: Double = 3.125 // chance: 1/32

        var rare_drop_table_chance: Double = 0.78125 // chance: 1/128

        var very_rare_drop_table_chance: Double = 0.1953125 // chance: 1/512
    }

    @DropTableDslMarker
    class DropTableBuilder {
        var always_table: Array<NPCDropEntry> = arrayOf()

        var common_table: Array<NPCDropEntry> = arrayOf()

        var uncommon_table: Array<NPCDropEntry> = arrayOf()

        var rare_table: Array<NPCDropEntry> = arrayOf()

        var very_rare_table: Array<NPCDropEntry> = arrayOf()
    }
}