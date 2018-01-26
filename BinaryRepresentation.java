/**
 * Created by MalhotR1 on 01/24/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BinaryRepresentation {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(10);
        A.add(2);
        A.add(1);
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
            B.set(i, A.get(i));
            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        for (int i = 0; i < B.size(); i++) {
            System.out.print(B.get(i) + " ");
        }
    }

}
