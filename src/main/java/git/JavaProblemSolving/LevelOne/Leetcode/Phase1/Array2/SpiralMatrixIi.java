package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

class SpiralMatrixIi {
    int[][] arr;

   int[] dx = {0, 1, 0, -1};
   int[] dy = {1, 0, -1, 0};
   int curDir = 0;
   int n;

   boolean isValid(int x, int y) {
       return x < n && y < n && x >= 0 && y >= 0;
   }

   boolean checkEdge(int x, int y) {
       return y == 0 || x == n - 1 || y == n - 1;
   }

   boolean dfs(int x, int y, int cnt) {
       if (!isValid(x, y) || arr[x][y] != 0) {
           return false;
       }
       arr[x][y] = cnt;

       boolean tmp = dfs(x + dx[curDir], y + dy[curDir], cnt + 1);
       if (tmp) {
           return true;
       } else {
           curDir = (curDir + 1) % 4;
           return dfs(x + dx[curDir], y + dy[curDir], cnt + 1);
       }
   }

   public int[][] generateMatrix(int n) {
       arr = new int[n][n];
       this.n = n;
       dfs(0, 0, 1);
       return arr;
   }
}