package gg.rsmod.plugins.service.discord.managers

import net.dv8tion.jda.core.events.message.MessageReceivedEvent

object ConfigManager {

    const val prefix = "::"

    const val icon = "https://cdn.discordapp.com/icons/229804104698953730/87bb24db784d792eec9876d13f5194b1.png"

    const val name = "Primal"

    var event : MessageReceivedEvent? = null

}

