package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;

class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int sum=0;
        int ans=1;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if (sum<0){
                ans=Math.max(ans,(sum*-1)+1);
            }
        }
        return ans;
    }
}