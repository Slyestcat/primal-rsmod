package gg.rsmod.plugins.content.modules.tutorialisland.skills

import gg.rsmod.plugins.content.skills.fishing.FishingLocation
import gg.rsmod.plugins.content.skills.fishing.FishingSpot
import gg.rsmod.plugins.content.skills.fishing.FishingSpots

val fishing = FishingLocation()
fishing.spots.add(FishingSpot(FishingSpots.TUTORIAL_NET, Tile(3103,3092,0)))
fishing.spots.add(FishingSpot(FishingSpots.TUTORIAL_NET, Tile(3101, 3092,0)))
fishing.spots.add(FishingSpot(FishingSpots.TUTORIAL_NET, Tile(3099,3090,0)))
fishing.numberOfFishingSpots = 3
fishing.register()