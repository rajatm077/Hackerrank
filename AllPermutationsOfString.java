/**
 * Created by MalhotR1 on 03/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllPermutationsOfString {
    public static void main(String[] args) throws IOException {
        String str = "ABC";
        permute(str, 0, str.length() - 1);
    }

    private static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <=  r; i++) {
                str = swap(str, l, i);
                permute(str, l+1, r);
                str = swap(str, l, i);
            }
        }

    }

    private static String swap(String str, int l, int r) {
        char[] arr = str.toCharArray();
        char c = arr[l];
        arr[l] = arr[r];
        arr[r] = c;
        return String.valueOf(arr);
    }

}
