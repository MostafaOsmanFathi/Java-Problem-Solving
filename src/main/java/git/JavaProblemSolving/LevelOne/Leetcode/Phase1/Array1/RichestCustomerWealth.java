package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array1;

class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int mx=0;
        for (int[] account : accounts) {
            int sum=0;
            for (int i : account) {
                sum+=i;
            }
            mx=Math.max(sum,mx);
        }
        
        return mx;
    }
}