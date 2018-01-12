/**
 * Created by MalhotR1 on 01/03/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaysToWriteN {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int i = 0; i < T; i++) {
                int N = Integer.parseInt(br.readLine().trim());
                long[] table = new long[N];
                table[0] = 1;
                long sum = table[0];
                for (int j = 0; j < N; j++) {
//                    sum +=
                }

            }
        }
    }


}
