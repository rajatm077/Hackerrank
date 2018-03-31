/**
 * Created by MalhotR1 on 03/31/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String[] in = br.readLine().trim().split(" ");
                String[] in2 = br.readLine().trim().split(" ");

                int N = Integer.parseInt(in[0]);
                int sum = Integer.parseInt(in[1]);
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = Integer.parseInt(in2[i]);
                }

                Arrays.sort(arr);
                if (arr[0] > sum) {
                    System.out.println(0);
                    continue;
                }
                int tempSum = 0;
                boolean found = false;
                for (int i = 0; i < arr.length - 2; i++) {
                    tempSum = arr[i];
                    int start = i+1;
                    int end = arr.length - 1;
                    while(start < end) {
                        tempSum = arr[i] + arr[start] + arr[end];
                        if (tempSum > sum) {
                            end--;
                        }
                        else if (tempSum < sum) start++;
                        else {
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (found) System.out.println(1);
                else System.out.println(0);


            }
        }
    }

}
