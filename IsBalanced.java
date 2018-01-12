/**
 * Created by MalhotR1 on 01/11/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class IsBalanced {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                Stack<Character>stk = new Stack<>();
                char[] in = br.readLine().trim().toCharArray();
                boolean isBalanced = true;

                for (int i = 0; i < in.length; i++) {
                    if (in[i] == '(' || in[i] == '{' || in[i] == '[') {
                        stk.push(in[i]);

                    } else {
                        if (stk.empty()) {
                            isBalanced = false;
                            break;

                        } else if (in[i] == ')') {
                            char c = stk.peek();
                            if (c != '(') {
                                isBalanced = false;
                                break;

                            } else stk.pop();

                        } else if (in[i] == '}') {
                            char c = stk.peek();
                            if (c != '{') {
                                isBalanced = false;
                                break;

                            } else stk.pop();

                        } else if (in[i] == ']') {
                            char c = stk.peek();
                            if (c != '[') {
                                isBalanced = false;
                                break;

                            } else stk.pop();
                        }
                    }

                }

                if (isBalanced && stk.empty()) System.out.println("YES");
                else System.out.println("NO");

            }
        }
    }

}
