/**
 * Created by MalhotR1 on 04/02/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ActivitySelectionProblem {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                String[] ins = br.readLine().trim().split(" ");
                String[] inf = br.readLine().trim().split(" ");
                ArrayList<Activity> activities = new ArrayList<>();
                for (int i = 0; i < ins.length; i++) {
                    int start = Integer.parseInt(ins[i]);
                    int finish = Integer.parseInt(inf[i]);
                    activities.add(new Activity(i+1, start, finish));
                }
                Collections.sort(activities, (a1, a2) -> a1.finish - a2.finish);
                Activity activity = activities.get(0);
                System.out.print(activity.order + " ");
                for (int i = 1; i < activities.size(); i++) {
                    if (activities.get(i).start >= activity.finish) {
                        activity = activities.get(i);
                        System.out.print(activity.order + " ");
                    }
                }
                System.out.println();
            }
        }
    }

}
class Activity {
    int order;
    int start;
    int finish;
    public Activity() {
        order = -1;
        start = -1;
        finish = -1;
    }

    public Activity(int o ,int s, int f) {
        this.order = o;
        this.start = s;
        this.finish = f;
    }
}
