/**
 * Created by MalhotR1 on 01/22/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiwaliLights {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                long res = 1;
                for (int i = 0; i < N; i++) {
                    res = (res << 1) % 100000;
                }
                res--;
                System.out.println(res);
            }
        }
    }
}
