/**
 * Created by malhotr1 on 04/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) throws IOException {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(9,18));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        Collections.sort(intervals, (i1, i2) -> i1.start - i2.start);
        ArrayList<Interval> sol = new ArrayList<>();
        sol.add(intervals.get(0));
//        int index = 0;
        Interval interval = sol.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start > interval.end) {
                sol.add(intervals.get(i));
                interval = intervals.get(i);
            } else {
                interval.end = intervals.get(i).end;
            }
        }
        for (int i = 0; i < sol.size(); i++) {
            System.out.println(sol.get(i).start + " " +sol.get(i).end);
        }

    }

}
class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}