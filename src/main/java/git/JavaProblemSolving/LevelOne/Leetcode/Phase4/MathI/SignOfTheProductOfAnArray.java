package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathI;

public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        boolean isPositive = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                isPositive = !isPositive;
            } else if (nums[i] == 0) {
                return 0;
            }
        }
        return isPositive ? 1 : -1;
    }
}
