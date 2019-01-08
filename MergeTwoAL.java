/**
 * Created by MalhotR1 on 04/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MergeTwoAL {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(6);
        a.add(8);
        b.add(0);

        int i = 0;
        int j = 0;
        while(i< a.size() && j<b.size()) {

            if(a.get(i) > b.get(j)) {
                a.add(i, b.get(j));
                j++;
            }
            i++;
        }

        while(j<b.size()) {
            a.add(b.get(j));
            j++;
        }



        for (int k = 0; k < a.size(); k++) {
            System.out.print(a.get(k) + " ");
        }
    }

}
