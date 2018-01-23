/**
 * Created by MalhotR1 on 01/22/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EvenOddQuery {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            arr = new int[N];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            int Q = Integer.parseInt(br.readLine().trim());
            for (int q = 0; q < Q; q++) {
                if (q == 500) {
                    System.out.println("Check");
                }
                String[] qu = br.readLine().trim().split(" ");
                int x = Integer.parseInt(qu[0]);
                int y = Integer.parseInt(qu[1]);
                x--;
                y--;

                if (x > y) {
                    System.out.println("Odd");
                    continue;
                }

                if (arr[x] == 0) {
                    System.out.println("Even");
                } else if (arr[x] % 2 == 1) {
                    System.out.println("Odd");
                } else {
                    if (arr[x+1] == 0 && x < y) System.out.println("Odd");
                    else System.out.println("Even");
                }
            }
        }
    }

}
