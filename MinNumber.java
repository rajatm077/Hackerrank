/**
 * Created by MalhotR1 on 01/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinNumber {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int i = 0; i < T; i++) {
                String[] in = br.readLine().trim().split(" ");
                String[] in2 = br.readLine().trim().split(" ");
                int N = Integer.parseInt(in[0]);
                int Q = Integer.parseInt(in[2]);
                long[] arr = new long[N];
                long min = Long.MAX_VALUE;
                for (int j = 0; j < in2.length; j++) {
                    arr[i] = Long.parseLong(in2[j]);
                    if (arr[i] < min) min = arr[i];
                }
                if (min < Q) System.out.println(min);
                else System.out.println("NO");
            }
        }
    }

}
