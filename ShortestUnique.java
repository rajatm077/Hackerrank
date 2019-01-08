/**
 * Created by MalhotR1 on 04/16/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ShortestUnique {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = {"bearcat", "bert" };
            Trie2 root = new Trie2();
            for (String w : in) {
                addStringToTrie(root, w);
            }
            ArrayList<String> res = new ArrayList<>();
            for (String w : in) {
                res.add(getPrefix(root, w));
            }
            Collections.sort(res);
            for (int i = 0; i < res.size(); i++) {
                System.out.println(res.get(i));
            }
        }
    }

    private static String getPrefix(Trie2 root, String w) {
        char[] ca = w.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (char c : ca) {
            int index = c - 97;
            if (root.next[index] == null) return null;
            else {
                if (root.next[index].isEnd) return w;
                else {
                    sb.append(c);
                    int count = 0;
                    if (root.next[index].count == 1) return sb.toString();
                    root = root.next[index];
                }
            }
        }

        return sb.toString();
    }

    private static void addStringToTrie(Trie2 root, String w) {
        char[] ca = w.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            int index = ca[i] - 97;
            if (root.next[index] == null) {
                root.next[index] = new Trie2();
                root.next[index].key = ca[i];
            }

            root.next[index].count++;

            root = root.next[index];
        }
        root.isEnd = true;
    }

}

class Trie2 {
    char key;
    Trie2[] next = new Trie2[26];
    int count = 0;
    boolean isEnd;
}
