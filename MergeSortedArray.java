/**
 * Created by MalhotR1 on 04/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String[] in = br.readLine().trim().split(" ");
                String[] in1 = br.readLine().trim().split(" ");
                String[] in2 = br.readLine().trim().split(" ");
                int[] arr1 = new int[in1.length];
                int[] arr2 = new int[in2.length];
                for (int i = 0; i < in1.length; i++) {
                    arr1[i] = Integer.parseInt(in1[i]);
                }

                for (int i = 0; i < in2.length; i++) {
                    arr2[i] = Integer.parseInt(in2[i]);
                }

                Arrays.sort(arr1);
                Arrays.sort(arr2);
                ArrayList<Integer> arr = new ArrayList<>();
                int index = 0;
                int i = arr1.length - 1;
                int j = arr2.length - 1;
                while (i >= 0 && j >= 0) {
                    if (arr1[i] > arr2[j]) {
                        arr.add(arr1[i]);
                        i--;
                    } else {
                        arr.add(arr2[j]);
                        j--;
                    }
                }

                if (i == -1){
                    while (j >= 0) {
                        arr.add(arr2[j--]);
                    }
                }
                else {
                    while (i >= 0) {
                        arr.add(arr1[i--]);
                    }
                }

                for ( Integer integer: arr
                     ) {
                    System.out.print(integer + " ");
                }
                System.out.println();
            }
        }
    }

}
