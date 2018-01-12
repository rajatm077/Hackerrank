/**
 * Created by MalhotR1 on 01/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosestNumber {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            long[] arr = new long[N];
            String[] in = br.readLine().trim().split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(in[i]);
            }
            int Q = Integer.parseInt(br.readLine().trim());
            for (int q = 0; q < Q; q++) {
                in = br.readLine().trim().split(" ");
                int n = Integer.parseInt(in[0]);
                if (n == 1) {
                    int u = Integer.parseInt(in[1]);
                    long p = Long.parseLong(in[2]);
                    arr[u - 1] = p;

                } else if (n == 2) {
                    int l = Integer.parseInt(in[1]);
                    int r = Integer.parseInt(in[2]);
                    long p = Long.parseLong(in[3]);
                    long min = Long.MAX_VALUE;
                    boolean found = false;
                    int k = -1;
                    for (int i = l - 1; i < r; i++) {
                        if (arr[i] > p && arr[i] < min) {
                            found = true;
                            min = arr[i];
                            k = i;
                        }
                    }
                    if (found) System.out.println(arr[k]);
                    else System.out.println(-1);
                }
            }
        }
    }
}

