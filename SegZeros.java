/**
 * Created by malhotr1 on 04/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SegZeros {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                String[] in = br.readLine().trim().split(" ");
                int[] arr = new int[in.length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(in[i]);
                }
                int zi = 0;
                for (int i = 0; i < arr.length-1; i++) {
                    if (arr[i] != 0)continue;
                    else {
                        int j = i+1;
                        while (j < arr.length && arr[j] == 0) j++;
                        if (j >= arr.length) break;
                        arr[i] = arr[j];
                        arr[j] = 0;
                    }
                }


                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

}
