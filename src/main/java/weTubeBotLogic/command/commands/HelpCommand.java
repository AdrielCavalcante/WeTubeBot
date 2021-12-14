package weTubeBotLogic.command.commands;

import me.duncte123.botcommons.messaging.EmbedUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import weTubeBotLogic.CommandManager;
import weTubeBotLogic.Config;
import weTubeBotLogic.command.CommandContext;
import weTubeBotLogic.command.ICommand;

import java.util.List;

public class HelpCommand implements ICommand {

    private final CommandManager manager;

    public HelpCommand(CommandManager manager) {
        this.manager = manager;
    }

    @Override
    public void handle(CommandContext ctx) {
        List<String> args = ctx.getArgs();
        TextChannel channel = ctx.getChannel();

        if (args.isEmpty()){

            final EmbedBuilder embed = EmbedUtils.getDefaultEmbed().setTitle("**Lista de comandos**\n");

            manager.getCommands().stream().map(ICommand::getName).forEach(
                    (it) -> embed.getDescriptionBuilder().append("*").append(Config.get("prefix")).append(it).append("*\n")
            );

            embed.getDescriptionBuilder().append("\n**Para saber o que cada comando faz, digite:**\n `we!help [comando]`");

            embed.setFooter("WeTubeBot by: Adriel#4266");

            channel.sendMessageEmbeds(embed.build()).queue();
            return;
        }

        String search = args.get(0);
        ICommand command = manager.getCommand(search);

        if (command == null) {
            channel.sendMessage("Não achei nenhum comando com o nome: "+ search).queue();
            return;
        }
        channel.sendMessage(command.getHelp()).queue();
    }

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getHelp() {
        return "Mostra uma lista com todos os comandos do bot\n" +
                "Use: `we!help [comando]`";
    }

    public List<String> getAliases(){
        return List.of("comandos", "ajuda");
    }
}
