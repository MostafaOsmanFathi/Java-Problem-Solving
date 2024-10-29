package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;

class FindNearestPointThatHasTheSameXOrYCoordinate {
    public  int nearestValidPoint(int x, int y, int[][] points) {
     int ans = Integer.MAX_VALUE;
     int idx=-1;
     for (int i = 0; i < points.length; i++) {
         if (x == points[i][0] || y == points[i][1]) {
             int tmp=Math.abs(y - points[i][1]) + Math.abs(x - points[i][0]);
             if (tmp<ans){
                 ans=tmp;
                 idx=i;
             }
         }
     }
     return idx;
 }
}