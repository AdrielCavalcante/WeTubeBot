package weTubeBotLogic.command.commands.music;

import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackInfo;
import me.duncte123.botcommons.messaging.EmbedUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import weTubeBotLogic.command.CommandContext;
import weTubeBotLogic.command.ICommand;
import weTubeBotLogic.lavaplayer.GuildMusicManager;
import weTubeBotLogic.lavaplayer.PlayerManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class QueueCommand implements ICommand {

    @Override
    public void handle(CommandContext ctx) {
        final TextChannel channel = ctx.getChannel();
        final GuildMusicManager musicManager = PlayerManager.getInstance().getMusicManager(ctx.getGuild());
        final BlockingQueue<AudioTrack> queue = musicManager.scheduler.queue;

        if (queue.isEmpty()) {
            channel.sendMessage("A lista está vazia.").queue();
            return;
        }

        final int trackCount = Math.min(queue.size(), 20);
        final List<AudioTrack> tracksList = new ArrayList<>(queue);
        final EmbedBuilder embed = EmbedUtils.getDefaultEmbed().setTitle("**Lista de músicas:\n**");

        for (int i = 0; i < trackCount; i++) {
            final AudioTrack track = tracksList.get(i);
            final AudioTrackInfo info = track.getInfo();

            embed.getDescriptionBuilder().append("#")
                         .append(i + 1)
                         .append(" `")
                         .append(info.title)
                         .append("` por *")
                         .append(info.author)
                         .append("* [")
                         .append(formatTime(track.getDuration()))
                         .append("]\n");
        }
        if (tracksList.size() > trackCount) {
            embed.setFooter("E mais "+ (tracksList.size() - trackCount) +" músicas na lista...");
        }

        channel.sendMessageEmbeds(embed.build()).queue();
    }

    private String formatTime(long timeInMillis) {
        final long hours = timeInMillis / TimeUnit.HOURS.toMillis(1);
        final long minutes = timeInMillis / TimeUnit.MINUTES.toMillis(1);
        final long seconds = timeInMillis % TimeUnit.MINUTES.toMillis(1) / TimeUnit.SECONDS.toMillis(1);

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    @Override
    public String getName() {
        return "queue";
    }

    @Override
    public String getHelp() {
        return "Mostra todas músicas da lista.";
    }

    @Override
    public List<String> getAliases() {
        return List.of("playlist","lista");
    }
}
