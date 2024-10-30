package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayI;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int[] frq = new int[101];
        int ans = 0;
        for (int num : nums) {
            frq[num]++;
            ans += frq[num] - 1;
        }
        return ans;
    }
}
