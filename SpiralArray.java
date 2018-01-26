/**
 * Created by MalhotR1 on 01/25/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiralArray {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int A = Integer.parseInt(br.readLine().trim());
            int len = 2*A - 1;
            int[][] out = new int[len][len];
            int i = 0;
            int j = 0;
            while (A > 0) {
                for (int k = i; k < len-i; k++) {
                    out[i][k] = A;
                    out[len-i-1][k] = A;
                    out[k][i] = A;
                    out[k][len-i-1] = A;
                }
                A--;
                i++;
            }
            for (int k = 0; k < len; k++) {
                for (int l = 0; l < len; l++) {
                    System.out.print(out[k][l] + " ");
                }
                System.out.println();
            }
        }
    }

}
