/**
 * Created by MalhotR1 on 03/31/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MorseTransform {
    public static void main(String[] args) throws IOException {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                "--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));

    }

    private static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                "--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();
        for (String str : words) {
           char[] arr = str.toLowerCase().toCharArray();
           StringBuffer out = new StringBuffer();
           for (char c : arr) {
               out.append(morse[(int) (c - 97)]);
           }
           set.add(out.toString());
        }
        return set.size();
    }
}
