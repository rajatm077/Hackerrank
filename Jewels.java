/**
 * Created by MalhotR1 on 04/16/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Jewels {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String J = "aA";
            String S = "aAAbbbb";
            Queue<Integer> q = new LinkedList<>();
            HashSet<Integer> hs = new HashSet<>();

            System.out.println(numJewelsInStones(J,S));
        }
    }

    public static int numJewelsInStones(String J, String S) {
        int[] hm = new int[52];
        int count = 0;
        char[] j = J.toCharArray();
        for (int i = 0; i < j.length; i++) {
            if (j[i] >= 'A' && j[i] <= 'Z') hm[j[i] - 'A'] = 1;
            else hm[j[i] - 'a' + 26] = 1;
        }
        char[] s = S.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                if (hm[s[i] - 'A'] > 0) count++;
            }

            if (s[i] >= 'a' && s[i] <= 'z') {
                if (hm[s[i] - 'a' + 26] > 0) count++;
            }
        }
        return count;
    }

}
