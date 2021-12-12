package weTubeBotLogic;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class Bot {

    private Bot() throws LoginException {
        JDABuilder.createDefault(
                Config.get("token"),
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
                .setActivity(Activity.watching("Glorificando o Comunismo"))
                .setStatus(OnlineStatus.ONLINE)
                .build();
    }

    public static void main(String[] args) throws LoginException {
        new Bot();
    }
}
