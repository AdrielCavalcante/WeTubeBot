package weTubeBotLogic.command.commands.music;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.GuildVoiceState;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.managers.AudioManager;
import weTubeBotLogic.command.CommandContext;
import weTubeBotLogic.command.ICommand;
import weTubeBotLogic.lavaplayer.GuildMusicManager;
import weTubeBotLogic.lavaplayer.PlayerManager;

import java.util.List;

public class LeaveCommand implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        final TextChannel channel = ctx.getChannel();
        final Member self = ctx.getSelfMember();
        final GuildVoiceState selfVoiceState = self.getVoiceState();

        if (!selfVoiceState.inVoiceChannel()) {
            channel.sendMessage("Eu já estou em uma call.").queue();
            return;
        }

        final Member member = ctx.getMember();
        final GuildVoiceState memberVoiceState = member.getVoiceState();

        if (!memberVoiceState.inVoiceChannel()) {
            channel.sendMessage("Você precisa estar em uma call para eu entrar.").queue();
            return;
        }

        final Guild guild = ctx.getGuild();

        final GuildMusicManager musicManager = PlayerManager.getInstance().getMusicManager(guild);

        musicManager.scheduler.repeating = false;
        musicManager.scheduler.queue.clear();
        musicManager.audioPlayer.stopTrack();

        final AudioManager audioManager = guild.getAudioManager();

        audioManager.closeAudioConnection();

        channel.sendMessage("Eu sai da Call, até outro dia.").queue();
    }

    @Override
    public String getName() {
        return "leave";
    }

    @Override
    public String getHelp() {
        return "Faz o Bot sair da call.";
    }

    @Override
    public List<String> getAliases() {
        return List.of("exit", "sair");
    }
}
