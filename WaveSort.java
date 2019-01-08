/**
 * Created by MalhotR1 on 04/07/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WaveSort {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                String[] in = br.readLine().trim().split(" ");
                int[] arr = new int[N];
                ArrayList<Integer> al = new ArrayList<>();
                for (int i = 0; i < N; i++) {
                    arr[i] = Integer.parseInt(in[i]);
                    al.add(arr[i]);
                }

                Collections.sort(al);
                ArrayList<Integer> sol = new ArrayList<>();
                sol.addAll(al);
                for (int i = 1; i <= al.size(); i += 2) {
                    if (i == al.size()) {
                        sol.set(i-1, al.get(i-1));
                    } else {
                        sol.set(i-1, al.get(i));
                        sol.set(i, al.get(i-1));
                    }
                }

                for (int i = 0; i < sol.size(); i++) {
                    System.out.print(sol.get(i) + " ");
                }
                System.out.println();
            }
        }
    }

}
