/**
 * Created by MalhotR1 on 01/23/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddCheck {
    static int[] arr = {0, 2, 0, 1, 0, 5, 6};

    public static void main(String[] args) throws IOException {
        for (int i = 1; i < arr.length; i++) {
            int res = find(0,i);
            System.out.println(res);
        }
    }

    private static int find(int x, int y) {
        if (x > y ) return 1;
        return (int) Math.pow(arr[x], find(x+1, y));
    }
}

