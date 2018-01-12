/**
 * Created by MalhotR1 on 01/03/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int T = Integer.parseInt(br.readLine().trim());
//            long[] table = new long[T];
            for (int i = 0; i < T; i++) {
                int N = Integer.parseInt(br.readLine().trim());
                if (N == 0 || N == 1) {
                    System.out.println(1);
                    continue;
                }
                long[] table = new long[N];
                table[0] = 1;
                if (table[N-1] > 0) System.out.println(table[N-1]);
                for (int j = 1; j < N; j++) {
                    if (table[j] > 0) continue;
                    table[j] = ((j+1) * table[j-1]) % 1000000007;
                }

                System.out.println(table[N-1]);
            }
        }
    }

}
