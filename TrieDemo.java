/**
 * Created by MalhotR1 on 03/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrieDemo {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                Trie root = new Trie();
                String[] in = br.readLine().trim().split(" ");
                String search = br.readLine().trim();
                for (String item : in) {
                    AddStringToTrie(root, item);
                }
                boolean flag = isStringPresent(root, search);
                if (flag) System.out.println(1);
                else System.out.println(0);
            }
        }
    }

    private static boolean isStringPresent(Trie root, String search) {
        if (root == null) return false;

        boolean flag = true;

        char[] arr = search.toCharArray();
        for (char c : arr) {
            int index = (int) c - 97;
            if (root.next[index] != null) root = root.next[index];
            else {
                flag = false;
                break;
            }
        }

        if (flag && root.isEnd) return flag;
        else return false;
    }

    private static void AddStringToTrie(Trie root, String item) {

        char[] str = item.toLowerCase().toCharArray();
        for (char c : str) {
            int index = (int) c - 97;
            if (root.next[index] == null) {
                root.next[index] = new Trie();
                root.next[index].key = c;
            }
            root = root.next[index];
        }
        root.isEnd = true;
    }

}

class Trie {
    Trie[] next = new Trie[26];
    char key;
    boolean isEnd;
}
