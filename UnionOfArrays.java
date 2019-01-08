/**
 * Created by MalhotR1 on 04/18/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class UnionOfArrays {
    public static void main(String[] args) throws IOException {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        A.add(10000000);
        B.add(10000000);
        Stack<Integer> stk = new Stack<>();

        if (A.size() == 0 || B.size() == 0) System.out.println(-1);

        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        sol.add(al);
        al.add(20);
        al = new ArrayList<>();


        int i1 = 0;
        int i2 = 0;

        while (i1 < A.size() && i2 < B.size()) {
            int first = A.get(i1);
            int second = B.get(i2);
            if (first == second) {
                al.add(A.get(i1));
                i1++;
                i2++;
            } else if (A.get(i1) > B.get(i2)) {
                i2++;
            } else {
                i1++;
            }
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

    }

}
