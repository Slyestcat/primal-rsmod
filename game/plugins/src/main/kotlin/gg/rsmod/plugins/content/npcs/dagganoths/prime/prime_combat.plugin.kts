package gg.rsmod.plugins.content.npcs.dagganoths.prime

import gg.rsmod.game.model.combat.AttackStyle
import gg.rsmod.game.model.combat.CombatClass
import gg.rsmod.game.model.combat.CombatStyle
import gg.rsmod.plugins.content.combat.*
import gg.rsmod.plugins.content.combat.formula.MagicCombatFormula


on_npc_combat(Npcs.DAGANNOTH_PRIME) {
    npc.queue {
        combat(this)
    }
}

suspend fun combat(it: QueueTask) {
    val npc = it.npc
    var target = npc.getCombatTarget() ?: return

    while (npc.canEngageCombat(target)) {
        npc.facePawn(target)
        if (npc.moveToAttackRange(it, target, distance = 6, projectile = true) && npc.isAttackDelayReady()) {
            magic_attack(npc, target)
            npc.postAttackLogic(target)
        }
        it.wait(1)
        target = npc.getCombatTarget() ?: break
    }

    npc.resetFacePawn()
    npc.removeCombatTarget()
}

fun magic_attack(npc: Npc, target: Pawn) {
        val projectile = npc.createProjectile(target, gfx = 162, startHeight = 50, endHeight = 28, delay = 16, angle = 22, steepness = 25)
        npc.prepareAttack(CombatClass.MAGIC, CombatStyle.MAGIC, AttackStyle.ACCURATE)
        npc.animate(2854)
        world.spawn(projectile)
    if (MagicCombatFormula.getAccuracy(npc, target) >= world.randomDouble()) {
        target.hit(world.random(50), type = HitType.HIT, delay = 1)
    } else {
        target.hit(damage = 0, type = HitType.BLOCK, delay = 1)
    }
}

