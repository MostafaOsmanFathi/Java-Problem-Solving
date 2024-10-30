package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

public class BinaryGap {
    public int binaryGap(int n) {
        int lastOne = 0;
        int res = 0;
        boolean flag = false;

        while (n != 0) {
            if (n % 2 == 1) {
                res = Math.max(res, lastOne);
                lastOne = 0;
                flag = true;
            } else {
                if (flag)
                    ++lastOne;
            }
            n /= 2;
        }
        return res;
    }
}
