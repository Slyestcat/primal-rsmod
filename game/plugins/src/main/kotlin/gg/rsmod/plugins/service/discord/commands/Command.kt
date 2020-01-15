package gg.rsmod.plugins.service.discord.commands

import gg.rsmod.plugins.service.discord.utils.ChatUtil
import net.dv8tion.jda.core.MessageBuilder
import net.dv8tion.jda.core.Permission
import net.dv8tion.jda.core.entities.Message
import net.dv8tion.jda.core.entities.MessageEmbed
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import java.util.*
import java.util.function.Consumer

abstract class Command(val name: String,
                       val description: String,
                       val alias: Array<String> = arrayOf(name),
                       val allowPrivate: Boolean = true,
                       val authorExclusive: Boolean = false,
                       val requiredPermissions: Array<Permission> = arrayOf(),
                       val userRequiresPermissions: Boolean = true,
                       val botRequiresPermissions: Boolean = true)
    : EventListener {

    init {
        register()
    }

    abstract fun execute(args: List<String>, e: MessageReceivedEvent)

    private fun register() = Registry.registerCommand(this)

    fun String.toMessage(): Message = MessageBuilder().append(this).build()

    fun MessageReceivedEvent.reply(msg: Message, success: Consumer<Message>? = null)
            = ChatUtil(this).reply(msg, success)

    fun MessageReceivedEvent.reply(embed: MessageEmbed, success: Consumer<Message>? = null)
            = ChatUtil(this).reply(embed, success)

    fun MessageReceivedEvent.reply(text: String, success: Consumer<Message>? = null)
            = ChatUtil(this).reply(text, success)
}