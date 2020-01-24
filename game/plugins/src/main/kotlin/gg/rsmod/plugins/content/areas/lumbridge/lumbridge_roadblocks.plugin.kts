package gg.rsmod.plugins.content.areas.lumbridge

val north_varrock = Tile(3267,3329)
for(i in (0..3)) {
    spawn_obj(23848, north_varrock.x+i, north_varrock.z)
}