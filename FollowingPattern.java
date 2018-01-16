/**
 * Created by MalhotR1 on 01/17/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class FollowingPattern {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            String[] in2 = br.readLine().trim().split(" ");
            System.out.println(areFollowingPatterns(in, in2));

        }
    }

    static boolean areFollowingPatterns(String[] strings, String[] patterns) {
        if (strings.length != patterns.length) return false;
        HashMap<String, String> hm1 = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (hm1.containsKey(strings[i])) {
                String temp = hm1.get(strings[i]);
                if (!temp.equals(patterns[i])) return false;

            } else {
                hm1.put(strings[i], patterns[i]);
            }

            if (hm2.containsKey(patterns[i])) {
                String temp = hm2.get(patterns[i]);
                if (!temp.equals(strings[i])) return false;

            } else {
                hm2.put(patterns[i], strings[i]);
            }
        }


        return true;
    }


}
