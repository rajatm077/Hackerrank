import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by MalhotR1 on 09/19/2017.
 */
public class BalancingBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        Stack<Character> stk = null;
        char[] open = {'{', '[', '('};
        char[] close = {'}', ']', ')'};
        for (int i = 0; i < T; i++) {
            char[] input = br.readLine().trim().toCharArray();
            stk = new Stack<>();
            boolean isBalanced = true;

            for (int j = 0; j < input.length; j++) {
                char c = input[j];

                if (c == '{' || c == '[' || c == '(') {
                    stk.push(c);

                } else {
                    if (stk.empty()) {
                        isBalanced = false;
                        break;
                    }
                    int k = 0;
                    for (; k < close.length; k++) {
                        if (close[k] == c) break;
                    }

                    char top = stk.pop();
                    if (top != open[k]) {
                        isBalanced = false;
                        break;
                    }
                }
            }
            if (isBalanced) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
