package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        x ^= y;
        int ans = 0;
        while (x != 0) {
            if (x % 2 == 1)
                ++ans;
            x /= 2;
        }
        return ans;
    }
}
