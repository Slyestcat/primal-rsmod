package gg.rsmod.plugins.content.combat


import gg.rsmod.game.model.attr.ANTIFIRE_POTION_CHARGES_ATTR
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.timer.*
import gg.rsmod.plugins.api.HitType
import gg.rsmod.plugins.api.Skills
import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.api.ext.*

//TODO fix stamina pots
//TODO add handler for poison and venom and fix those pots

object Potions {
    enum class Potion(val skill: Int, val base: Int, val percentage: Int, val defaultalgo: Boolean, val message: String, vararg val ids: Int) {
        ATTACK_POTION(Skills.ATTACK, 3, 10,true,"attack potion", Items.ATTACK_POTION4, 121, 123, 125),
        SUPER_ATTACK_POTION(Skills.ATTACK, 5, 15, true, "attack potion" /* sic */, 2436, 145, 147, 149),
        STRENGTH_POTION(Skills.STRENGTH, 3, 10, true, "strength potion", 113, 115, 117, 119),
        SUPER_STRENGTH_POTION(Skills.STRENGTH, 5, 15, true, "strength potion", 2440, 157, 159, 161),
        DEFENCE_POTION(Skills.DEFENCE, 3, 10, true, "defence potion", 2432, 133, 135, 137),
        SUPER_DEFENCE_POTION(Skills.DEFENCE, 5, 15, true, "defence potion", 2442, 163, 165, 167),
        MAGIC_POTION(Skills.MAGIC, 4, 0, true, "magic potion", 3040, 3042, 3044, 3046),
        RANGING_POTION(Skills.RANGED, 4, 10, true, "ranging potion", 2444, 169, 171, 173),
        SARADOMIN_BREW(-1, -1, -1, false, "the foul liquid", 6685, 6687, 6689, 6691),
        SUPER_RESTORE(-1, -1, -1, false, "super restore potion", 3024, 3026, 3028, 3030),
        RESTORE_POTION(-1, -1, -1, false, "stat restoration potion", 2430, 127, 129, 131),
        COMBAT_POTION(-1, -1, -1, false, "combat potion", 9739, 9741, 9743, 9745),
        SUPER_COMBAT_POTION(-1, -1, -1, false, "super combat potion", 12695, 12697, 12699, 12701),
        PRAYER_POTION(-1, -1, -1, false, "restore prayer potion", 2434, 139, 141, 143),
        ANTIPOISON(-1, -1, -1, false, "antipoison potion", 2446, 175, 177, 179),
        SUPERANTIPOISON(-1, -1, -1, false, "antipoison" /*sic*/, 2448, 181, 183, 185),
        ANTIDOTE_PLUS(-1, -1, -1, false, "antidote plus" /*sic*/, 5943, 5945, 5947, 5949),
        ANTIDOTE_PLUSPLUS(-1, -1, -1, false, "antidote plusplus" /*sic*/, 5952, 5954, 5956, 5958),
        ANTIVENOM(-1, -1, -1, false, "anti-venom", 12905, 12907, 12909, 12911),
        ANTIVENOM_PLUS(-1, -1, -1, false, "anti-venom plus", 12913, 12915, 12917, 12919),
        STAMINA_POTION(-1, -1, -1, false, "stamina potion", 12625, 12627, 12629, 12631),
        SANFEW_SERUM(-1, -1, -1, false, "sanfew serum", 10925, 10927, 10929, 10931),
        ENERGY_POTION(-1, -1, -1, false, "energy potion", 3008, 3010, 3012, 3014),
        SUPER_ENERGY_POTION(-1, -1, -1, false, "super energy potion", 3016, 3018, 3020, 3022),
        ANTIFIRE_POTION(-1, -1, -1, false, "antifire potion", 2452, 2454, 2456, 2458),
        EXTENDED_ANTIFIRE_POTION(-1, -1, -1, false, "extended antifire potion", 11951, 11953, 11955, 11957),
        GUTHIX_REST(-1, -1, -1, false, "guthix rest", 4417, 4419, 4421, 4423),
        ZAMORAK_BREW(-1, -1, -1, false, "the foul liquid", 2450, 189, 191, 193),
        SUPER_ANTIFIRE(-1, -1, -1, false, "super antifire", 21978, 21981, 21984, 21987),
        EXTENDED_SUPER_ANTIFIRE(-1, -1, -1, false, "extended super antifire", 22209, 22212, 22215, 22218),

