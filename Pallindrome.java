/**
 * Created by MalhotR1 on 01/25/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pallindrome {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] in = br.readLine().toCharArray();
            int[] plain = new int[in.length];
            int start = 0;
            for (int i = 0; i < in.length; i++) {
                if ((in[i] >= 97 && in[i] <= 122) || in[i] >= 48 && in[i] <= 57) {
                    plain[start++] = (int) in[i];
                } else if (in[i] >= 65 && in[i] <= 90) {
                    plain[start++] = (int) in[i] + 32;
                }
            }

            boolean isp = true;

            for (int i = 0; i < start/2; i++) {
                if (plain[i] != plain[start - i -1]) {
                    isp = false;
                    break;
                }
            }

            System.out.println(isp);
        }
    }

}
