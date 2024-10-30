package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

import java.util.HashSet;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public static boolean checkPrime(int n) {
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        boolean[] isPrime = new boolean[33];
        isPrime[2] = true;
        for (int i = 3; i < 33; i += 2) {
            if (checkPrime(i))
                isPrime[i] = true;
        }
        int ans = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime[Integer.bitCount(i)])
                ans++;
        }
        return ans;
    }
}
