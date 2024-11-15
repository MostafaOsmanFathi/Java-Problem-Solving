package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

import java.util.Stack;

public class MaximumScoreFromRemovingSubstrings {
    public int maximumGain(String str, int x, int y) {
        int ans = 0;
        StringBuilder s = new StringBuilder(str);
        boolean isThereChange = false;
        do {
            isThereChange = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (x > y) {
                    if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') {
                        ans += x;
                        s.setCharAt(i, '-');
                        s.setCharAt(i + 1, '-');
                        isThereChange = true;
                    }
                } else {
                    if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a') {
                        ans += y;
                        s.setCharAt(i, '-');
                        s.setCharAt(i + 1, '-');
                        isThereChange = true;
                    }
                }
            }
            StringBuilder strTmp = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '-') {
                    strTmp.append(s.charAt(i));
                }
            }
            s = strTmp;

        } while (isThereChange);


        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') {
                ans += x;
                s.setCharAt(i, '-');
                s.setCharAt(i + 1, '-');
            }

            if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a') {
                ans += y;
                s.setCharAt(i, '-');
                s.setCharAt(i + 1, '-');
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        MaximumScoreFromRemovingSubstrings solution = new MaximumScoreFromRemovingSubstrings();
        System.out.println(solution.maximumGain("cdbcbbaaabab", 4, 5));
    }
}
