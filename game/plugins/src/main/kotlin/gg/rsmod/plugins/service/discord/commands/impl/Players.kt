package gg.rsmod.plugins.service.discord.commands.impl

import gg.rsmod.plugins.service.discord.commands.Command
import gg.rsmod.plugins.service.discord.managers.ConfigManager
import gg.rsmod.plugins.service.discord.managers.ConfigManager.icon
import gg.rsmod.plugins.service.discord.utils.ChatUtil
import net.dv8tion.jda.core.EmbedBuilder
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.runelite.http.api.worlds.World
import java.awt.Color
import java.util.function.Consumer
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.util.*


class Players : Command(name = "players", description = "Returns Players Online") {

    override fun execute(args: List<String>, e: MessageReceivedEvent) {


        val eb = EmbedBuilder()

        eb.setDescription("```World 1: 1 Player online```")
        eb.setColor(Color.ORANGE)
        eb.setTimestamp(OffsetDateTime.parse("2019-08-01T20:01:22.077Z"))
        eb.setFooter("Primal", ConfigManager.icon)
        eb.setAuthor(e.author.name, e.author.avatarUrl, e.author.avatarUrl)
         .build()
        e.channel.sendMessage(eb.build()).queue()
    }
}