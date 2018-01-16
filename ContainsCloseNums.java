/**
 * Created by MalhotR1 on 01/17/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ContainsCloseNums {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int k = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            boolean flag = containsCloseNums(arr, k);
            System.out.println(flag);
        }
    }

    static boolean containsCloseNums(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                int diff = i - index;
                if (diff <= k) return true;
                map.replace(nums[i], index, i);

            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
