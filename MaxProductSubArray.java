/**
 * Created by MalhotR1 on 01/25/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxProductSubArray {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            int[] arr = {2, 3, -2, 4, 8};
            for (int t = 0; t < 5; t++) {

                String[] in = br.readLine().trim().split(" ");
                int[] arr = new int[in.length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(in[i]);
                }
//                if (arr.length == 1) {
//                    System.out.println(arr[0]);
//                    continue;
//                }

                int max = 0;
                int neg = 0;
                int pos = 0;
                int start = -1;
                int last = -1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0) {
                        if (pos == 0) pos = 1;
                        pos *= arr[i];
                        if (neg == 0) neg = 1;
                        neg *= arr[i];

                    } else if (arr[i] < 0) {
                        if (neg == 0) neg = 1;
                        neg *= arr[i];
                        if (start == -1) {
                            start = i;
                            last = i;
                        } else last++;

                        max = Math.max(max, Math.max(pos, neg));
                        pos = 0;

                    } else {
                        if (start == last) {
                            max = Math.max(pos, max);
                        } else {
                            neg = neg / Math.min(arr[start], arr[last]);
                            max = Math.max(max, Math.max(pos,neg));
                        }
                        neg = 0;
                        pos = 0;
                        start = -1;
                        last = -1;

                    }
                }
                max = Math.max(max, Math.max(pos, neg));
                System.out.println(max);
            }
        }
    }

}
