/**
 * Created by MalhotR1 on 04/02/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValueIndex {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");

            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                String[] in = br.readLine().trim().split(" ");
                int[] arr = new int[N];
//                boolean fl = false;
                int val = -1;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(in[i]);
                    if (i + 1 == arr[i]) {
//                        fl = true;
                        System.out.println(arr[i] + " ");
                        val = 0;
                    }
                }
                if (val == -1) System.out.println("Not Found");
                else System.out.println(val);
            }
        }
    }

}
