package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

import java.util.ArrayList;
import java.util.List;

class LuckyNumbersInAMatrix {
    int CheckLuckyRow(int[][] matrix, int r) {
        int mnRes = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            mnRes = Math.min(mnRes, matrix[r][i]);
        }
        return mnRes;
    }

    int CheckLuckyCol(int[][] matrix, int c) {
        int mxRes = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            mxRes = Math.max(mxRes, matrix[i][c]);
        }
        return mxRes;
    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int row = CheckLuckyRow(matrix, i);
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == row && matrix[i][j] == CheckLuckyCol(matrix, j)) {
                    ls.add(matrix[i][j]);
                }
            }
        }
        return ls;
    }
}