        // ENUM END . Ids are (4) (3) (2) (1)
        ;

        fun nextDose(id: Int): Int {
            for (i in 0..ids.size) {
                if (ids[i] == id)
                    return ids[i + 1]
            }
            return 0
        }

        fun isLastDose(id: Int): Boolean {
            return ids[ids.size - 1] == id
        }

        fun dosesLeft(id: Int): Int {
            for (i in 0..ids.size) {
                if (ids[i] == id)
                    return ids.size - i - 1
            }
            return 0
        }
    }

    @JvmStatic
    fun get(potion_id: Int): Potion? {
        Potion.values().forEach { pot ->
            pot.ids.forEach { id ->
                if (id == potion_id) {
                    return pot
                }
            }
        }

        return null
    }

    fun consume(p: Player, potion: Potion, id: Int) {
      if (p.timers.has(POTION_DELAY))
          return

        p.timers[POTION_DELAY] = 5
        p.timers[FOOD_DELAY] = 3
        val eatAnim = if (4084 == p.equipment[3]?.id ?: -1) 1469 else 829
        p.animate(eatAnim)
        p.playSound(2401)

        if (potion != Potion.ANTIVENOM && potion != Potion.ANTIVENOM_PLUS && potion != Potion.GUTHIX_REST) {
            p.message("You drink some of your " + potion.message + ".")
        }

        deductDose(p, potion, id)
    }

