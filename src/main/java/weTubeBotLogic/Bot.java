package weTubeBotLogic;

import me.duncte123.botcommons.messaging.EmbedUtils;
import me.duncte123.botcommons.web.WebUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class Bot {

    private Bot() throws LoginException {

        WebUtils.setUserAgent("WeTubeBot - Adriel#4266");
        EmbedUtils.setEmbedBuilder(
                () -> new EmbedBuilder()
                .setColor(0xFF0000)
        );

        JDABuilder.createDefault(
                System.getenv("TOKEN"),
                GatewayIntent.GUILD_MESSAGES,
                GatewayIntent.GUILD_VOICE_STATES
        )
                .disableCache(EnumSet.of(
                        CacheFlag.CLIENT_STATUS,
                        CacheFlag.ACTIVITY,
                        CacheFlag.EMOTE
                ))
                .enableCache(CacheFlag.VOICE_STATE)
                .addEventListeners(new Listener())
                .setActivity(Activity.watching("A propaganda Soviética"))
                .setStatus(OnlineStatus.ONLINE)
                .build();
    }

    public static void main(String[] args) throws LoginException {
        new Bot();
        System.out.println("teste");
    }
}
