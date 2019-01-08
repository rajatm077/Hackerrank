/**
 * Created by MalhotR1 on 04/20/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) throws IOException {
        int[] arr = { 2, 0, 1, 2, 0, 3, 2, 2, 2, 1, 0, 0, 0, 1, 0, 0, 2, 2, 2, 3, 2, 3, 1, 2, 1, 2, 2, 3, 2, 3, 0, 3, 0, 2, 1, 2, 0, 0, 3, 2, 3, 0, 3, 0, 2, 3, 2, 2, 3, 1, 3, 3, 0, 3, 3, 0, 3, 3, 2, 0, 0, 0, 0, 1, 3, 0, 3, 1, 3, 1, 0, 2, 3, 3, 3, 2, 3, 3, 2, 2, 3, 3, 3, 1, 3, 2, 1, 0, 0, 0, 1, 0, 3, 2, 1, 0, 2, 3, 0, 2, 1, 1, 3, 2, 0, 1, 1, 3, 3, 0, 1, 2, 1, 2, 2, 3, 1, 1, 3, 0, 2, 2, 2, 2, 1, 0, 2, 2, 2, 1, 3, 1, 3, 1, 1, 0, 2, 2, 0, 2, 3, 0, 1, 2, 1, 1, 3, 0, 2, 3, 2, 3, 2, 0, 2, 2, 3, 2, 2, 0, 2, 1, 3, 0, 2, 0, 2, 1, 3, 1, 1, 0, 0, 3, 0, 1, 2, 2, 1, 2, 0, 1, 0, 0, 0, 1, 1, 0, 3, 2, 3, 0, 1, 3, 0, 0, 1, 0, 1, 0, 0, 0, 0, 3, 2, 2, 0, 0, 1, 2, 0, 3, 0, 3, 3, 3, 0, 3, 3, 1, 0, 1, 2, 1, 0, 0, 2, 3, 1, 1, 3, 2};
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        al.clear();

        for (int i : arr) ar.add(i);
        al.addAll(ar);

        int i = 0;
        int j = al.size() - 1;
        int val = 2;

        while (j >= 0 && al.get(j) == val) j--;
        while (i < j) {
            if (al.get(i) == val) {
                i++;
                while (i < j && al.get(i) != val) {
                    al.set(i-1, al.get(i));
                    i++;
                }
                al.remove(i);
                j--;
                while (j >= 0 && al.get(j) == val) j--;

            } else i++;
        }
        while (j < al.size()) al.remove(j);
        System.out.println(al.size());
    }

    private static int removeElement(int[] arr, int val) {
        int last = arr.length - 1;
        int first = 0;
        while (last >= 0 && arr[last] == val) last--;
        while (first < last) {
            if (arr[first] == val) {
                arr[first] = arr[last];
                arr[last] = val;
                last--;
                while (last >= 0 && arr[last] == val) last--;
            }
            first++;
        }

        return last + 1;
    }

}
