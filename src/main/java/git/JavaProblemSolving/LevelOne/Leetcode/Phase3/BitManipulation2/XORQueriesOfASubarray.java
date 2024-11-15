package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

import java.util.Arrays;

public class XORQueriesOfASubarray {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix = new int[arr.length + 1];
        for (int i = 1; i < arr.length + 1; i++) {
            prefix[i] = prefix[i - 1] ^ arr[i - 1];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = prefix[queries[i][1] + 1] ^ prefix[queries[i][0]];
        }
        return result;
    }

    public static void main(String[] args) {
        XORQueriesOfASubarray xorQueriesOfASubarray = new XORQueriesOfASubarray();
        System.out.println(Arrays.toString(xorQueriesOfASubarray.xorQueries(new int[]{1, 3, 4, 8}, new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}})));
    }
}
