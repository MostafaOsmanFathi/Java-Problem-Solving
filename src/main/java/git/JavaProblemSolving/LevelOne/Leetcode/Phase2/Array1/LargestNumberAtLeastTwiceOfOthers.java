package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

import java.util.Arrays;

class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int mx = nums[0], poss = 0;
        for (int i = 0; i <nums.length; i++) {
            if (mx < nums[i]) {
                mx = nums[i];
                poss = i;
            }
        }
        Arrays.sort(nums);
        if (nums[nums.length - 2] * 2 > nums[nums.length - 1])
            return -1;
        else
            return poss;
    }
}