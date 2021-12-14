package weTubeBotLogic.command.commands;

import me.duncte123.botcommons.messaging.EmbedUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import weTubeBotLogic.command.CommandContext;
import weTubeBotLogic.command.ICommand;

import java.util.List;

public class AboutCommand implements ICommand {

    @Override
    public void handle(CommandContext ctx) {
        final TextChannel channel = ctx.getChannel();

        final EmbedBuilder embed = EmbedUtils.getDefaultEmbed().setTitle("**Sobre o Bot**").setDescription("O WeTubeBot é um bot feito em java com o intuito de rodar vídeos do Youtube enquanto está em call.\n"+
        "Meu Prefixo padrão é `we!`\n\n");
        embed.addField("**Gostaria de me apoiar?**","GitHub: https://github.com/AdrielCavalcante/WeTubeBot\n"
        + "WebSite: <nenhum por enquanto>\n\n"
        + "Logo criada por: *Kcetada Boy#9382*",false);

        embed.setFooter("WeTubeBot by: Adriel#4266");
        channel.sendMessageEmbeds(embed.build()).queue();
    }

    @Override
    public String getName() {
        return "about";
    }

    @Override
    public String getHelp() {
        return "Mostra as informações do Bot";
    }

    @Override
    public List<String> getAliases() {
        return List.of("sobre", "info");
    }
}
