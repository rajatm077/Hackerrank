/**
 * Created by MalhotR1 on 01/22/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrangeGrid {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int row = Integer.parseInt(in[0]);
            int col = Integer.parseInt(in[1]);
            col = (col - 1) * 2;
            long res = col;
            for (int i = 2; i <= row ; i++) {
                if (i % 2 == 0) res++;
                else res = res + 9;
                if (res <= 0) System.out.println(i);
            }
            System.out.println(res);
        }
    }


}
