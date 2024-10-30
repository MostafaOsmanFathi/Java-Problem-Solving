package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayI;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Integer[] order = new Integer[nums.length];
        for (int i = 0; i < order.length; i++) {
            order[i] = i;
        }
        Arrays.sort(order, (Integer a, Integer b) -> Integer.compare(nums[a], nums[b]));
        int[] result = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            if (nums[order[i]] == nums[order[i - 1]]) {
                result[order[i]] = result[order[i - 1]];
            } else
                result[order[i]] = i;
        }
        return result;
    }
}
