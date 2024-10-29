package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

import java.util.*;

class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int cnt = 1, l = 0, r = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                ++cnt;
                ++r;
            } else {
                if (cnt >= 3) {
                    result.add(List.of(l, r));
                }
                l = ++r;
                cnt = 1;
            }
        }
        if (cnt >= 3)
            result.add(List.of(l, r));
        return result;
    }

}