package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;

class MinimumDistanceToTheTargetElement {
    public int getMinDistance(int[] nums, int target, int start) {
        int pos = Short.MIN_VALUE;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i] == target) {
                if (Math.abs(pos - start) > Math.abs(i - start))
                    pos = i;
            }
        }
        return Math.abs(pos-start);
    }
}