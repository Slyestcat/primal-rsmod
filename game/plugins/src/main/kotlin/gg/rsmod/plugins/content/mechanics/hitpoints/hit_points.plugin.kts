package gg.rsmod.plugins.content.mechanics.hitpoints

on_login {
    player.timers[Hitpoints.RECOVERY] = 100
}

on_timer(Hitpoints.RECOVERY) {
    player.timers[Hitpoints.RECOVERY] = 100
    Hitpoints.recovery(player)
}