import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * Created by MalhotR1 on 10/03/2017.
 */
public class Dishes {
    public static void main(String[] args) {
        String[][] dishes = {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};
        TreeMap<String, ArrayList<String>> sol = new TreeMap<>();
        for (int i = 0; i < dishes.length; i++) {
            ArrayList<String> dish = null;
            for (int j = 1; j < dishes[i].length; j++) {
                if (sol.containsKey(dishes[i][j])) dish = sol.get(dishes[i][j]);
                else {
                    dish = new ArrayList<>();
                    sol.put(dishes[i][j], dish);
                }
                dish.add(dishes[i][0]);
            }
        }
        ArrayList<String[]> total = new ArrayList<>();
        for (String str: sol.keySet()) {
            ArrayList<String> dish = sol.get(str);
            int cnt = dish.size();
            if (cnt < 2) continue;
            else {
                String[] add = new String[cnt + 1];
                add[0] = str;
                for (int i = 0; i < cnt; i++) {
                    add[i+1] = dish.get(i);
                }
                total.add(add);

            }
        }
        total.sort((o1, o2) -> o1[0].compareTo(o2[0]));
        int cnt = total.size();
        String[][] solution = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            solution[i] = total.get(i);
        }

        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }
}
