package app;
import java.util.Map;

public final class Colors {
    public static final String start = "\033[38;2;";
    public static final String end = "\033[0m";
    public static final Map<String, String> COLOR = Map.ofEntries(
        Map.entry("RED","255;0;0m"),
        Map.entry("YELLOW","255;255;0m"),
        Map.entry("PINK", "250;0;250m"),
        Map.entry("PURPLE", "160;50;255m"),
        Map.entry("GREEN", "0;255;0m"),
        Map.entry("CYAN", "0;220;200m"),
        Map.entry("NORMAL", "215;215;215m"),
        Map.entry("WHITE", "255;255;255m"),
        Map.entry("BLACK", "0;0;0m"),
        Map.entry("BLUE", "0;0;255m"),
        Map.entry("LIGHTPINK", "250;150;250m")
    );
    public static void print(Object conteudo,String cor) {
        if (cor == null) {
            cor = "LIGHTPINK";
        }
        System.out.println(start+COLOR.get(cor)+conteudo+end);
    }
}