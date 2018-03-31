/**
 * Created by MalhotR1 on 01/23/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockGCD {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                String[] in = br.readLine().trim().split(" ");
                int[] arr = new int[N];
                boolean flag = false;

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(in[i]);
                    if (arr[i] == 1) {
                        System.out.println("YES");
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    for (int j = 1; j < arr.length; j++) {
                        int g = gcd(arr[0], arr[j]);
                        if (g == 1) {
                            System.out.println("YES");
                            flag = true;
                            break;
                        } else arr[0] = g;
                    }

                    if (!flag) System.out.println("NO");
                }
            }
        }
    }

    private static int gcd(int a, int b) {
        if (a == b) return a;
        int big = 0;
        int small = 0;

        if (a > b) big = a;
        else big = b;
        small = a + b - big;


        while (true) {
            if (big % small == 0) return small;
            else {
                int temp = big % small;
                big = small;
                small = temp;
            }
        }
    }

}
