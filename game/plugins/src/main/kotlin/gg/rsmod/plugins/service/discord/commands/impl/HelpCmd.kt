package gg.rsmod.plugins.service.discord.commands.impl

import gg.rsmod.plugins.service.discord.commands.Command
import gg.rsmod.plugins.service.discord.commands.Registry
import gg.rsmod.plugins.service.discord.managers.ConfigManager
import gg.rsmod.plugins.service.discord.utils.ChatUtil
import net.dv8tion.jda.core.EmbedBuilder
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import java.awt.Color
import java.time.OffsetDateTime
import java.util.function.Consumer


class HelpCmd : Command(name = "help", description = "List of Commands") {

    override fun execute(args: List<String>, e: MessageReceivedEvent) {


        val commandsText = StringBuilder("")

        for (command in Registry.commands) {
            commandsText.append(command.name + " - ${command.description}\n")

        }

        val eb = EmbedBuilder()


        eb.setDescription(commandsText)
        eb.setColor(Color.ORANGE)
        eb.setTimestamp(OffsetDateTime.parse("2019-08-01T20:01:22.077Z"))
        eb.setFooter("Primal", ConfigManager.icon)
        eb.setAuthor(e.author.name, e.author.avatarUrl, e.author.avatarUrl)
                .build()

        e.channel.sendMessage(eb.build()).queue()

    }
}