package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathI;

public class SumOfDigitsInBaseK {
    public int sumBase(int n, int k) {
        String s = Integer.toString(n, k);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
}
