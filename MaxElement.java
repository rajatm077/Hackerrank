/**
 * Created by MalhotR1 on 01/10/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class MaxElement {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            long[] stk = new long[N];
            int index = 0;

            long max = Long.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                String[] in = br.readLine().trim().split(" ");
                int q = Integer.parseInt(in[0]);
                if (q == 1) {
                    long element = Long.parseLong(in[1]);
                    stk[index++] = element;
                    if (max < element) max = element;

                } else if (q == 2) {
                    if (index > 0) index--;
                    max = Long.MIN_VALUE;
                    stk[index] = Long.MIN_VALUE;
                    for (int j = 0; j <= index; j++) {
                        if (max < stk[j]) max = stk[j];
                    }


                } else {
                    System.out.println(max);
                }
            }
        }
    }
}
