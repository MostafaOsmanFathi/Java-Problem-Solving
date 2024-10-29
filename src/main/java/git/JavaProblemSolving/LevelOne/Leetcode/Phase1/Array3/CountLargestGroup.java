package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;

class CountLargestGroup {
    public int countLargestGroup(int n) {
        short[] frq = new short[50];
        short mx=0,cnt=0;
        for (int i = 1; i <=n ; i++) {
            int tmp=i;
            int sum=0;
            while (tmp!=0){
                sum+=tmp%10;
                tmp/=10;
            }
            ++frq[sum];
            if (frq[sum]>mx){
                mx=frq[sum];
                cnt=1;
            }else if (frq[sum]==mx){
                cnt++;
            }
        }
        return cnt;
    }
}