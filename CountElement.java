/**
 * Created by MalhotR1 on 01/25/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountElement {
    public static void main(String[] args) throws IOException {
        int[] arr = {1,2,2,3,4,5};
        System.out.println(search(arr, 1, 0, arr.length - 1));
        System.out.println(search(arr, 2, 0, arr.length - 1));
        System.out.println(search(arr, 3, 0, arr.length - 1));
        System.out.println(search(arr, 4, 0, arr.length - 1));
        System.out.println(search(arr, 5, 0, arr.length - 1));
        System.out.println(search(arr, 6, 0, arr.length - 1));
    }
    public static int search(int[] arr, int key, int start, int end) {
        if (start == end) {
            if (arr[start] == key) return start;
            else return -1;
        }
        int mid = (start + end) / 2;
        if  (arr[mid] == key) return mid;
        else if (arr[mid] < key) return search(arr, key, mid + 1, end);
        else return search(arr, key, start, mid-1);

    }

}
