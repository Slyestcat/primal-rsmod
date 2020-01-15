package gg.rsmod.plugins.content.modules.tutorialisland

import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.queue.TaskPriority
import gg.rsmod.plugins.api.ext.playSong

class MusicPlayer {
    fun repeatSong(player: Player, song: Int, repeatTicks: Int) {
        player.queue(TaskPriority.STRONG) {
            player.playSong(song)
            wait(repeatTicks)
            repeatSong(player, song, repeatTicks)
        }
    }
}