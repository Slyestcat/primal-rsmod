package gg.rsmod.plugins.service.sql.controllers

import gg.rsmod.game.model.entity.Client
import gg.rsmod.plugins.service.sql.models.*
import gg.rsmod.plugins.service.sql.serializers.Item
import gg.rsmod.plugins.service.sql.serializers.ItemContainer
import gg.rsmod.plugins.service.sql.serializers.SQLSerializer
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction
import gg.rsmod.game.model.attr.NEW_ACCOUNT_ATTR
import gg.rsmod.plugins.api.ext.player

class LoadController: Controller() {

    fun loadPlayer(client: Client): SQLSerializer? {

        var serialize: SQLSerializer? = null

        transaction {
            /*
             * Load the player
             */
            val player = PlayerModel.select {
                PlayerModel.username eq client.loginUsername
            }.firstOrNull() ?: return@transaction

            /*
             * Load items, item attributes and item containers for the player
             */

            val containers: MutableList<ItemContainer> = mutableListOf()

            ItemContainerModel.select {
                ItemContainerModel.playerId eq player[PlayerModel.id]
            }.forEach { container ->
                val items: MutableList<Item> = mutableListOf()

                ItemModel.select {
                    ItemModel.containerId eq container[ItemContainerModel.id]
                }.forEach { item ->

                    val attributes: MutableList<ResultRow> = mutableListOf()

                    ItemAttributeModel.select {
                        ItemAttributeModel.itemId eq item[ItemModel.id]
                    }.forEach { itemAttr ->
                        attributes.add(itemAttr)
                    }

                    items.add(Item(item, attributes))
                }

                containers.add(ItemContainer(items, container))
            }

            /*
             * Load attributes for player
             */

            val attributes: MutableList<ResultRow> = mutableListOf()

            AttributesModel.select {
                AttributesModel.playerId eq player[PlayerModel.id]
            }.forEach {
                attributes.add(it)
            }

            /*
             * Load skills for player
             */

            val skills: MutableList<ResultRow> = mutableListOf()
                SkillModel.select {
                    SkillModel.playerId eq player[PlayerModel.id]
                }.forEach {
                    skills.add(it)
                }

            if (skills.isEmpty()) {
                transaction {

                    // Since there are n skills

                    for (i in 0 until client.getSkills().maxSkills) {
                        SkillModel.insert {
                            it[this.skill] = i
                            it[this.lvl] = 1
                            it[this.xp] = 0.toFloat()
                            it[this.playerId] = player[PlayerModel.id]
                        }
                    }

                    // Lets build the generic inventory

                    ItemContainerModel.insert {
                        it[this.name] = "inventory"
                        it[this.playerId] = player[PlayerModel.id]
                    }

                    ItemContainerModel.insert {
                        it[this.name] = "equipment"
                        it[this.playerId] = player[PlayerModel.id]
                    }

                    ItemContainerModel.insert {
                        it[this.name] = "bank"
                        it[this.playerId] = player[PlayerModel.id]
                    }
                }
                client.attr[NEW_ACCOUNT_ATTR] = true
            }


            /*
             * Load timers for player
             */

            val timers: MutableList<ResultRow> = mutableListOf()

            TimerModel.select {
                TimerModel.playerId eq player[PlayerModel.id]
            }.forEach {
                timers.add(it)
            }

            /*
             * Load varps for player
             */

            val varps: MutableList<ResultRow> = mutableListOf()

            VarpModel.select {
                VarpModel.playerId eq player[PlayerModel.id]
            }.forEach {
                varps.add(it)
            }

            /*
             * Create a [SQLSerializer] of all the data
             */

            serialize = SQLSerializer(player, containers, skills, attributes, timers, varps)
        }

        return serialize
    }

}
