package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array1;

class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        n*=2;
        int []res=new int[n];

        for (int i = 0; i <n ; i+=2) {
            res[i]=nums[i/2];
        }
        for (int i = 1; i <n ; i+=2) {
            res[i]=nums[(i/2)+(n/2)];
        }

        return res;
    }
}