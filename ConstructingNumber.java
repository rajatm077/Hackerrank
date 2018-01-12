/**
 * Created by MalhotR1 on 01/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConstructingNumber {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                String[] in = br.readLine().trim().split(" ");
                long[] arr = new long[N];
                long sum = 0;
                for (int i = 0; i < in.length; i++) {
                    arr[i] = Long.parseLong(in[i]);
                    long temp = arr[i];
                    while (temp > 0) {
                        sum += temp % 10;
                        temp = temp / 10;
                    }
                }
                if (sum % 3 == 0) System.out.println("YES");
                else System.out.println("NO");

            }
        }
    }

}
