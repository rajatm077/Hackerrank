/**
 * Created by MalhotR1 on 01/31/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseBits {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            for (int t = 0; t < 1; t++) {
                long N =   2147483648L;
                int[] arr = new int[32];
                long out = 0;
                int i = 0;
                while (N > 0) {
                    arr[i++] =(int) N & 1;
                    N = N / 2;
                }
                int l = arr.length - 1;
                for (int j = l; j >= 0; j--) {
                    long temp = 1L << (31 - j);
                    out += (long) arr[j]*temp;
                }
                System.out.println(out);
            }
        }
    }

}
