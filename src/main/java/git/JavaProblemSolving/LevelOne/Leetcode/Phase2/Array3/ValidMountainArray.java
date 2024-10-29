package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int mxPoss = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[mxPoss] < arr[i]) {
                mxPoss = i;
            }
        }
        if (mxPoss == arr.length - 1 || mxPoss == 0) {
            return false;
        }
        for (int i = 1; i < mxPoss; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        for (int i = mxPoss + 1; i < arr.length; i++) {
            if (arr[i - 1] <= arr[i]) {
                return false;
            }
        }

        return true;
    }
}