/**
 * Created by MalhotR1 on 04/17/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(-9, "abc");
        tm.put(4, "def");

        for (Integer i : tm.keySet()) {
            System.out.println(tm.get(i));
        }
    }

}
