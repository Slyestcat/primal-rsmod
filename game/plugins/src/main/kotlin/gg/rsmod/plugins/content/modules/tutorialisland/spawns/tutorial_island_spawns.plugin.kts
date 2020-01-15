package gg.rsmod.plugins.content.modules.tutorialisland.spawns

import gg.rsmod.game.model.Tile
import gg.rsmod.game.model.entity.Npc
import gg.rsmod.plugins.api.cfg.Npcs
import gg.rsmod.plugins.content.modules.tutorialisland.TutorialIsland

val GIELINOR_GUIDE = Npc(Npcs.GIELINOR_GUIDE, Tile(3094,3109, 0), world)
GIELINOR_GUIDE.respawns = true
GIELINOR_GUIDE.walkRadius = 3
world.spawn(GIELINOR_GUIDE)
TutorialIsland.GUIDE_NPC_INDEX = GIELINOR_GUIDE.index

val SURVIVAL_EXPERT = Npc(Npcs.SURVIVAL_EXPERT, Tile(3103, 3096, 0), world)
SURVIVAL_EXPERT.respawns = true
SURVIVAL_EXPERT.walkRadius = 2
world.spawn(SURVIVAL_EXPERT)
TutorialIsland.SURVIVAL_EXPERT_NPC_INDEX = SURVIVAL_EXPERT.index

val MASTER_CHEF = Npc(Npcs.MASTER_CHEF, Tile(3075, 3084,0), world)
MASTER_CHEF.respawns = true
MASTER_CHEF.walkRadius = 2
world.spawn(MASTER_CHEF)
TutorialIsland.MASTER_CHEF_NPC_INDEX = MASTER_CHEF.index

val QUEST_GUIDE = Npc(Npcs.QUEST_GUIDE, Tile(3086,3122,0), world)
QUEST_GUIDE.respawns = true
QUEST_GUIDE.walkRadius = 2
world.spawn(QUEST_GUIDE)
TutorialIsland.QUEST_GUIDE_NPC_INDEX = QUEST_GUIDE.index

val MINING_INSTRUCTOR = Npc(Npcs.MINING_INSTRUCTOR, Tile(3081, 9505, 0), world)
MINING_INSTRUCTOR.respawns = true
MINING_INSTRUCTOR.walkRadius = 2
world.spawn(MINING_INSTRUCTOR)
TutorialIsland.MINING_INSTRUCTOR_NPC_INDEX = MINING_INSTRUCTOR.index

