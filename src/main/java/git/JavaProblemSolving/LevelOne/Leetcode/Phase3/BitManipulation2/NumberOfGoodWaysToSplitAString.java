package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

public class NumberOfGoodWaysToSplitAString {
    public int numSplits(String s) {
        int[] prefix = new int[s.length()];
        int[] suffix = new int[s.length()];
        int n = s.length();
        prefix[0] = (1 << (s.charAt(0) - 'a'));
        suffix[suffix.length - 1] = (1 << (s.charAt(s.length() - 1) - 'a'));

        for (int i = 1; i < s.length(); i++) {
            prefix[i] = prefix[i - 1] | 1 << (s.charAt(i) - 'a');
            suffix[n - i - 1] = suffix[n - i] | (1 << (s.charAt(n - i - 1) - 'a'));
        }
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            if (Integer.bitCount(prefix[i]) == Integer.bitCount(suffix[i + 1])) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NumberOfGoodWaysToSplitAString sub = new NumberOfGoodWaysToSplitAString();
        System.out.println(sub.numSplits("aacaba"));
    }
}
