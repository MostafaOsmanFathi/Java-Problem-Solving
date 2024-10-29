package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

class CheckIfArrayIsSortedAndRotated {
    public static int getMn(int[] nums) {
        int mn = Integer.MAX_VALUE;
        for (int x : nums) {
            mn = Math.min(mn, x);
        }
        return mn;
    }

    public boolean check(int[] nums) {
        int mn = getMn(nums);
        int mxPos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[mxPos] < nums[i]) {
                mxPos = i;
            } else if (nums[mxPos] == nums[i] && nums[(i + 1) % nums.length] == mn) {
                mxPos = i;
            }
        }
        mxPos = (mxPos + 1) % nums.length;
        for (int i = mxPos + 1; i < mxPos + nums.length; i++) {
            int cur = Math.floorMod(i, nums.length);
            int prev = Math.floorMod(i - 1, nums.length);
            if (nums[cur] < nums[prev]) {
                return false;
            }
        }
        return true;
    }
}