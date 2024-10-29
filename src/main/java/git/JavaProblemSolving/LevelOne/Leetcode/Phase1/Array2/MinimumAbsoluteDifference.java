package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

import java.util.*;

class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mn = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            mn = Math.min(mn, arr[i] - arr[i - 1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (mn == arr[i] - arr[i - 1]) {
                res.add(new ArrayList<>(Arrays.asList(arr[i - 1], arr[i])));
            }
        }
        return res;
    }
}