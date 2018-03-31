/**
 * Created by MalhotR1 on 03/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[N];
            int totalSum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                if (i < 2) continue;
                totalSum += arr[i];
            }
            if (N == 1) {
                System.out.println(1);
                continue;
            }
            int sumL = arr[0];
            boolean f = false;
            int i = 0;
            for (i = 1; i < arr.length - 1; i++) {
                if (sumL == totalSum) {
                    f = true;
                    break;
                } else {
                    sumL += arr[i];
                    totalSum -= arr[i+1];
                }

            }
            if (!f) {
                System.out.println(-1);
                continue;
            }

            else System.out.println(i+1);


        }
    }


}


