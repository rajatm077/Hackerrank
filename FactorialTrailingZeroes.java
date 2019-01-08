/**
 * Created by MalhotR1 on 03/31/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialTrailingZeroes {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                int i = 5;
                int count = 0;
                int q = N / i;
                while (q > 0) {
                    count += N / i;
                    i *= 5;
                    q = N / i;
                }

                System.out.println(count);

            }
//            String[] in = br.readLine().trim().split(" ");
        }
    }

}
