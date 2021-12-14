package weTubeBotLogic;

public class Config {

    public static String get(String key) {
        return System.getenv(key.toUpperCase());
    }

}
