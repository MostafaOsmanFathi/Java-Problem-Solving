package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] arr) {
        int s = sum(arr);
        if (s % 3 != 0) return false;
        int paretion = s / 3;
        int sum = 0;
        int cnt = 0;
        for (int i : arr) {
            sum += i;
            if (sum == paretion) {
                ++cnt;
                sum = 0;
            }

        }
        if (paretion == 0 && cnt >= 3) return true;
        return ( cnt >= 3) || (max(arr) == 0);
    }

    static int sum(int... s) {
        int sum = 0;
        for (int i : s) {
            sum += i;
        }
        return sum;
    }

    static int max(int... s) {
        int mx = s[0];
        for (int i : s) {
            mx = Math.max(mx, i);
        }
        return mx;
    }

}