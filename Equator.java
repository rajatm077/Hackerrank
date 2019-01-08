/**
 * Created by MalhotR1 on 04/16/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Equator {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[N];
            long sum = 0;
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                sum += arr[i];
            }

            long temp = 0;
            long res = sum >> 1;
            if (sum % 2 != 0) res++;
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
                if (temp >= res) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }

}
