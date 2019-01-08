/**
 * Created by MalhotR1 on 04/07/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedAndMissing {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                String[] in = br.readLine().trim().split(" ");
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = Integer.parseInt(in[i]);
                }

                long sum = 0;
                if (N % 2 == 0) sum = (N / 2) * (N + 1);
                else sum = ((N + 1) / 2) * N;

                long temp = 0;
                int repeated = Integer.MIN_VALUE;
                for (int i = 0; i < arr.length; i++) {
                    int index = Math.abs(arr[i]) - 1;
                    temp += Math.abs(arr[i]);
                    if (arr[index] < 0) repeated = Math.abs(arr[i]);
                    else {
                        arr[index] = -arr[index];
                    }

                }
                sum = sum - temp + Math.abs(repeated);
                System.out.println(repeated + " " + sum);
            }
        }
    }

}
