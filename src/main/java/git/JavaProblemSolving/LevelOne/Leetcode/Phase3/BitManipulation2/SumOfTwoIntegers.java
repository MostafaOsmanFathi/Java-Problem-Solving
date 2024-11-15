package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

public class SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        int carry = 0;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int tmp1 = (1 << i) & a;
            int tmp2 = (1 << i) & b;
            if (carry == 1) {
                if (tmp1 != 0 && tmp2 != 0) {
                    res |= tmp1;
                    carry = 1;
                } else if (tmp1 != 0 || tmp2 != 0) {
                    carry = 1;
                } else {
                    res |= (1<<i);
                    carry = 0;
                }
            } else {
                if (tmp1 != 0 && tmp2 != 0) {
                    carry = 1;
                } else if (tmp1 != 0 || tmp2 != 0) {
                    res |= (tmp1 | tmp2);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 3));
        System.out.println(getSum(1, 10));
    }
}
