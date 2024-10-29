package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

import java.util.HashSet;

class FairCandySwap {
    private static int sum(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int s1 = sum(aliceSizes);
        int s2 = sum(bobSizes);
        int refAns = (s1 + s2) / 2;
        boolean swaped = false;
        if (s1 < s2) {
            var __tmpo = aliceSizes;
            aliceSizes = bobSizes;
            bobSizes = __tmpo;
            var __tmpp = s1;
            s1 = s2;
            s2 = __tmpp;
            swaped = true;
        }

        HashSet<Integer> a1 = new HashSet<Integer>();
        for (int i : bobSizes) {
            a1.add(i);
        }

        for (int i : aliceSizes) {
            int tmp = s1 - i;
            if (tmp > refAns) continue;
            tmp = refAns - tmp;
            if (a1.contains(tmp)) {
                return (!swaped) ? new int[]{i, tmp} : new int[]{tmp, i};
            }
        }
        return new int[]{0, 0};
    }
}