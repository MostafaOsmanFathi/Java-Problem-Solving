package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array4;

import java.util.Arrays;

class MinimumIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                continue;
            }
            res += Math.abs(nums[i] - nums[i - 1]) + 1;
            nums[i] = nums[i - 1] + 1;
        }
        return res;
    }


}