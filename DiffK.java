/**
 * Created by MalhotR1 on 04/20/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DiffK {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String[] in = br.readLine().trim().split(" ");
                int N = Integer.parseInt(in[0]);
                int diff = Integer.parseInt(in[1]);
                in = br.readLine().trim().split(" ");
                int[] arr = new int[in.length];
                for (int i = 0; i < in.length; i++) {
                    arr[i] = Integer.parseInt(in[i]);
                }

                boolean found = false;
                Arrays.sort(arr);
                for (int i = 0; i < arr.length - 1; i++) {
                    int k = Arrays.binarySearch(arr, arr[i] + diff);
                    if (Math.abs(arr[k] - arr[i]) == diff) {
                        found = true;
                        break;
                    }
                }
                System.out.println(found);
            }
        }
    }

}
