package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

import java.util.Arrays;

class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] arr=heights.clone();
        Arrays.sort(arr);
        int cnt=0;
        for (int i = 0; i <heights.length ; i++) {
            if (arr[i]!=heights[i])
                ++cnt;
        }
        return cnt;
    }
}