/**
 * Created by MalhotR1 on 01/01/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinStepToOne2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] table = new int[N+1];
            table[1] = 0;
            for (int i = 2; i <= N; i++) {
                table[i] = 1 + table[i-1];
                if (i%2 == 0) table[i] = Math.min(table[i], 1 + table[i/2]);
                if (i%3 == 0) table[i] = Math.min(table[i], 1 + table[i/3]);
            }
            for (int i = 0; i <= N; i++) {
                System.out.print(table[i] + " ");
            }
            System.out.println();
        }
    }

}
