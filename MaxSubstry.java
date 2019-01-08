/**
 * Created by MalhotR1 on 04/02/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSubstry {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                char[] in = br.readLine().trim().toCharArray();
                int n1 = 0;
                int n0 = 0;
                for (int i = 0; i < in.length; i++) {
                    if (in[i] == '1') n1++;
                    else n0++;
                }
                if (n1 == n0) System.out.println(in.length);
                else {
                    char del = '1';
                    if (n1 < n0) del = '0';
                }
                n1 = 0;
                n0 = 0;
                int temp = 0;
                int length = 0;


                System.out.println(length);

            }
        }
    }

}
