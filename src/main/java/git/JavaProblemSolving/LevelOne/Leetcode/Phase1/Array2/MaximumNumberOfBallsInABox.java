package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

class MaximumNumberOfBallsInABox {
    public int countBalls(int lowLimit, int highLimit) {
        int[] frq=new int[50];
        for (int i = lowLimit; i <=highLimit ; i++) {
            int tmp=i;
            int sum=0;
            while (tmp!=0){
                sum+=tmp%10;
                tmp/=10;
            }
            ++frq[sum];
        }
        int ans=0;
        for (int tmp:frq){
            ans=Math.max(ans,tmp);
        }
        return ans;
    }
}