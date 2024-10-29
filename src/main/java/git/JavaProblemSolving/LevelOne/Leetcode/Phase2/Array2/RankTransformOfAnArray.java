package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

import java.util.Arrays;
import java.util.HashMap;

class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int[] arr2 = arr.clone();
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int con = 1;
        map.put(arr[0], con);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) continue;
            map.put(arr[i], ++con);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr2[i]);
        }
        return arr;
    }
}