package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

import java.util.HashSet;

public class CheckIfAStringContainsAllBinaryCodesOfSizeK {
    public boolean hasAllCodes(String s, int k) {
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            st.add(Integer.valueOf(s.substring(i, i + k), 2));
        }
        int lim = (1 << (k)) - 1;
        for (int i = 0; i <= lim; i++) {
            if (!st.contains(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfAStringContainsAllBinaryCodesOfSizeK checker = new CheckIfAStringContainsAllBinaryCodesOfSizeK();
        checker.hasAllCodes("00110", 2);
    }
}
