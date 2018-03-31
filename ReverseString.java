/**
 * Created by MalhotR1 on 03/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String in = br.readLine().trim();
                reverseString(in, 0, 0);
                System.out.println();
            }

        }
    }

    private static void reverseString(String in, int i, int c) {
        String temp = "";
        while (i < in.length() && in.charAt(i) != '.') {
            temp += in.charAt(i);
            i++;
        }

        if (i < in.length())
            reverseString(in, i+1, c+1);
        if (c == 0) System.out.print(temp);
        else System.out.print(temp + ".");
    }

}
