import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DynamicArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int N = Integer.parseInt(in[0]);
        int Q = Integer.parseInt(in[1]);
        long la = 0;


        ArrayList[] sl = new ArrayList[N];
        for (int q=0; q<Q; q++) {
            in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            long x = Long.parseLong(in[1]);
            long y = Long.parseLong(in[2]);

            int index =  (int)(x ^ la) % N;
            ArrayList<Long> al = null;
            if (sl[index] == null) {
                al = new ArrayList<>();
                sl[index] = al;
            } else {
                al = sl[index];
            }

            if (n == 1) { al.add(y); }
            else {
                int ti = (int) (y % al.size());
                la = al.get(ti);
                System.out.println(la);
            }
        }

    }
}
