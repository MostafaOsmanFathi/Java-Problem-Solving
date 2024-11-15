package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

import java.util.HashMap;

public class IntegerReplacement {
    HashMap<Long, Long> dp = new HashMap<>();

    long recc(long n) {
        if (n == 1) return 0;
        if (dp.containsKey(n)) return dp.get(n);
        long ans = 0;
        if (n % 2 == 0)
            ans = 1 + recc(n / 2);
        else
            ans = Math.min(2 + recc((n - 1) / 2), 2 + recc((n + 1) / 2));
        dp.put(n, ans);
        return ans;
    }

    public long integerReplacement(int n) {
        return recc(n);
    }

    public static void main(String[] args) {
        IntegerReplacement obj = new IntegerReplacement();
        System.out.println(obj.integerReplacement(7));
        obj.integerReplacement(7);
    }

}
