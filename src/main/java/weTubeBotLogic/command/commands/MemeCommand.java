package weTubeBotLogic.command.commands;

import com.fasterxml.jackson.databind.JsonNode;
import me.duncte123.botcommons.messaging.EmbedUtils;
import me.duncte123.botcommons.web.WebUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weTubeBotLogic.Listener;
import weTubeBotLogic.command.CommandContext;
import weTubeBotLogic.command.ICommand;

public class MemeCommand implements ICommand {

    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    @Override
    public void handle(CommandContext ctx){
        final TextChannel channel = ctx.getChannel();

        WebUtils.ins.getJSONObject("https://apis.duncte123.me/meme").async((json) -> {
            if (!json.get("success").asBoolean()){
                channel.sendMessage("Alguma coisa deu errado, tente novamente, mais tarde.").queue();
                LOGGER.info(String.valueOf(json));
                return;
            }

            final JsonNode data = json.get("data");
            final String title = data.get("title").asText();
            final String url = data.get("url").asText();
            final String image = data.get("image").asText();
            final EmbedBuilder embed = EmbedUtils.embedImageWithTitle(title, url, image);

            channel.sendMessageEmbeds(embed.build()).queue();

        });
    }

    @Override
    public String getName() {
        return "meme";
    }

    @Override
    public String getHelp() {
        return "Envia um meme aleatório.";
    }
}
