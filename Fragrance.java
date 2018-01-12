/**
 * Created by MalhotR1 on 01/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fragrance {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            String[] in2 = br.readLine().trim().split(" ");

            int N = Integer.parseInt(br.readLine().trim());
            String[] xi = br.readLine().trim().split(" ");
            String[] yi = br.readLine().trim().split(" ");

            int Q = Integer.parseInt(br.readLine().trim());
            String[] in3 = br.readLine().trim().split(" ");
            int[] T = new int[in3.length];
            for (int i = 0; i < T.length; i++) {
                T[i] = Integer.parseInt(in3[i]);
            }


            int x1 = Integer.parseInt(in[0]);
            int y1 = Integer.parseInt(in[1]);

            int x2 = Integer.parseInt(in2[0]);
            int y2 = Integer.parseInt(in2[1]);

            int[][] locs = new int[N][2];
            for (int i = 0; i < N; i++) {
                locs[i][0] = Integer.parseInt(xi[i]);
                locs[i][1] = Integer.parseInt(yi[i]);
            }

            for (int t = 0; t < T.length; t++) {
                int cnt = 0;
                int r = T[t];
                for (int i = 0; i < N; i++) {
                    boolean f1 = false;
                    boolean f2 = false;
                    int x1diff = Math.abs(locs[i][0] - x1);
                    int y1diff = Math.abs(locs[i][1] - y1);
                    if (x1diff < r && y1diff < r) f1 = true;

                    int x2diff = Math.abs(locs[i][0] - x2);
                    int y2diff = Math.abs(locs[i][1] - y2);

                    if (x2diff < r && y2diff < r) f2 = true;

                    if (f1 && f2) cnt++;
                }
                System.out.println(cnt);
            }


        }
    }

}
