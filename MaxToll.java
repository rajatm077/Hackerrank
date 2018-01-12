/**
 * Created by MalhotR1 on 01/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxToll {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int K = Integer.parseInt(in[0]);
            int N = K+1;
            int[][] arr = new int[N][N];
            for (int i = 0; i < K; i++) {
                in = br.readLine().trim().split(" ");
                int a = Integer.parseInt(in[0]);
                int b = Integer.parseInt(in[1]);
                arr[a-1][b-1] = 1;
                arr[b-1][a-1] = 1;
            }
            in = br.readLine().trim().split(" ");
            int[] W = new int[in.length];

            for (int i = 0; i < in.length; i++) {
                W[i] = Integer.parseInt(in[i]);
            }

            Arrays.sort(W);

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j) continue;
                    if (arr[i][j] > 0) {
                        for (int k = 0; k < N; k++) {
                            if (k == i) continue;
                            if (arr[j][k] > 0) {
                                if (arr[i][k] == 0) arr[i][k] = arr[i][j] + arr[j][k];
                                else arr[i][k] = Math.min(arr[i][k], arr[i][j] + arr[j][k]);
                            }
                        }
                    }
                }
            }


            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] > max) max = arr[i][j];
                }
            }

            long sum = 0;
            Set<Integer> set = new HashSet<>();
//            int last = Math.abs(W.length - max);
            for (int i = W.length-1; i >= 0; i--) {
                if (!set.contains(W[i])) {
                    set.add(W[i]);
                    max--;
                    if (max == 0) break;
                }
            }
            for (Integer i: set) {
                sum += i;
            }
            System.out.println(2*sum);
        }
    }
}
