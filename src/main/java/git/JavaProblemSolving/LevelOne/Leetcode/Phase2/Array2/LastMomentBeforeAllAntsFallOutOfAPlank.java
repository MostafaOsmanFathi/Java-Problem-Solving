package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

class LastMomentBeforeAllAntsFallOutOfAPlank {
    public int getLastMoment(int n, int[] left, int[] right) {
        int ans = 0;
        for (int i = 0; i < left.length; i++) {
            ans = Math.max(left[i], ans);
        }
        for (int i = 0; i < right.length; i++) {
            ans = Math.max(n - right[i] , ans);
        }
        return ans;
    }
}