package weTubeBotLogic.command.commands;

import net.dv8tion.jda.api.entities.TextChannel;
import weTubeBotLogic.CommandManager;
import weTubeBotLogic.Config;
import weTubeBotLogic.command.CommandContext;
import weTubeBotLogic.command.ICommand;

import java.util.List;

public class HelpCommand implements ICommand {

    //Fazer em formato de Embed no futuro

    private final CommandManager manager;

    public HelpCommand(CommandManager manager) {
        this.manager = manager;
    }

    @Override
    public void handle(CommandContext ctx) {
        List<String> args = ctx.getArgs();
        TextChannel channel = ctx.getChannel();

        if (args.isEmpty()){
            StringBuilder builder = new StringBuilder();

            builder.append("Lista de comandos\n");

            manager.getCommands().stream().map(ICommand::getName).forEach(
                    (it) -> builder.append("`").append(Config.get("prefix")).append(it).append("`\n")
            );

            channel.sendMessage(builder.toString()).append("Para saber o que cada comando faz, digite:\n `we!help [comando]`\nBot criado por **Adriel#4266** e logo criada por **Kcetada Boy#9382**").queue();
            return;
        }

        String search = args.get(0);
        ICommand command = manager.getCommand(search);

        if (command == null) {
            channel.sendMessage("Nada achado para: "+ search).queue();
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
        return List.of("Comandos", "ajuda");
    }
}
