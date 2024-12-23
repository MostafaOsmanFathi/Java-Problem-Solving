package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathII;

public class ThreeDivisors {
    public boolean isThree(int n) {
        if (Math.floor(Math.sqrt(n)) != Math.ceil(Math.sqrt(n))) return false;
        int tmp = (int) Math.sqrt(n);

        if (tmp == 2) return true;
        else if (tmp % 2 == 0 || tmp == 1) return false;
        for (int i = 3; i * i <= tmp; i += 2) {
            if (tmp % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ThreeDivisors obj = new ThreeDivisors();
        System.out.println(obj.isThree(9));
    }
}
