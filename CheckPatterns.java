import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by MalhotR1 on 10/03/2017.
 */
public class CheckPatterns {
    public static void main(String[] args) {
        String[] strings = {"re",
                "jjinh",
                "rnz",
                "frok",
                "frok",
                "hxytef",
                "hxytef",
                "frok"};
        String[] patterns = {"kzfzmjwe",
                "fgbugiomo",
                "ocuijka",
                "gafdrts",
                "gafdrts",
                "ebdva",
                "ebdva",
                "gafdrts"};
        System.out.println(areFollowingPatterns(strings, patterns));
    }
    static boolean areFollowingPatterns(String[] strings, String[] patterns) {
        if (strings.length != patterns.length) return false;
        else {
            Arrays.sort(strings);
            int[] str = new int[strings.length];
            Arrays.sort(patterns);
            int[] ptr = new int[patterns.length];
            int cnt = 0;
            for (int i = 0; i < str.length-1; i++) {
                str[i] = cnt;
                ptr[i] = cnt;
                if (str[i] != str[i+1]) cnt++;
            }
            str[str.length-1] = cnt;
            ptr[str.length-1] = cnt;
            for (int i = 0; i < str.length; i++) {
                if (str[i] != ptr[i]) return false;
            }
            return true;

        }
    }
}
