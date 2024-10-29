package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array1;

class CellsWithOddValuesInAMatrix {
    public int oddCells(int m, int n, int[][] indices) {
       int[] row = new int[m], col = new int[n];
       int res = 0;
       for (int[] v : indices) {
           ++row[v[0]];
           ++col[v[1]];
       }
       for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
               if (((row[i]+col[j])&1)!=0){
                   res += 1;
               }
           }
       }
       return res;
   }
}