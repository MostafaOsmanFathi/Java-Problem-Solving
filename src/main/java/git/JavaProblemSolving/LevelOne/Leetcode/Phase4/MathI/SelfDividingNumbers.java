package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathI;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = left; i <= right; i++) {
            int tmp = i;
            boolean isSelfDividing = true;
            while (tmp != 0) {
                if (tmp % 10 == 0 || i % (tmp % 10) != 0) {
                    isSelfDividing = false;
                    break;
                }
                tmp /= 10;
            }
            if (isSelfDividing) {
                result.add(i);
            }
        }
        return result;
    }
}
