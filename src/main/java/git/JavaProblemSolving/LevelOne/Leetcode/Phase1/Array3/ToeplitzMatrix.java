package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;

class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            if (!Check(0, i, matrix)) {
                return false;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (!Check(i, 0, matrix)) {
                return false;
            }
        }
        return true;
    }

    boolean Check(int x, int y, int[][] matrix) {

        int prev = matrix[x][y];
        while (x < matrix.length && y < matrix[0].length) {
            ++x;
            ++y;
            if ((x < matrix.length && y < matrix[0].length) && prev != matrix[x][y]) {
                return false;
            }
        }
        return true;
    }

}