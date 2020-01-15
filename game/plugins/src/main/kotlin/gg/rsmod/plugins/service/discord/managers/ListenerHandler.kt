package gg.rsmod.plugins.service.discord.managers

import gg.rsmod.game.Server
import gg.rsmod.plugins.service.discord.commands.Registry
import gg.rsmod.plugins.service.discord.managers.ConfigManager.prefix
import gg.rsmod.plugins.service.discord.utils.ChatUtil
import net.dv8tion.jda.client.events.group.GroupUserJoinEvent
import net.dv8tion.jda.core.entities.ChannelType
import net.dv8tion.jda.core.events.ReadyEvent
import net.dv8tion.jda.core.events.guild.GuildJoinEvent
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.dv8tion.jda.core.hooks.ListenerAdapter
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent



class ListenerHandler : ListenerAdapter() {



    override fun onReady(e: ReadyEvent) {
        Server.logger.info { "This bot is running on following servers" + e.jda.guilds }
    }



    override fun onGuildMemberJoin(event: GuildMemberJoinEvent) {
        event.user.openPrivateChannel().queue { channel ->
            channel.sendMessage("Hey ${event.user.asMention}, Welcome to **Primal** 💠!").queue()
        }
    }

    override fun onMessageReceived(e: MessageReceivedEvent) {

        val content = e.message.contentRaw
        val selfId = e.jda.selfUser.id

        var prefix = prefix
        if (prefix == "%mention%") {
            prefix = e.jda.selfUser.asMention
        }

        if (content.matches("^<@!?$selfId>$".toRegex())) {
            ChatUtil(e).reply("My prefix for this guild is: **$prefix**")
            return
        }

        val isMentionPrefix = content.matches("^<@!?$selfId>\\s.*".toRegex())
        if (!isMentionPrefix && !content.startsWith(prefix, true))
            return

        prefix = if (isMentionPrefix) content.substring(0, content.indexOf('>') + 1) else prefix
        val index = if (isMentionPrefix) prefix.length + 1 else prefix.length

        val allArgs = content.substring(index).split("\\s+".toRegex())
        val command = Registry.getCommandByName(allArgs[0])
        val args = allArgs.drop(1)

        if (e.isFromType(ChannelType.PRIVATE) && command?.allowPrivate?.not() ?: return)
            return

        command?.execute(args, e)

    }

    override fun onGuildMessageReceived(event: GuildMessageReceivedEvent) {
        if (!event.author.isBot) {
            val message = event.message.contentRaw
            if (message.startsWith(prefix)) {
                event.channel.deleteMessageById(event.messageId).queue()
            }
        }
    }


}