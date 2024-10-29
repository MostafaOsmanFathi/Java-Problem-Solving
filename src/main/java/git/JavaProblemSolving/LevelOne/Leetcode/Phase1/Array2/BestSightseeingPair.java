package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

import java.util.Arrays;

class BestSightseeingPair {

    int mxLen;
    static int mnSize = Integer.MIN_VALUE;
    int[] arr;
    int[][] dp;

    int rec(int i, int j) {
        if (i >= mxLen || j >= mxLen || i == j) {
            return mnSize;
        }
        if (dp[i][j] != -1) return dp[i][j];

        int ans = arr[i] + arr[j] - Math.abs(j - i);

        return dp[i][j] = Math.max(ans, Math.max(rec(i + 1, j), rec(i, j + 1)));
    }

    public int maxScoreSightseeingPair(int[] values) {
        mxLen = values.length;
        arr = values;
        dp = new int[mxLen][mxLen];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        return rec(0, 1);
    }
}
