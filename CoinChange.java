/**
 * Created by MalhotR1 on 01/03/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                String[] in = br.readLine().trim().split(" ");
                int total = Integer.parseInt(br.readLine().trim());

                int[] coins = new int[N];
                for (int i = 0; i < N; i++) {
                    coins[i] = Integer.parseInt(in[i]);
                }
                Arrays.sort(coins);
                int[] sol = new int[total+1];
                for (int i = 0; i < coins.length; i++) {
                    if (coins[i] >= sol.length) break;
                    sol[coins[i]] = 1;
                }

                for (int i = 0; i < sol.length; i++) {
                    if (sol[i] == 1) continue;
                    sol[i] = -1;
                }


                for (int i = 1; i < sol.length; i++) {
                    if (sol[i] == 1) continue;
                    for (int j = coins.length - 1; j >= 0; j--) {
                        if (coins[j] > i) continue;

                        if (sol[i - coins[j]] == -1) continue;

                        if (sol[i] == -1) {
                            sol[i] = sol[coins[j]] + sol[i - coins[j]];
                            continue;
                        }

                        sol[i] = Math.min(sol[i], sol[coins[j]] + sol[i - coins[j]]);
                    }

                    if (i > 1) {
                       if (sol[i-1] == -1 || sol[i-2] == -1) continue;
                       else sol[i] = Math.min(sol[i], sol[i-1] + sol[i-2]);
                    }
                }
                System.out.println(sol[total]);

            }
        }
    }

}
