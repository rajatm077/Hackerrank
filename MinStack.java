/**
 * Created by MalhotR1 on 03/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinStack {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            Stack<Integer> stk = new Stack<>();
            Stack<Integer> minstk = new Stack<>();
            for (int i = 0; i < arr[i]; i++) {
                if (stk.empty()) {
                    stk.push(arr[i]);
                    minstk.push(arr[i]);
                }else {
                    int top = minstk.peek();
                    if (top > arr[i]) top = arr[i];
                    minstk.push(top);
                    stk.push(top);
                }

            }
        }
    }

}
