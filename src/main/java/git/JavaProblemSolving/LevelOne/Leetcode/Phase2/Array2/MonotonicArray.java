package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean result = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                result = false;
                break;
            }
        }
        if (result)
            return result;
        result = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}