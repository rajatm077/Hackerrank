import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by MalhotR1 on 09/21/2017.
 */
public class IceCream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < T; i++) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            int cost = Integer.parseInt(br.readLine().trim());
            int no = Integer.parseInt(br.readLine().trim());
            String[] line = br.readLine().trim().split(" ");
            int[] arr = new int[line.length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(line[j]);
                hm.put(arr[j], j);
            }
            int k = -1;
            Arrays.sort(arr);
            int index = 0;
            for (; index < arr.length; index++) {
//                if ((2*arr[index]) == cost) {
//                    k = index;
//                    break;
//                }
                k = Arrays.binarySearch(arr, cost - arr[index]);
                if (k > 0) break;
            }
            index = hm.get(arr[index]) + 1;
            k = hm.get(arr[k]) + 1;
            if (k == index) k--;
            int[] out = {index, k};
            Arrays.sort(out);
            System.out.println(out[0] + " " + out[1]);

        }
    }
}
