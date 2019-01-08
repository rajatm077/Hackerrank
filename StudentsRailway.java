/**
 * Created by MalhotR1 on 04/16/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentsRailway {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int N = Integer.parseInt(in[0]);
            int a = Integer.parseInt(in[1]);
            int b = Integer.parseInt(in[2]);
            char[] seats = br.readLine().toCharArray();
            int avail = 0;
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == '.') avail++;
            }

            if ((avail > a+b && !(a != 0 || b != 0)) || (avail == a+b && a == b)) System.out.println(a+b);
            else if (avail == 0) System.out.println(0);
            else {
                int total = 0;
                int prior = (a >= b)? a : b;
                int last = a+b - prior;
                for (int i = 0; i < seats.length && avail > 0 && prior > 0; i++) {
                    if (seats[i] == '.') {
                        if ((i == 0) || (i > 0 && (seats[i-1] == '*' || seats[i-1] != '$')))  {
                            avail--;
                            prior--;
                            total++;
                            seats[i] = '$';
                        }
                    }
                }

                total += (avail >= last) ? last : avail;
                System.out.println(total);

            }
        }
    }

}
