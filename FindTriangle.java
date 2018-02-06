/**
 * Created by MalhotR1 on 02/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTriangle {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int base = Integer.parseInt(in[0]);
            int area = Integer.parseInt(in[1]);
            int h = (int) Math.ceil((float)(area *2.0) / base);
            System.out.println(h);
        }
    }

}
