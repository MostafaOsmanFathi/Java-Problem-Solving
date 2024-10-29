package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r*c != mat.length * mat[0].length){
//           for (int i = 0; i < mat.length; i++) {
//               for (int j = 0; j < mat[0].length; j++) {
//                   newMat[i][j] = mat[i][j];
//               }
//           }
            return mat;
        }
        int[][] newMat = new int[r][c];
        int cnt = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                newMat[cnt / c][cnt % c] = mat[i][j];
                ++cnt;
            }
        }
        return newMat;
    }
}