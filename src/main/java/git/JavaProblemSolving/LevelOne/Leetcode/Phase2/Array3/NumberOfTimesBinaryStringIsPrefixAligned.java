package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

class NumberOfTimesBinaryStringIsPrefixAligned {
    public int numTimesAllBlue(int[] arr) {
        int mx = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-1 > mx) {
                mx = arr[i]-1;
            } else if (mx == i) {
                ++ans;
                if (i <arr.length - 1)
                    mx = arr[i+1]-1;
            }
        }
        return ans;
    }
}