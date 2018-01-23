/**
 * Created by MalhotR1 on 01/22/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BestDivisor {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(br.readLine().trim());
            if (n == 1) {
                System.out.println(n);
                return;
            }

            Set<Integer> divisors = new HashSet<>();
            int maxSum = computeSumOfDigits(n);
            int bestDiv = n;
            divisors.add(n);

            for (int i = 2; i <= n/2; i++) {
                 if (n % i == 0 && !divisors.contains(i)) {
                     int a = n / i;

                     divisors.add(i);
                     divisors.add(a);

                     int s1 = computeSumOfDigits(a);
                     int s2 = computeSumOfDigits(i);
                     int max = Math.max(s1, s2);
                     if (max > maxSum) {
                         maxSum = max;
                         if (s1 > s2) {
                             bestDiv = a;
                         } else if (s1 < s2) {
                             bestDiv = i;
                         } else {
                             if (i < a) bestDiv = i;
                             else bestDiv = a;
                         }

                     } else if (max == maxSum) {
                         if (s1 > s2 && a < bestDiv) {
                                 bestDiv = a;
                         } else if (s2 > s1 && i < bestDiv) {
                             bestDiv = i;
                         } else {
                             if (i < bestDiv && i < a) {
                                 bestDiv = i;
                             } else if (a < bestDiv && a < i) {
                                 bestDiv = a;
                             }
                         }
                     }
                 }
            }
            System.out.println(bestDiv);
        }
    }

    private static int computeSumOfDigits(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }
        return sum;
    }

}
