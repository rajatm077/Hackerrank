/**
 * Created by MalhotR1 on 01/23/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PossiblePath {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String[] in = br.readLine().trim().split(" ");
                long a = Long.parseLong(in[0]);
                long b = Long.parseLong(in[1]);
                long x = Long.parseLong(in[2]);
                long y = Long.parseLong(in[3]);
                long diff1 = Math.abs(x-a);

                if ((diff1 % b) != 0) {
                    System.out.println("NO");

                }
                long diff2 = Math.abs(y-b);
                if ((diff2 % a) != 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }

            }
        }
    }

}
