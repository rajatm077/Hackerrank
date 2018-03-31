/**
 * Created by MalhotR1 on 03/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSubarraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[N];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            int maxSum = Integer.MIN_VALUE;
            int temp2 = Integer.MIN_VALUE;
            int temp = 0;

            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
                if (temp > temp2) temp2 = temp;
                if (temp < 0) {
                    temp = 0;
                } else if (temp > maxSum) maxSum = temp;
            }
            maxSum = Math.max(maxSum, temp2);
            System.out.println(maxSum);
        }
    }
}


