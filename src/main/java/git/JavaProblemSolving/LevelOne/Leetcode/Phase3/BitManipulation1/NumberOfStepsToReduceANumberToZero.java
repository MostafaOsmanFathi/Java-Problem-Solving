package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int res = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else
                --num;
            ++res;
        }
        return res;
    }
}
