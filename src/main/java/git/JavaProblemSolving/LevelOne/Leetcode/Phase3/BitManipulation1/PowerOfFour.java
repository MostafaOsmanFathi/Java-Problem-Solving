package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

public class PowerOfFour {
    public static boolean isPowerOf2(int n) {
        if (n < 1) return false;
        return (n & (n - 1)) == 0;
    }

    public boolean isPowerOfFour(int n) {
        if (!isPowerOf2(n)) return false;
        int binLen = 0;
        while (n != 0) {
            binLen++;
            n /= 2;
        }
        return binLen % 2 == 1;
    }
}
