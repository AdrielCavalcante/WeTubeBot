package weTubeBotLogic.command.commands;

import me.duncte123.botcommons.messaging.EmbedUtils;
import me.duncte123.botcommons.web.WebUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weTubeBotLogic.Listener;
import weTubeBotLogic.command.CommandContext;
import weTubeBotLogic.command.ICommand;

import java.util.Arrays;
import java.util.List;

public class JokeCommand implements ICommand {

    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    @Override
    public void handle(CommandContext ctx) {
        final TextChannel channel = ctx.getChannel();

        WebUtils.ins.getJSONObject("https://api-charada.herokuapp.com/puzzle?lang=ptbr").async((json) -> {

            if (json.isEmpty()){
                channel.sendMessage("Alguma coisa deu errado, tente novamente, mais tarde.").queue();
                LOGGER.info(String.valueOf(json));
                return ;
            }

                final String question = json.get("question").asText();
                final String answer = json.get("answer").asText();
                final EmbedBuilder embed = EmbedUtils.getDefaultEmbed().setTitle(question).setDescription(answer);

                channel.sendMessageEmbeds(embed.build()).queue();

        });
    }

    @Override
    public String getName() {
        return "joke";
    }

    @Override
    public String getHelp() {
        return "Envia uma piada aleatória.";
    }

    @Override
    public List<String> getAliases() {
        return List.of("joke", "piada");
    }
}
