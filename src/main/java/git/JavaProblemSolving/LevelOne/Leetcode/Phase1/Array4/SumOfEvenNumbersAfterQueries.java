package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

class SumOfEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int x : nums) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int idx = queries[i][1];
            if (nums[idx] % 2 == 0) {
                sum -= nums[idx];
            }
            nums[idx] += val;
            if (nums[idx] % 2 == 0) {
                sum += nums[idx];
            }
        result[i] = sum;
        }
        return result;
    }
}
