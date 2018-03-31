/**
 * Created by MalhotR1 on 01/22/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherloackAndDivisors {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int T = Integer.parseInt(br.readLine().trim());
            int k = 500000000;
            int[] prime = new int[k/2];
            prime[0] = 2;
            int length = 1;
            for (int t = 0; t < T; t++) {
                long N = Long.parseLong(br.readLine().trim());

                if ((N & 1) != 0) {
                    System.out.println(0);
                    continue;

                } else if ((N & N-1) == 0) {
                    int cnt = powerk(N,2);
                    System.out.println(cnt);
                    continue;
                }

                prime[0] = 2;
//                length = findPrimes(prime, N, length);

                long res = 0;
                for (int i = 0; i < length; i++) {
                    int div = prime[i];
                    if (N % div == 0) {
                        int pow = powerk(N, div);
                        if (div == 2) res = pow;
                        else res *= (pow + 1);
                        N = N / (long) Math.pow(div, pow);
                    }
                }

                System.out.println(res);
            }
        }
    }




    private static int powerk(long N, int k) {
        int cnt = 0;
        while ((N > k-1) && (N%k == 0)) {
            N = N / k;
            cnt++;
        }
        return cnt;
    }
}
