/**
 * Created by MalhotR1 on 02/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XOR {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] arr = {10,0,1,1,10};
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp ^= arr[i];
            }
            System.out.println(temp);
        }
    }

}
