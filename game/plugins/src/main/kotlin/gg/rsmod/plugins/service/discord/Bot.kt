package gg.rsmod.plugins.service.discord

import gg.rsmod.game.Server
import gg.rsmod.game.model.World
import gg.rsmod.game.service.Service
import gg.rsmod.plugins.service.discord.commands.Registry
import gg.rsmod.plugins.service.discord.managers.ListenerHandler
import gg.rsmod.util.ServerProperties
import net.dv8tion.jda.core.AccountType
import net.dv8tion.jda.core.JDABuilder
import net.dv8tion.jda.core.OnlineStatus
import net.dv8tion.jda.core.entities.Game
import kotlin.system.exitProcess
import javax.security.auth.login.LoginException

class Bot : Service {


    var builder: JDABuilder = JDABuilder(AccountType.BOT)

    override fun init(server: Server, world: World, serviceProperties: ServerProperties) {
        Registry().loadCommands()
        try {

            builder.setStatus(OnlineStatus.ONLINE)
            builder.addEventListener(ListenerHandler())
            builder.setGame(Game.of(Game.GameType.DEFAULT, "Primal | ::help"))
            builder.setToken("NjY2NjY0MjU0MDAyMjk4OTA0.Xh3dvw.F_Wum3nrze-bREA-l-0ky6aeI2g")
            builder.buildBlocking()

        } catch (ex: LoginException) {
            exitProcess(ExitStatus.INVALID_TOKEN.code)
        }

    }

    override fun postLoad(server: Server, world: World) {
    }

    override fun bindNet(server: Server, world: World) {
    }

    override fun terminate(server: Server, world: World) {
    }



}





