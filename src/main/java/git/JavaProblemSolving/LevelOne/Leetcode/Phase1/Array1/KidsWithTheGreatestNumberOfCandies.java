package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array1;

import java.util.*;

class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            mx = Math.max(mx, candies[i]);
        }
        List<Boolean> ls = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            ls.add(candies[i]+extraCandies >= mx);
        }
        return ls;
    }
}