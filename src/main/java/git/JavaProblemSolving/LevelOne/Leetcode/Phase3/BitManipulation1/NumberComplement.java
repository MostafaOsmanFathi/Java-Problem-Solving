package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

import jdk.jfr.Unsigned;

public class NumberComplement {
    public int findComplement(int num) {
        int numOfBits = 0;
        int nTmp = num;
        while (nTmp != 0) {
            numOfBits++;
            nTmp /= 2;
        }

        return num ^ ((1 << numOfBits)-1);
    }

    public static void main(String[] args) {
        NumberComplement obj = new NumberComplement();
        System.out.println(obj.findComplement(5));
    }
}
