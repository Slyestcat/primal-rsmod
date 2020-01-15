package gg.rsmod.plugins.service.discord.commands

import org.reflections.Reflections

class Registry {

    fun loadCommands() {
        Reflections("gg.rsmod.plugins.service.discord.commands.impl").getSubTypesOf(Command::class.java).forEach { it.newInstance() }
    }

    companion object {
        val commands = mutableSetOf<Command>()

        fun registerCommand(cmd: Command): Boolean = commands.add(cmd)

        fun getCommandByName(name: String): Command? = commands.find { name in it.alias }
    }
}