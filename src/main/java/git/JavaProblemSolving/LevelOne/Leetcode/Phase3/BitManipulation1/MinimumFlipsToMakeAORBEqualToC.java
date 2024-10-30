package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

import java.util.Collections;

public class MinimumFlipsToMakeAORBEqualToC {
    public int minFlips(int a, int b, int c) {
        int res = 0;
        while (c != 0) {
            if (c % 2 == 1) {
                if (a % 2 != 1 && b % 2 != 1) {
                    ++res;
                }

            } else {
                if (a % 2 == 1) {
                    ++res;
                }
                if (b % 2 == 1) {
                    ++res;
                }
            }

            a /= 2;
            b /= 2;
            c /= 2;
        }
        while (a != 0) {
            if (a % 2 == 1)
                res++;
            a /= 2;
        }
        while (b != 0) {
            if (b % 2 == 1)
                res++;
            b /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        MinimumFlipsToMakeAORBEqualToC minimumFlipsToMakeAORBEqualToC = new MinimumFlipsToMakeAORBEqualToC();
        System.out.println(minimumFlipsToMakeAORBEqualToC.minFlips(10, 9, 1));
    }
}
