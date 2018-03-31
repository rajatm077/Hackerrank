/**
 * Created by MalhotR1 on 01/31/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nums = {12,2,2,2,3,3,3};
            HashMap<Integer, Integer> hm = new HashMap<>();
            int temp = 0;
            for (int i = 0; i < nums.length; i++) {
                if (hm.containsKey(nums[i])) {
                    hm.replace(nums[i], hm.get(nums[i]), 0);
                } else hm.put(nums[i], 1);
            }
            for (Integer i: hm.keySet()) {
                if (hm.get(i) == 1) System.out.println(i);
            }
        }
    }

}
