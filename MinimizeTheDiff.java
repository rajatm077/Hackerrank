/**
 * Created by MalhotR1 on 04/19/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimizeTheDiff {
    public static void main(String[] args) throws IOException {
        int[] a = {1,4,10};
        int[] b = {2,15,20};
        int[] c = {10, 15};

        int diff = Integer.MAX_VALUE;
        int temp = 0;
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            temp = Math.abs(a[i] - c[k]) + Math.abs(a[i] - b[j]) + Math.abs(b[j] - c[k]);
            if (temp < diff) diff = temp;
            if (a[i] < b[j] || a[i] < c[k]) i++;
            else if (b[j] < c[k]) j++;
            else k++;
        }

        System.out.println(diff);
    }

}
