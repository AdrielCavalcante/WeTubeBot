package weTubeBotLogic.command.commands.music;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import net.dv8tion.jda.api.entities.GuildVoiceState;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import weTubeBotLogic.command.CommandContext;
import weTubeBotLogic.command.ICommand;
import weTubeBotLogic.lavaplayer.GuildMusicManager;
import weTubeBotLogic.lavaplayer.PlayerManager;

public class SkipCommand implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        final TextChannel channel = ctx.getChannel();
        final Member self = ctx.getSelfMember();
        final GuildVoiceState selfVoiceState = self.getVoiceState();

        if (!selfVoiceState.inVoiceChannel()) {
            channel.sendMessage("Eu preciso estar em uma call para esse comando funcionar").queue();
            return;
        }

        final Member member = ctx.getMember();
        final GuildVoiceState memberVoiceState = member.getVoiceState();

        if (!memberVoiceState.inVoiceChannel()) {
            channel.sendMessage("Você precisa estar em uma call para esse comando funcionar").queue();
            return;
        }

        if (!memberVoiceState.getChannel().equals(selfVoiceState.getChannel())) {
            channel.sendMessage("Você precisa estar na mesma call que eu para esse comando funcionar").queue();
            return;
        }

        final GuildMusicManager musicManager = PlayerManager.getInstance().getMusicManager(ctx.getGuild());
        final AudioPlayer audioPlayer = musicManager.audioPlayer;

        if (audioPlayer.getPlayingTrack() == null) {
            channel.sendMessage("Não tem nenhuma música na fila").queue();
            return;
        }

        musicManager.scheduler.nextTrack();
        channel.sendMessage("A música foi skipada \u23E9").queue();
    }

    @Override
    public String getName() {
        return "skip";
    }

    @Override
    public String getHelp() {
        return "Pula a música atual para a próxima da fila.";
    }
}
