/**
 * Created by MalhotR1 on 04/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class RomanToDec {
    public static void main(String[] args) throws IOException {
       char[] roman = "MCMIV".toCharArray();
        Stack<Integer> stack = new Stack<>();
        HashMap<Character,Integer> hm  = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int crr = hm.get(roman[0]);
        stack.push(crr);
        for (int i = 1; i < roman.length; i++) {
            int n = hm.get(roman[i]);
            if (n > crr) {
                stack.push(stack.peek() - crr);
                stack.push( n + stack.peek() - crr);
            } else {
                stack.push( n + stack.peek());
            }
            crr = n;
        }
        System.out.println(stack.peek());
    }

}
