package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return 2;
            }
        }
        return 1;
    }
}
