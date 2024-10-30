package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayI;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] frq = new int[200];
        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i)]++;
        }
        boolean tmp = false;
        int res = 0;
        for (int i = 0; i < frq.length; i++) {
            if (!tmp && frq[i] % 2 == 1) {
                tmp = true;
                ++res;
            }
            res += (frq[i] / 2) * 2;
        }
        return res;
    }
}
