package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int[] res = new int[2];
        int con = 0;
        for (int num : set) {
            res[con++] = num;
        }
        return res;
    }
}
