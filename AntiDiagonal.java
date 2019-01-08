/**
 * Created by MalhotR1 on 04/17/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntiDiagonal {
    public static void main(String[] args) throws IOException {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10,11,12},
                {13, 14,15,16}
        };
        int[][] arr2 = {
                {1, 2},
                {4, 5}
        };
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            int k = 0;
            while (j >= 0 && k < arr.length) {
                System.out.print(arr[k][j] + " ");
                j--;
                k++;
            }
            System.out.println();
        }

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int k = arr[i].length - 1;
            while (j < arr[i].length && k >= i) {
                System.out.print(arr[j][k] + " ");
                j++;
                k--;
            }
            System.out.println();
        }
    }

}
