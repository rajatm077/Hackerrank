/**
 * Created by MalhotR1 on 02/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcidNaming {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                char[] chem = br.readLine().trim().toCharArray();
                int len = chem.length;
                if (len < 2) System.out.println("not an acid");
                if (chem[len-2] == 'i' && chem[len-1] == 'c') {
                    if (chem[0] == 'h' && chem[1] == 'y' && chem[2] == 'd' && chem[3] == 'r' && chem[4] == 'o') {
                        System.out.println("non-metal acid");
                    } else {
                        System.out.println("polyatomic acid");
                    }

                } else {
                    System.out.println("not an acid");
                }
            }
        }
    }

}
