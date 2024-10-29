class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1, cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                ++cnt;
                ans = Math.max(ans, cnt);
            } else {
                cnt = 1;
            }
        }
        return ans;
    }
}