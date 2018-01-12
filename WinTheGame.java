/**
 * Created by MalhotR1 on 01/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WinTheGame {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String[] in = br.readLine().trim().split(" ");
                int R = Integer.parseInt(in[0]);
                int G = Integer.parseInt(in[1]);
                double p = 0.0;
                if (R == 0 || G == 0) {
                    System.out.println(1.0);
                    continue;
                }
                boolean sat = true;
                float r = R*1.0f;
//                while (G > 0) {
//                    if (sat) p += r/(r+G);
//                    else p = p + p*(float)G/(r+G);
//                    sat = !sat;
//                    G--;
//                }
                float fac = 1.0f;
                while (G > 0) {
                    if (sat) p += fac*r/(r+G);
                    else fac=G/(r+G);
                    sat = !sat;
                    G--;
                }
                System.out.println(p);
            }
        }

    }

}
