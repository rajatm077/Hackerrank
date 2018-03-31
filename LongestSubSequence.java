/**
 * Created by MalhotR1 on 01/25/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSubSequence {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
//            int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
            int[] arr = {0, 8, 4};
            int len = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                int temp = Find(arr,0, 0);
                len = Math.max(len, temp);
            }
            System.out.println(len);
        }
    }

    private static int Find(int[] arr, int i, int l) {
        if (i >= 0 && i < arr.length - 1) {
            int max = 0;
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[j] < arr[k]) {
                        temp = Find(arr, j, l + 1);
                    }
                }
                max = Math.max(max, temp);

            }
        }
        return l;
    }

}
