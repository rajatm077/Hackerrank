/**
 * Created by MalhotR1 on 04/16/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) throws IOException {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        for (int i = 0; i < str1.length; i++) {
            if (hm.containsKey(str1[i])) {
                char c = hm.get(str1[i]);
                if (c != str2[i]) return false;
            } else {
                hm.put(str1[i], str2[i]);
            }

            if (hm2.containsKey(str2[i])) {
                char c = hm2.get(str2[i]);
                if (c != str1[i]) return false;
            } else {
                hm2.put(str2[i], str1[i]);
            }
        }
        return true;
    }

}
