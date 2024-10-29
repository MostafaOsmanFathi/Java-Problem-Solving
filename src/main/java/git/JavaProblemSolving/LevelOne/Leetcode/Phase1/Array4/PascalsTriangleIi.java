package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

import java.util.*;

class PascalsTriangleIi {
    public List<Integer> getRow(int rowIndex) {
       rowIndex++;
       int[][] arr = new int[rowIndex][0];
       for (int i = 0; i < rowIndex; i++) {
           arr[i] = new int[i + 1];
           int[] tmpArr = arr[i];
           for (int j = 0; j < tmpArr.length; j++) {
               if (j == 0 || j == tmpArr.length - 1) {
                   tmpArr[j] = 1;
                   continue;
               }
               tmpArr[j] = arr[i - 1][j] + arr[i - 1][j - 1];
           }
       }
       ArrayList<Integer>arrList = new ArrayList<>(rowIndex);
       for (int i = 0; i < rowIndex; i++) {
           arrList.add(arr[arr.length - 1][i]);
       }
       return arrList;
   }
}