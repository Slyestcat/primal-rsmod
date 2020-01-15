package gg.rsmod.plugins.service.discord.commands.impl

import gg.rsmod.plugins.service.discord.commands.Command
import gg.rsmod.plugins.service.discord.utils.ChatUtil
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import java.util.function.Consumer


class PingCmd : Command(name = "ping", description = "Ping to Discord's servers") {

    override fun execute(args: List<String>, e: MessageReceivedEvent) {
        var time = System.currentTimeMillis()
        e.reply("Pinging...", Consumer {
            time = (System.currentTimeMillis() - time) / 2
            ChatUtil.edit(it, "**Ping:** ${time}ms")
        })
    }
}