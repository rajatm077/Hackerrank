import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.TreeMap;

/**
 * Created by MalhotR1 on 09/19/2017.
 */
public class RansomNotes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        if (m < n) {
            System.out.println("No");
        } else {
            String[] mag = br.readLine().trim().split(" ");
            String[] ran = br.readLine().trim().split(" ");

            TreeMap<String, Integer> tm = new TreeMap<>();
            for (String s: mag) {
                if (tm.containsKey(s)) {
                    int occurrence = tm.get(s);
                    tm.replace(s, occurrence, occurrence+1);
                } else {
                    tm.put(s, 1);
                }
            }

            for (String s2 : ran) {
                if (!tm.containsKey(s2)) {
                    System.out.printf("No");
                    return;
                } else {
                    int occurrence = tm.get(s2);
                    if (occurrence == 1) {
                        tm.remove(s2);
                    } else {
                        tm.replace(s2, occurrence, occurrence-1);
                    }
                }
            }

            System.out.println("Yes");
        }
    }
}
