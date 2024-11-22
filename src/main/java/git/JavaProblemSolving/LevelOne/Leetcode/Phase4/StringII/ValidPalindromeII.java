package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

public class ValidPalindromeII {
    int balindromCheck(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return i;
        }
        return -1;
    }

    public boolean validPalindrome(String s) {
        int idx = balindromCheck(s);
        if (idx == -1) return true;
        StringBuilder sb = new StringBuilder(s);
        sb.delete(idx, idx + 1);
        if (balindromCheck(sb.toString()) == -1)
            return true;

        sb = new StringBuilder(s);
        sb.delete(s.length() - idx - 1, s.length() - idx);

        return balindromCheck(sb.toString()) == -1;
    }
}
