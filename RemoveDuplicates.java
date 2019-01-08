/**
 * Created by MalhotR1 on 04/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        int[] nums = {1,1,2};
        for (int i = 0; i < nums.length - 1; i++) {
            int crr = nums[i];
            int j = i+1;
            while (j < nums.length && crr == nums[j]) j++;


        }
    }

}
