package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

public class BinaryNumberWithAlternatingBits {


    public static boolean hasAlternatingBits(int n) {
        if (n < 2) return true;
        boolean isTrue = (n % 2 == 1);
        n /= 2;
        while (n != 0) {
            boolean res = (n % 2 == 1);
            if (isTrue == res) return false;
            isTrue = res;
            n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(11));
    }
}
