package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

public class ConcatenationOfConsecutiveBinaryNumbers {
    final static int mod = 1000000007;

    public int concatenatedBinary(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(Integer.toBinaryString(i));
        }
        int Twos = 1;
        int ans = 0;
        for (int i = sb.length() - 1; i >= 0; i--, Twos = ((Twos % mod) * 2) % mod) {
            if (sb.charAt(i) == '1') {
                ans = ((ans % mod) + Twos) % mod;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ConcatenationOfConsecutiveBinaryNumbers solution = new ConcatenationOfConsecutiveBinaryNumbers();
        System.out.println(solution.concatenatedBinary(12));
    }
}
