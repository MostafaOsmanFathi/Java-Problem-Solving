package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;

class LongerContiguousSegmentsOfOnesThanZeros {
    public boolean checkZeroOnes(String s) {
        int tmp = 1;
        int[] arr = new int[2];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                tmp++;
            } else {
                int x = s.charAt(i - 1) - '0';
                arr[x] = Math.max(arr[x], tmp);
                tmp = 1;
            }
        }
        int x = s.charAt(s.length() - 1) - '0';
        arr[x] = Math.max(arr[x], tmp);
        return arr[0] < arr[1];
    }
}