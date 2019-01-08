/**
 * Created by MalhotR1 on 04/02/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinPal {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String in = br.readLine().trim();
                String rev = new StringBuilder(in).reverse().toString();
                if (in.equals(rev)) System.out.println(0);
                else {
                    char[] o = in.toCharArray();
                    char[] r = rev.toCharArray();
                    int count = 0;
                    for (int i = 0; i < o.length; i++) {
                        if (o[i] != r[i]) count++;
                    }
                    System.out.println(--count);
                }
            }
        }
    }

}
