package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

import java.util.ArrayList;

class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
       int[] frq = new int[500000];
       int mxFrq = 0;
       ArrayList<Integer> arr = new ArrayList<>();

       for (int n : nums) {
           frq[n]++;
           if (frq[n] > mxFrq) {
               arr.clear();
               arr.add(n);
               mxFrq = frq[n];
           } else if (frq[n] == mxFrq) {
               arr.add(n);
           }
       }
       int[][] frqStartEnd = new int[500000][2];
       frqStartEnd[nums[0]][0] = 0;
       for (int i = 1; i < nums.length; i++) {
           if (frqStartEnd[nums[i]][0] == 0 && nums[0] != nums[i]) {
               frqStartEnd[nums[i]][0] = i;
           }
           frqStartEnd[nums[i]][1] = i;
       }
       int ans = Integer.MAX_VALUE;
       for (int x : arr) {
           ans = Math.min(ans, frqStartEnd[x][1] - frqStartEnd[x][0] + 1);
       }
       return ans;
   }
}