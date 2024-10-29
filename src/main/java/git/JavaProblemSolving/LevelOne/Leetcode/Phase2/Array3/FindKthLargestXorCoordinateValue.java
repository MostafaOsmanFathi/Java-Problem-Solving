package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

import java.util.Arrays;

class FindKthLargestXorCoordinateValue {
    public int kthLargestValue(int[][] matrix, int k) {
        int[] resArr = new int[matrix.length * matrix[0].length];
        int con = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] ^= matrix[i][j - 1];
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            resArr[con++] = matrix[0][i];
            for (int j = 1; j < matrix.length; j++) {
                matrix[j][i] ^= matrix[j - 1][i];
                resArr[con++] = matrix[j][i];
            }
        }

        Arrays.sort(resArr);
        return resArr[resArr.length - k];
    }
}