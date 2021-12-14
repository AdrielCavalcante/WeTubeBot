package weTubeBotLogic.command.commands;

import weTubeBotLogic.command.CommandContext;
import weTubeBotLogic.command.ICommand;

public class ComunismoCommand implements ICommand {

    @Override
    public void handle(CommandContext ctx) {
        ctx.getChannel().sendMessage("☭ Viva ao Comunismo! ☭").queue();
    }

    @Override
    public String getName() {
        return "comunismo";
    }

    @Override
    public String getHelp() {
        return "Glorifica o Comunismo para o servidor.";
    }

}
