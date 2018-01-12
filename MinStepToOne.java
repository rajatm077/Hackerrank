/**
 * Created by MalhotR1 on 01/01/2018.
 * DP Practise 1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinStepToOne {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int N = Integer.parseInt(br.readLine().trim());
            int[] table = new int[N];
            for (int i = 0; i < table.length; i++) {
                table[i] = -1;
            }
            System.out.println(Compute(table, N));
            for (int i = 0; i < N; i++) {
                System.out.print(table[i] + " ");
            }
        }
    }

    private static int Compute(int[] table, int n) {
        if (n == 1) {
            table[0] = 0;
            return 0;
        }

        if (table[n - 1] != -1) return table[n - 1];

        int r = 1 + Compute(table, n - 1);
        if (n % 2 == 0) r = Math.min(r, 1 + Compute(table, n / 2));
        if (n % 3 == 0) r = Math.min(r, 1 + Compute(table, n / 3));

        table[n-1] = r;
        return r;
    }
}