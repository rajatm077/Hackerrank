import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by MalhotR1 on 09/25/2017.
 */
public class RunningMedian {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            if (i == 0) {
                arr[i] = n;
                System.out.println(arr[i]);
                continue;
            }
            int loc = Arrays.binarySearch(arr, n);
            if (loc < 0) loc = -loc;

        }
    }
}
