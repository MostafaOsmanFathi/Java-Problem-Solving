package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathI;

public class FindGreatestCommonDivisorOfArray {

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int findGCD(int[] nums) {
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for (int num : nums) {
            mx = Math.max(num, mx);
            mn = Math.min(num, mn);
        }
        return gcd(mx, mn);
    }
}
