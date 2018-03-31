/**
 * Created by MalhotR1 on 03/28/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contacts {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            TrieC root = new TrieC();
            for (int t = 0; t < T; t++) {
                int total = 0;
                String[] in = br.readLine().trim().split(" ");

                if (in[0].equals("add")) AddStringToTrie(root, in[1]);

                else {
                    total = isStringPresent(root, in[1]);
                    System.out.println(total);
                }

            }
        }
    }
    private static int isStringPresent(TrieC root, String search) {
        if (root == null) return 0;
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
        if (!flag) return 0;
        else {
            return root.w;
        }
    }

//    private static int findAllMatches(TrieC root, int total) {
//        if (root.isEnd) total++;
//        TrieC[] nodes = root.next;
//        for (int i = 0; i < nodes.length; i++) {
//            if (nodes[i] != null) {
//                return findAllMatches(nodes[i], total);
//            }
//        }
//        return total;
//    }

    private static void AddStringToTrie(TrieC root, String item) {
        char[] str = item.toLowerCase().toCharArray();
        for (char c : str) {
            int index = (int) c - 97;
            if (root.next[index] == null) {
                root.next[index] = new TrieC();
                root.next[index].key = c;
                root.w++;
            }
            root = root.next[index];
        }
        root.isEnd = true;
    }
}


class TrieC {
    TrieC[] next = new TrieC[26];
    char key;
    boolean isEnd;
    int w = 0;
}



