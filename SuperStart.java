/**
 * Created by MalhotR1 on 04/02/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SuperStart {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                String[] in = br.readLine().trim().split(" ");
                int[] arr = new int[N];
                Stack<Integer> stk = new Stack<>();
                int ss = -1;
                int temp = ss;
                for (int i = in.length - 1; i >=0; i--) {
                    arr[i] = Integer.parseInt(in[i]);
                    if (ss < arr[i]) {
                        ss = arr[i];
                        temp = ss;
                    }
                    else if (ss == arr[i]) temp = -1;
                    if (i == in.length - 1) stk.push(arr[i]);
                    else {
                        int k = stk.peek();
                        if (k < arr[i]) stk.push(arr[i]);
                    }
                }
                while (!stk.empty()) {
                    System.out.print(stk.pop() + " ");
                }
                System.out.println();
                if (temp == -1) System.out.println( temp);
                else System.out.println(ss);
            }
        }
    }

}
