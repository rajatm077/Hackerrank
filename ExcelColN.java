/**
 * Created by MalhotR1 on 03/31/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcelColN {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                long total = 0;
                char[] arr = br.readLine().trim().toCharArray();
                int power = 0;
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (power == 0) total += arr[i] - 'A' + 1;
                    else total += (int) Math.pow(26, power) * (arr[i] - 'A' + 1);
                    power++;
                }
                System.out.println(total);
            }
        }
    }

}
