/**
 * Created by MalhotR1 on 04/07/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingPos {
    public static void main(String[] args) throws IOException {
        int[] nums = {1,2,0};
        int n = nums.length;
        long sum = (n % 2 == 0) ? (n/2 * (n+1)) : (((n+1)/2)*n);
        long temp = 0;
        for (int i=0; i<n; i++) {
            if (nums[i] > 0) temp += nums[i];
        }
//        int i = Integer.MAX_VALUE
        int sol = (int) (sum - temp);
        System.out.println(sol);
    }

}
