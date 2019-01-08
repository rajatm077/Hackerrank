/**
 * Created by malhotr1 on 04/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Flip {
    public static void main(String[] args) throws IOException {
        String test = "010";
        ArrayList<Integer> sol = flip(test);
    }

    private static ArrayList<Integer> flip(String A) {
        ArrayList<Integer> sol = new ArrayList<>();
        if (A.length() == 0) return sol;
        int[] test = new int[A.length()];
        char[] arr = A.toCharArray();
        for (int i = 0; i < test.length; i++) {
            test[i] = arr[i] - '0';
        }
        boolean allZero = true;
        boolean allOne = true;
        for (int i = 0; i < test.length && (allOne || allZero); i++) {
            if (test[i] == 0) allOne = false;
            if (test[i] == 1) allZero = false;
        }

        if (allZero) {
            sol.add(1);
            sol.add(test.length);
        } else if (allOne) {
            return sol;
        }

        int temp = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < test.length; i++) {
            if (test[i] == 0) {
                if (end == 0) end = i+1;
                if (start == 0) {
                    start = i+1;
                    end = start;
                }
                else end++;
            }
        }
        return sol;

    }

}
