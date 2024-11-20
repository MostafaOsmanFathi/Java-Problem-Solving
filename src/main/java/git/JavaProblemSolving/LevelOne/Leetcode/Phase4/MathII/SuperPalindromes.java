package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathII;

public class SuperPalindromes {
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    static boolean isSuperPalindrome(long i, long l, long r) {
        long tmp = i * i;
        return tmp >= l && tmp <= r && isPalindrome(tmp + "") && isPalindrome(i + "");
    }

    public int superpalindromesInRange(String left, String right) {
        int res = 0;
        long l = Long.parseLong(left);
        long r = Long.parseLong(right);

        for (int i = 0; i <= 9; i++) {
            if (isSuperPalindrome(i, l, r))
                res++;
        }

        for (int i = 1; i <= 1e4; i++) {
            StringBuilder sb = new StringBuilder(i + "");
            StringBuilder sbRv = new StringBuilder(sb);
            sbRv.reverse();
            StringBuilder sbL = new StringBuilder(i + "");
            sbL.append(sbRv);

            Long tmp = Long.parseLong(sbL.toString());
            if (isSuperPalindrome(tmp, l, r))
                ++res;

            for (int j = 0; j <= 9; j++) {
                tmp = Long.parseLong(sb.toString() + j + sbRv.toString());
                if (isSuperPalindrome(tmp, l, r))
                    ++res;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        SuperPalindromes obj = new SuperPalindromes();
        System.out.println(obj.superpalindromesInRange("40000000000000000", "50000000000000000"));
    }
}
