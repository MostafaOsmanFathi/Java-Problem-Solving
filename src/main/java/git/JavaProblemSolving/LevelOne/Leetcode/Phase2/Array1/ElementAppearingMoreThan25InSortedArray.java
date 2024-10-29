package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

class ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        int tmp = (arr.length / 4) + 1;
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                ++cnt;
            } else {
                if (cnt >= tmp) {
                    return arr[i-1];
                }
                cnt = 1;
            }
        }
        return arr[arr.length-1];
    }
}