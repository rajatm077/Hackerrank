/**
 * Created by MalhotR1 on 03/31/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ThreeSumZero {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] arr = {-1,0, 1, 2, -1, -4}; //, -1, -4};
            List<List<Integer>> al = threeSum(arr);
            for (List<Integer> row : al) {
//                Collections.sor
                for (Integer i : row) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> all = new ArrayList<>();
        HashMap<String, Boolean> hm = new HashMap<>();
        Arrays.sort(arr);
//        int sum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i-1]) continue;
            int sum = 0;
            boolean isSumZero = false;
            int start = i+1;
            int end = arr.length - 1;
            String str = "";
            while (start < end) {
                sum = arr[i] + arr[start] + arr[end];
                if (sum == 0) {
                    List<Integer> set = new ArrayList<>();

                    set.add(arr[i]);
                    set.add(arr[start]);
                    set.add(arr[end]);
                    isSumZero = true;
                    str = Integer.toString(arr[i]) + Integer.toString(arr[start]) +
                            Integer.toString(arr[end]);

                    if (!hm.containsKey(str)) {
                        all.add(set);
                        hm.put(str, true);
                    }

                    start++;
                    end--;
                } else if (sum > 0) {
                    end--;
                } else start++;
            }

        }
        return all;
    }

}
