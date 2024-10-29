package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double mxAve = 0.0;
        double curAve = 0.0;
        for (int i = 0; i < k; i++) {
            curAve += nums[i];
        }
        mxAve = curAve;
        for (int i = k; i < nums.length; i++) {
            curAve -= nums[i - k];
            curAve += nums[i];
            mxAve = Math.max(mxAve, curAve);
        }
        return mxAve / k;
    }
}