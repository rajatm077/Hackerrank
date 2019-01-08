/**
 * Created by MalhotR1 on 04/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortedInsertPosition {
    public static void main(String[] args) throws IOException {
        int[] arr = {1,3};
        for (int i = 0; i < 9; i++) {
            int pos = findPos(arr, i);
            System.out.println(i + ": " + pos);

        }
    }

    private static int findPos(int[] arr, int target) {
        if (target < arr[0])return 0;
        if (target > arr[arr.length - 1]) return arr.length;
        int i = 0;
        int j = arr.length - 1;
        boolean flag = false;

        int mid = 0;
        while (i <= j && !flag) {
            mid = (i + j) / 2;
            if (arr[mid] == target) flag = true;
            else if (arr[mid] > target) j = mid - 1;
            else i = mid + 1;
        }
        if (flag) return mid;
        else return i;
    }

}
