/**
 * Created by MalhotR1 on 09/30/2017.
 */
public class DuplicateInArray {
    static char firstNotRepeatingCharacter(String s) {
        int[] alphabets = new int[26];
        char[] input = s.toCharArray();
        for (int i=0; i<input.length; i++) {
            if (alphabets[input[i] -97] == 0) alphabets[input[i] -97] = i + 1;
            else alphabets[input[i] -97] = -1;
        }

        int min = Integer.MAX_VALUE;
        char sol = '_';
        for (int i=0; i<26; i++) {
            if (alphabets[i] < 0) continue;
            else if (alphabets[i] < min) {
                min = alphabets[i];
                sol = (char) (97 + i);
            }
        }
        return sol;
    }


    public static void main(String[] args) {
        String s = "abacabad";
        System.out.println(firstNotRepeatingCharacter(s));
    }

}
