package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayI;

public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] nums) {
        int[] frq = new int[10000];
        for (int num : nums) {
            frq[num]++;
        }
        int n = nums.length / 2;
        for (int i = 0; i < 10000; i++) {
            if (frq[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
