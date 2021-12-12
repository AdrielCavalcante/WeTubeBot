package weTubeBotLogic;

import me.duncte123.botcommons.BotCommons;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;

public class Listener extends ListenerAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);
    private final CommandManager manager = new CommandManager();

    @Override
    public void onReady(@Nonnull ReadyEvent event) {
        LOGGER.info("{} está rodando", event.getJDA().getSelfUser().getAsTag());
    }

    @Override
    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {
        User user = event.getAuthor();

        if(user.isBot() || event.isWebhookMessage()){
            return;
        }

        String prefix = Config.get("prefix");
        String raw = event.getMessage().getContentRaw();

        if (raw.equalsIgnoreCase(prefix + "desligar")
                && event.getAuthor().getId().equals(Config.get("owner_id"))) {
            LOGGER.info("Desligando o bot");
            event.getChannel().sendMessage("Nunca é um adeus...").queue();
            event.getJDA().shutdown();
            BotCommons.shutdown(event.getJDA());

            return;
        }

        if (raw.toLowerCase().startsWith(prefix)){
            manager.handle(event);
        }
    }
}