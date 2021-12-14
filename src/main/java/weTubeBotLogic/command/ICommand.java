package weTubeBotLogic.command;

import java.util.List;

public interface ICommand {
    void handle(CommandContext ctx);

    String getName();

    String getHelp();

    default List<String> getAliases(){
        return List.of(); // use Arrays.asList() se você estiver usando java 8
    }
}
