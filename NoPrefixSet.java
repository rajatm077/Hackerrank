/**
 * Created by MalhotR1 on 03/28/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoPrefixSet {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            TrieC root = new TrieC();
            boolean flag = false;
            for (int t = 0; t < T; t++) {
                String in = br.readLine().trim(); //.split(" ");
                flag = AddStringToTrie(root, in);
                if (!flag) {
                    System.out.println("BAD SET");
                    System.out.println(in);
                    break;
                }
            }
            if (flag) System.out.println("GOOD SET");
        }
    }

    private static boolean AddStringToTrie(TrieC root, String item) {
        boolean flag = false;
        char[] str = item.toLowerCase().toCharArray();
        for (char c : str) {
            int index = (int) c - 97;
            if (root.next[index] == null) {
                if (root.isEnd) {
                    return false;
                } else {
                    flag = true;
                }
                root.next[index] = new TrieC();
                root.next[index].key = c;

            }
            root = root.next[index];
        }
        root.isEnd = true;
        return flag;
    }

}
