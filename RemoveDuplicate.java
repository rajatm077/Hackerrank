/**
 * Created by MalhotR1 on 04/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicate {
    public static void main(String[] args) throws IOException {
        int[] nums = {1,2,3,3,4,4,5,6};
        int length = removeDuplicate(nums);
        System.out.println(length);
    }

    private static int removeDuplicate(int[] arr) {

        int len = arr.length;
        int dupli = 0;

        for (int i = 0; i < arr.length;) {
            int j = i+1;
            for (; j < arr.length && arr[j] == arr[i]; j++) {
                dupli++;
                arr[j] = -1;
            }
            i = j;
        }

        int start = dupli;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == -1 && dupli >= 0) {
                int j = i+1;
                dupli--;
                while (j < arr.length && arr[j] == -1) {
                    j++;
                }
                arr[i] = arr[j];
                arr[j] = -1;
            }
        }
        return arr.length - start;
    }

}
