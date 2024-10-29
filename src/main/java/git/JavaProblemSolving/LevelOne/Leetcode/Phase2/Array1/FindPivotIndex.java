package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int curSum = 0;
        int idx = 0;
        for (int i : nums) {
            if (curSum == sum - curSum - i) {
                return idx;
            }
            curSum += i;
            idx++;
        }
        return -1;
    }
}