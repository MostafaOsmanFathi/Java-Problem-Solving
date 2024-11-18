package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathI;

import java.util.Arrays;

public class DIStringMatch {

    public int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int l = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                l++;
            }
        }
        r = l;
        result[0] = l;
        --l;
        ++r;
        for (int i = 1; i <= s.length(); i++) {
            if (s.charAt(i - 1) == 'I') {
                result[i] = r++;
            } else {
                result[i] = l--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DIStringMatch diStringMatch = new DIStringMatch();
        System.out.println(Arrays.toString(diStringMatch.diStringMatch("IDID")));
    }
}
