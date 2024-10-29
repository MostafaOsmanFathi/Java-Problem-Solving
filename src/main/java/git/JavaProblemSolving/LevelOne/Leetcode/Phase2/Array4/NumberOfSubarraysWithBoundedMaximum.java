package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array4;

class NumberOfSubarraysWithBoundedMaximum {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0;
        int mx = 0;


        int cntAll = 0;
        int lastXRes = 0;
        for (int num : nums) {
            if (num > mx) mx = num;


            if (num < left) {
                ++cntAll;
                ans += lastXRes;
            } else if (num <= right) {
                ans += ++cntAll;
                lastXRes = cntAll;
            } else {
                mx = 0;
                cntAll = 0;
                lastXRes = 0;
            }
        }
        return ans;
    }

}