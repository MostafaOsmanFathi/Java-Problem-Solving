package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

import java.util.ArrayList;

public class ReverseVowelsOfAString {
    static String VOWELS = "aeiouAEIOU";

    public String reverseVowels(String s) {
        ArrayList<Integer> vowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (VOWELS.contains(s.charAt(i) + "")) {
                vowels.add(i);
            }
        }
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < vowels.size() / 2; i++) {
            int idx1 = vowels.get(i);
            int idx2 = vowels.get(vowels.size() - i - 1);

            char tmp = result.charAt(idx1);
            result.setCharAt(idx1, result.charAt(idx2));
            result.setCharAt(idx2, tmp);
        }
        return result.toString();
    }
}
