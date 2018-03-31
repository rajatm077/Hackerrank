/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; t++) {
            boolean balanced = true;
            String in = br.readLine().trim();
            char[] arr = in.toCharArray();
            Stack<Character> stk = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
                    stk.push(arr[i]);

                else {
                    if (stk.empty()) {
                        balanced = false;
                        break;
                    }
                    char c = stk.pop();
                    if ((c == '(' && arr[i] == ')') || (c == '{' && arr[i] == '}')
                            || c == '[' && arr[i] == ']') continue;
                    else {
                        System.out.println("not balanced");
                        balanced = false;
                        break;
                    }
                }
            }
            if (!stk.empty() || !balanced) {
                System.out.println("not balanced");
            } else {
                System.out.println("balanced");
            }
        }
    }
}