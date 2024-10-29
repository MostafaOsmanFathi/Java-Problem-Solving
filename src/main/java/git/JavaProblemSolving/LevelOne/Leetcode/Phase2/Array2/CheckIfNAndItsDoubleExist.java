package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

import java.util.Arrays;

class CheckIfNAndItsDoubleExist {
    boolean CheckExist(int[] arr, int target) {
        int l = -1, r = arr.length - 1;
        while (r - l > 1) {
            int mid = (r + l) / 2;
            if (arr[mid] >= target)
                r = mid;
            else
                l = mid;
        }
        return arr[r] == target;
    }

    public boolean checkIfExist(int[] arr) {
        int zeroCount = 0;
        for (int i : arr) {
            if (i == 0) ++zeroCount;
        }
        if (zeroCount > 1) return true;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0 && CheckExist(arr, arr[i] * 2)) {
                return true;
            }
        }
        return false;
    }

}