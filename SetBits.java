/**
 * Created by MalhotR1 on 01/25/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetBits {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            while (N > 0) {
                N = N & N-1;
                count++;
            }
            System.out.println(count);
        }
    }

}
