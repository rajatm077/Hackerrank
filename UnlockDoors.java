/**
 * Created by MalhotR1 on 02/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class UnlockDoors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] doors = new int[n];
        for(int doors_i = 0; doors_i < n; doors_i++){
            doors[doors_i] = in.nextInt();
        }
        int[] result = revisedRussianRoulette(doors);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        in.close();
    }

    static int[] revisedRussianRoulette(int[] doors) {
        int[] out = new int[2];
        int[] dmin = Arrays.copyOf(doors, doors.length);
        int cnt = 0;
        for (int i = 0; i < dmin.length; i++) {
            if (dmin[i] == 1) {
                dmin[i] = 0;
                cnt++;
                if (i < dmin.length - 1 && dmin[i+1] == 1) {
                    dmin[i+1] = 0;
                }
            }
        }
        out[0] = cnt;
        cnt = 0;
        for (int i = doors.length - 1; i >= 0 ; i--) {
            if (doors[i] == 1) cnt++;
        }
        out[1] = cnt;
        return out;
    }

}
