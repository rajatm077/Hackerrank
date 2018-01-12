/**
 * Created by MalhotR1 on 01/03/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DPToNRecursive {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            long[] table = new long[N + 1];
            table[0] = 1;
            table[1] = 1;
            table[2] = 1;
            table[3] = 2;
            long sol = FindWays(table, N);
            System.out.println(sol);
            for (int i = 0; i < table.length; i++) {
                System.out.print(table[i] + " ");
            }
            System.out.println();
        }
    }

    private static long FindWays(long[] table, int n) {
        if (table[n] > 0) return table[n];
        else {
            table[n] = FindWays(table, n-1) + FindWays(table, n-3) + FindWays(table, n-4);
            return table[n];
        }
    }

}
