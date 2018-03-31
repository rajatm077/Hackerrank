/**
 * Created by MalhotR1 on 03/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubArraySum {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String[] in = br.readLine().trim().split(" ");
                String[] in2 = br.readLine().trim().split(" ");
                int N = Integer.parseInt(in[0]);
                int total = Integer.parseInt(in[1]);
                int[] arr = new int[N];
                for (int i = 0; i < in2.length; i++) {
                    arr[i] = Integer.parseInt(in2[i]);
                }

                int start = 0;
                int end = 0;
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                    end++;
                    if (sum == total) break;
                    else {

                        while (sum > total) {
                            sum -= arr[start];
                            start++;
                        }
                        if (sum == total) break;

                        if (start > end) end = start;
                    }
                }
                start++;
                if (sum == total) System.out.println(start + " " + end);
                else System.out.println(-1);

            }
        }
    }

}
