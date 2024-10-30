package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

public class ComplementOfBase10Integer {
    public int bitwiseComplement(int num) {
        int numOfBits = 0;
        int nTmp = num;
        if (num == 0)
            return 1;
        while (nTmp != 0) {
            numOfBits++;
            nTmp /= 2;
        }

        return num ^ ((1 << numOfBits) - 1);
    }

    public static void main(String[] args) {
        ComplementOfBase10Integer solution = new ComplementOfBase10Integer();
        System.out.println(solution.bitwiseComplement(0));
    }
}
