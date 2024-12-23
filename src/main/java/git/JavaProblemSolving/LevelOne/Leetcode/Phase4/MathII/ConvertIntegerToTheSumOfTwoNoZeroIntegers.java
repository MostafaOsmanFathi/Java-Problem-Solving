package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathII;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    static boolean nonZeroInt(int n) {
        while (n != 0) {
            if (n % 10 == 0) return false;
            n /= 10;
        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int tmp = n - i;
            if (nonZeroInt(tmp) && nonZeroInt(i)) {
                return new int[]{i, tmp};
            }
        }
        return new int[]{};
    }
}
