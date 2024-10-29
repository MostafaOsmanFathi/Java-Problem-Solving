package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

import java.util.Arrays;

class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] -= 1;
        }
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2];
    }
}