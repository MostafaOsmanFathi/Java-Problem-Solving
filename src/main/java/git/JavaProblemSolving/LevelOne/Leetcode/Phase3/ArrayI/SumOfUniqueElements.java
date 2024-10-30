package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayI;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        int[] frq = new int[101];
        for (int num : nums) {
            frq[num]++;
        }
        int sum = 0;
        for (int num : nums) {
            if (frq[num] == 1) {
                sum += num;
            }
        }
        return sum;
    }
}
