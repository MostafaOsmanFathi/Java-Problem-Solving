package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        if(n%2==1)
            n-=1;

        for (int i = 0; i <n; i++) {
            if (i % 2 == 0) {
                result[i]=(i+1);
            }else{
                result[i]=-i;                
            }
        }

        return result;
    }
}