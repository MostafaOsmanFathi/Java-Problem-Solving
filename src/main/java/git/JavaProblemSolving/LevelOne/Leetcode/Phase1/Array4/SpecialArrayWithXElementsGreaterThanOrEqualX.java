package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public int specialArray(int[] nums) {
        int[] frq = new int[1001];

        for (int i = 0; i < nums.length; i++) {
            frq[nums[i]]++;
        }
        for (int i = frq.length - 2; i >= 0; i--) {
            frq[i] += frq[i + 1];
        }
        int x = -1;
        for (int i = 1; i < frq.length; i++) {
            if (frq[i] == i) {
                x = i;
            }

        }
        return x;
    }
}