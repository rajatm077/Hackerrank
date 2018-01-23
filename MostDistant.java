/**
 * Created by MalhotR1 on 01/23/2018.
 */

import org.omg.CORBA.MARSHAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MostDistant {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            long xl = Long.MAX_VALUE;
            long yl = Long.MAX_VALUE;
            long xr = Long.MIN_VALUE;
            long yr = Long.MIN_VALUE;

            for (int n = 0; n < N; n++) {
                String[] in = br.readLine().trim().split(" ");
                long x = Long.parseLong(in[0]);
                long y = Long.parseLong(in[1]);

                if (xl > x) xl = x;
                if (xr < x) xr = x;
                if (yl > y) yl = y;
                if (yr < y) yr = y;
            }
            long dx = xr - xl;
            long dy = yr - yl;

            long xmax = Math.max(Math.abs(xl), Math.abs(xr));
            long ymax = Math.max(Math.abs(yl), Math.abs(yr));


            long d = Math.max(dx, dy);
            double d2 = Math.sqrt(xmax * xmax + ymax * ymax);
            d2 = Math.max(d2, d);
            System.out.println(d2);
        }


    }
}


