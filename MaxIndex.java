/**
 * Created by MalhotR1 on 03/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxIndex {
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

                int maxDiff = -1;
                int temp = -1;
                for (int i = 0; i < arr.length - 1; i++) {
                    int crr = arr[i];
                    for (int j = i+1; j < arr.length; j++) {
                        if (crr <= arr[j]) {
                            temp = j - i;
                        }
                    }
                    if (temp > maxDiff) maxDiff = temp;
                }
                System.out.println(maxDiff);
            }
        }
    }

}
