package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

import java.util.Arrays;
import java.util.Set;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        boolean[] frq = new boolean[nums.length + 1];
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (frq[nums[i]]) {
                res[0] = nums[i];
            }
            frq[nums[i]] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!frq[i]) {
                res[1] = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SetMismatch sm = new SetMismatch();
        sm.findErrorNums(new int[]{1, 2, 2, 4});
    }

}
