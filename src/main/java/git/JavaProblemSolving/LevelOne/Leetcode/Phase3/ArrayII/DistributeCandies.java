package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

import java.util.HashSet;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int candy : candyType) {
            if (!set.contains(candy)) {
                ++ans;
                set.add(candy);
            }
            if (ans == candyType.length / 2)
                break;
        }
        return ans;
    }
}
