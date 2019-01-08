/**
 * Created by MalhotR1 on 12/14/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RadioTransmitter {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            in = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            Arrays.sort(arr);

            k = k*2;
            if (k % 2 != 0) k++;
            int index = 0;
            int count = 0;
            while (index < arr.length) {
                int next = arr[index] + k - 1;
                while (Arrays.binarySearch(arr, next) < 0) next--;
                index = Arrays.binarySearch(arr, next) + 1;
                count++;
            }

            System.out.println(count);


        }
    }

}
