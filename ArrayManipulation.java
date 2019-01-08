/**
 * Created by malhotr1 on 05/16/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayManipulation {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            long[] arr = new long[n];
            long max = 0;
            for (int i = 0; i < m; i++) {
                in = br.readLine().trim().split(" ");
                int a = Integer.parseInt(in[0]) - 1;
                int b = Integer.parseInt(in[1]);
                long k = Long.parseLong(in[2]);

                for (int j = a; j < b; j++) {
                    arr[j] += k;
                    max = Math.max(max, arr[j]);
                }
            }

            System.out.println(max);
        }
    }

}
