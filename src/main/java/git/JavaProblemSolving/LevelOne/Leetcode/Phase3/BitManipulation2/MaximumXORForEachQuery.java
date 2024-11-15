package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

public class MaximumXORForEachQuery {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length - 1;
        int xorAll = 0;
        for (int num : nums) {
            xorAll ^= num;
        }
        int[] result = new int[n + 1];
        int con = 0;

        while (n >= 0) {
            int tmp = xorAll;
            for (int i = 0; i < maximumBit; i++) {
                if ((tmp & (1 << i)) == 0)
                    tmp |= 1 << i;
            }
            result[con++] = tmp ^ xorAll;
            xorAll ^= nums[n];
            --n;
        }

        return result;
    }
}
