package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;

class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        int lastDist = -k-10;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i - lastDist <= k) return false;
                lastDist = i;
            }
        }
        return true;
    }
}
