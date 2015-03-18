package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/17/15.
 */
public class Drawing {

    private static final String[] lines = {
            "  |",         //string array [0]
            "\n \\",
            "0",
            "/",
            "\n  |",
            "\n /",
            " \\"            //[6]
    };

    public Drawing() {
    }

    public static String get(int misses) {
        String drawing = "";
        for (int i = 0; i <= misses; i++) {
            drawing += lines[i];
        }
        return drawing;
    }
}