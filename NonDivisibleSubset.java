import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by MalhotR1 on 09/26/2017.
 */
public class NonDivisibleSubset {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int N = Integer.parseInt(in[0]);
        int[] arr = new int[N];
        int K = Integer.parseInt(in[1]);
        in = br.readLine().trim().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        int size = 1;
        Arrays.sort(arr);
        int[][] narr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                if (i == j)continue;
                else if ((narr[i][0] + narr[i][j]) % K == 0) narr[i][j] = 0;
                else narr[i][j] = 1;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(narr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