    fun deductDose(p: Player, potion: Potion, id: Int) {
        val inventorySlot = p.getInteractingItemSlot()
        if (potion.isLastDose(id)) {
            p.inventory.remove(id, 1, beginSlot = inventorySlot)
            p.inventory.add(Items.VIAL, 1, beginSlot = inventorySlot)

            if (potion == Potion.ANTIVENOM) {
                p.message("You drink the rest of your antivenom potion.")
            } else if (potion == Potion.ANTIVENOM_PLUS) {
                p.message("You drink the rest of your super antivenom potion.")
            } else if (potion != Potion.GUTHIX_REST) {
                p.message("You have finished your potion.")
            }
        } else {
            p.inventory.remove(item = id, beginSlot = inventorySlot)
            p.inventory.add(item = potion.nextDose(id), beginSlot = inventorySlot)
            val left = potion.dosesLeft(id)

            var doses = if (left == 1) "dose" else "doses"
            if (potion == Potion.ANTIVENOM) {
                p.message("You drink some of your antivenom potion, leaving $left $doses.")
            } else if (potion == Potion.ANTIVENOM_PLUS) {
                p.message("You drink some of your super antivenom potion, leaving $left $doses.")
            } else if (potion != Potion.GUTHIX_REST) {
                p.message("You have $left $doses of your potion left.")
            }
        }

        if (potion.defaultalgo) {
            val change = potion.base + (p.getSkills().getCurrentLevel(potion.skill) * potion.percentage / 100)
            val max = potion.base + (p.getSkills().getMaxLevel(potion.skill) * potion.percentage / 100)
            p.getSkills().boostCurrentLevel(potion.skill, change, max)

        } else if (potion == Potion.SARADOMIN_BREW) {
            val heal = (p.getSkills().getMaxLevel(Skills.HITPOINTS) * 0.15).toInt() + 2
            val def = (p.getSkills().getCurrentLevel(Skills.DEFENCE) * 0.2).toInt() + 2
            val defMax = (p.getSkills().getMaxLevel(Skills.DEFENCE) * 0.2).toInt() + 2
            p.heal(heal, 16)
            p.getSkills().boostCurrentLevel(Skills.DEFENCE, def, defMax)
            val ids = intArrayOf(Skills.ATTACK, Skills.STRENGTH, Skills.MAGIC, Skills.RANGED)

            for (i in ids) {
                val lvl = p.getSkills().getCurrentLevel(i)
                p.getSkills().decrementCurrentLevel(i, -(lvl * 0.1).toInt(), true)
            }
        } else if (potion == Potion.ZAMORAK_BREW) {
            val attackIncrease = (p.getSkills().getCurrentLevel(Skills.ATTACK) * 0.2).toInt() + 2
            val strengthIncrease = (p.getSkills().getCurrentLevel(Skills.STRENGTH) * 0.12).toInt() + 2
            val prayerIncrease = (p.getSkills().getMaxLevel(Skills.PRAYER) * 0.1).toInt()
            val attackMax = (p.getSkills().getMaxLevel(Skills.ATTACK) * 0.2).toInt() + 2
            val strengthMax = (p.getSkills().getMaxLevel(Skills.STRENGTH) * 0.12).toInt() + 2

            val defenceDecrease = (p.getSkills().getMaxLevel(Skills.DEFENCE) * 0.1).toInt() + 2
            val hpDecrease = (p.hitpoints * 1.0).toInt() + 2

            p.getSkills().boostCurrentLevel(Skills.ATTACK, attackIncrease, attackMax)
            p.getSkills().boostCurrentLevel(Skills.STRENGTH, strengthIncrease, strengthMax)
            p.getSkills().boostCurrentLevel(Skills.PRAYER, prayerIncrease, 0)
            p.getSkills().decrementCurrentLevel(Skills.DEFENCE, -defenceDecrease, true)
            p.hit(hpDecrease, HitType.HIT, 0)

        } else if (potion == Potion.SUPER_RESTORE) {
            for (i in 0 until p.getSkills().maxSkills) {
                if (i != Skills.HITPOINTS) {
                    val currentFlat = p.getSkills().getMaxLevel(i)
                    var restorable = (currentFlat * 0.25 + 8).toInt()

                    if (i == Skills.PRAYER) {
                        if (p.inventory.contains(6714)) { // && Equipment.wearingMaxCape(p) Max cape holy wrench effect
                            if (currentFlat in 26..85) {
                                restorable += 1
                            } else if (currentFlat > 85) {
                                restorable += 2
                            }
                        }
                    }
                    p.getSkills().boostCurrentLevel(i, restorable, 0)
                }
            }
        } else if (potion == Potion.RESTORE_POTION) {
            for (i in intArrayOf(Skills.ATTACK, Skills.DEFENCE, Skills.STRENGTH, Skills.MAGIC, Skills.RANGED)) {
                if (i != Skills.HITPOINTS && i != Skills.PRAYER) {
                    val currentFlat = p.getSkills().getMaxLevel(i)
                    var restorable = (currentFlat * 0.30 + 10).toInt()

                    p.getSkills().boostCurrentLevel(i, restorable, 0)
                }
            }
        } else if (potion == Potion.SUPER_COMBAT_POTION) {
            val curStr = p.getSkills().getCurrentLevel(Skills.STRENGTH)
            val curAtk = p.getSkills().getCurrentLevel(Skills.ATTACK)
            val curDef = p.getSkills().getCurrentLevel(Skills.DEFENCE)
            val maxStr = (p.getSkills().getMaxLevel(Skills.STRENGTH) * 0.1).toInt() + 10
            val maxAtk = (p.getSkills().getMaxLevel(Skills.ATTACK) * 0.1).toInt() + 10
            val maxDef = (p.getSkills().getMaxLevel(Skills.DEFENCE) * 0.1).toInt() + 10

            p.getSkills().boostCurrentLevel(Skills.ATTACK, (curAtk * 0.1).toInt() + 10, maxAtk)
            p.getSkills().boostCurrentLevel(Skills.STRENGTH, (curStr * 0.1).toInt() + 10, maxStr)
            p.getSkills().boostCurrentLevel(Skills.DEFENCE, (curDef * 0.1).toInt() + 10, maxDef)

        } else if (potion == Potion.COMBAT_POTION) {
            val curStr = p.getSkills().getCurrentLevel(Skills.STRENGTH)
            val curAtk = p.getSkills().getCurrentLevel(Skills.ATTACK)
            val maxStr = (p.getSkills().getMaxLevel(Skills.STRENGTH) * 0.1).toInt() + 3
            val maxAtk = (p.getSkills().getMaxLevel(Skills.ATTACK) * 0.1).toInt() + 3

            if (curAtk <= maxAtk) {
                p.getSkills().boostCurrentLevel(Skills.ATTACK, (curAtk * 0.1).toInt() + 3, maxAtk )
            } else {
                return
            }
            if (curStr <= maxStr) {
                p.getSkills().boostCurrentLevel(Skills.STRENGTH, (curStr * 0.1).toInt() + 3, maxStr)
            } else {
                return
            }
        } else if (potion == Potion.PRAYER_POTION) {
            val lv = p.getSkills().getMaxLevel(Skills.PRAYER)
            val cur = p.getSkills().getCurrentLevel(Skills.PRAYER)
            val addition = 7 + lv / 4
            var newval = cur + addition
            if (p.inventory.contains(6714)) { //  && Equipment.wearingMaxCape(player)Max cape holy wrench effect
                if (lv in 26..85) {
                    newval += 1
                } else if (lv > 85) {
                    newval += 2
                }
            }
            if (newval < lv) {
                p.getSkills().boostCurrentLevel(Skills.PRAYER, lv, lv)
            } else {
                p.getSkills().boostCurrentLevel(Skills.PRAYER, newval, lv)
            }
        } /*
        else if (potion == Potion.ANTIPOISON) {
            if (Venom.venomed(player))
                Venom.cure(1, player)
            else {
                if (player.varps()[Varp.HP_ORB_COLOR] > -1)
                    player.filterableMessage("It grants you immunity from poison for 90 seconds.")
                Poison.cureAndImmune(player, 6)
            }
        } else if (potion == Potion.SUPERANTIPOISON) {
            if (Venom.venomed(player))
                Venom.cure(1, player)
            else {
                if (player.varps()[Varp.HP_ORB_COLOR] > -1)
                    player.filterableMessage("It grants you immunity from poison for six minutes.")
                Poison.cureAndImmune(player, 23) // Longer immunity is the only difference
            }
        } else if (potion == Potion.ANTIDOTE_PLUS) { // basicaly super super anti poison - doesnt cure venom
            if (player.varps()[Varp.HP_ORB_COLOR] > -1)
                player.filterableMessage("It grants you immunity from poison for nine minutes.")
            Poison.cureAndImmune(player, 35) // 8 mins 45s
        } else if (potion == Potion.ANTIDOTE_PLUSPLUS) {
            if (player.varps()[Varp.HP_ORB_COLOR] > -1)
                player.filterableMessage("It grants you immunity from poison for twelve minutes.")
            Poison.cureAndImmune(player, 48) // 12 mins
        } else if (potion == Potion.ANTIVENOM) {
            Venom.cure(2, player) //  wiki does not specify if it provides immunity!
            Poison.cureAndImmune(player, 12) // 3 mins poison immunity
        } else if (potion == Potion.ANTIVENOM_PLUS) {
            Venom.cure(3, player) // 3 mins venom immunity
            Poison.cureAndImmune(player, 60) // 15 mins poison immunity
        } else if (potion == Potion.STAMINA_POTION) {
            player.varps().varbit(Varbit.STAMINA_POTION, 1)
            player.attr.set(STAMINA, 11)
            player.setRunningEnergy(player.attribOr<Double>(AttributeKey.RUN_ENERGY, 100.0) + 20.0, true)
            /*if (player.weight >= 55) {
                player.message("<col=7F00FF>As you weigh over 54kg, the stamina potions' effects will not work to reduce energy lost when moving.")
            }*/
        } */ else if (potion == Potion.ANTIFIRE_POTION) {

            if (p.attr.has(ANTIFIRE_POTION_CHARGES_ATTR))
                p.filterableMessage("It grants you partial protection from dragonfire for six minutes.")
            p.attr.put(ANTIFIRE_POTION_CHARGES_ATTR, 32)
        } else if (potion == Potion.EXTENDED_ANTIFIRE_POTION) {
            if (p.attr.has(ANTIFIRE_POTION_CHARGES_ATTR))
                p.filterableMessage("It grants you partial protection from dragonfire for twelve minutes.")
            p.attr.put(ANTIFIRE_POTION_CHARGES_ATTR, 62)
        } else if (potion == Potion.SUPER_ANTIFIRE) {
            if (p.attr.has(ANTIFIRE_POTION_CHARGES_ATTR))
                p.filterableMessage("It grants you complete protection from dragonfire for three minutes.")
            p.attr.put(ANTIFIRE_POTION_CHARGES_ATTR, 1010) // 1000 base
        } else if (potion == Potion.EXTENDED_SUPER_ANTIFIRE) {
            if (p.attr.has(ANTIFIRE_POTION_CHARGES_ATTR))
                p.filterableMessage("It grants you complete protection from dragonfire for six minutes.")
            p.attr.put(ANTIFIRE_POTION_CHARGES_ATTR, 1032)
        } /* else if (potion == Potion.SANFEW_SERUM) {
            // Literally super restore & super antipoison in one.
            // Restore effect:
            for (i in 0..Skills.SKILL_COUNT - 1) {
                if (i != Skills.HITPOINTS) {
                    val current_flat = player.skills().xpLevel(i)
                    var restorable = (current_flat * 0.25 + 8).toInt()

                    if (i == Skills.PRAYER) {
                        if (player.inventory().has(6714) && Equipment.wearingMaxCape(player)) { // Max cape holy wrench effect
                            if (current_flat > 25 && current_flat <= 85) {
                                restorable += 1
                            } else if (current_flat > 85) {
                                restorable += 2
                            }
                        }
                    }
                    player.skills().replenishSkill(i, restorable)
                }
            }

            if (Venom.venomed(player)) {
                // Venom turns to poison.
                Venom.cure(1, player)
            } else {
                if (player.varps()[Varp.HP_ORB_COLOR] > -1)
                    player.filterableMessage("It grants you immunity from poison for six minutes.")
                Poison.cureAndImmune(player, 24)
            }
        } */ else if (potion == Potion.ENERGY_POTION) {
            p.runEnergy.plus(10.0)
        } else if (potion == Potion.SUPER_ENERGY_POTION) {
            p.runEnergy.plus(20.0)
        } /* else if (potion == Potion.GUTHIX_REST) {
            it.message("You drink the herbal tea.")
            // Source: https://www.youtube.com/watch?v=IskZmEHfFtM
            // Jak: have also tested on tourny worlds 25/8/16
            // Re-examined 25/11/2017 added venom/poison support as of this video.
            if (Venom.venomed(player)) {
                // Venom turns to poison. doesn't cure poison.
                Venom.cure(1, player, false)
                it.message("The tea dilutes the venom.")
            } else if (player.varps().varp(Varp.HP_ORB_COLOR) > 0) {
                it.message("The tea dilutes some of the poison.")
                player.varps().varp(Varp.HP_ORB_COLOR, Math.max(0, player.varps().varp(Varp.HP_ORB_COLOR) - 8))
            }
            player.heal(5, 5)
            player.setRunningEnergy(player.attribOr<Double>(AttributeKey.RUN_ENERGY, 0.0) + 5, true)
            it.message("The tea boosts your hitpoints.")
        }
    } */

    }
}