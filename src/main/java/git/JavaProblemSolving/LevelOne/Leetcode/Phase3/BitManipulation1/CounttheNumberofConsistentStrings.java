package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

import java.util.HashSet;

public class CounttheNumberofConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] set = new boolean[200];

        for (int i = 0; i < allowed.length(); i++) {
            set[allowed.charAt(i)] = true;
        }
        int res = words.length;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!set[word.charAt(i)]) {
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}
