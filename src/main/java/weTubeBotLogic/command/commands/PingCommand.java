package weTubeBotLogic.command.commands;

import weTubeBotLogic.command.CommandContext;
import weTubeBotLogic.command.ICommand;
import net.dv8tion.jda.api.JDA;

public class PingCommand implements ICommand {

    @Override
    public void handle(CommandContext ctx) {
        JDA jda = ctx.getJDA();

        jda.getRestPing().queue(
                (ping) -> ctx.getChannel().sendMessageFormat("logic.Bot Ping: %sms\nWebSocket Ping: %sms", ping, jda.getGatewayPing()).queue()
        );
    }

    @Override
    public String getName() {
        return "ping";
    }

    @Override
    public String getHelp() {
        return "Mostra o ping do bot para o servidor.";
    }

}
