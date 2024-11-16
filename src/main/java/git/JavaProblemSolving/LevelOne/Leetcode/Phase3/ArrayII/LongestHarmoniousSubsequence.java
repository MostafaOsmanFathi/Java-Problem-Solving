package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

import java.util.SortedMap;
import java.util.TreeMap;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        SortedMap<Integer, Integer> mp = new TreeMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        int prev = -100, prevValue = 0;
        for (int num : mp.keySet()) {
            int value = mp.get(num);

            if (num - 1 == prev) {
                res = Math.max(res, value + prevValue);
            }
            prev = num;
            prevValue = value;
        }
        return res;
    }
}
