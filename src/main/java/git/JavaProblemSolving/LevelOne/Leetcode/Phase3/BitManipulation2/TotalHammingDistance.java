package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

public class TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int[] oneBits = new int[34];
        for (int num : nums) {
            int cnt = 0;
            while (num != 0) {
                oneBits[cnt++] += num & 1;

                ++cnt;
                num >>= 1;
            }

        }
        int ans = 0;
        for (int numOfBits : oneBits) {
            int tmp = nums.length - numOfBits;
            ans += tmp * numOfBits;
        }
        return ans;
    }
}
