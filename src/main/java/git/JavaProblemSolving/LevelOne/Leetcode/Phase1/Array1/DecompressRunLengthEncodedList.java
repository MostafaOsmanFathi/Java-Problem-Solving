package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array1;

class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int sz=0;
        for (int i = 0; i < nums.length; i+=2) {
            sz+=nums[i];
        }
        int []res=new int[sz];
        int con=0;
        
        for (int i = 0; i < nums.length ; i+=2) {
            while (nums[i]>0){
                res[con++]=nums[i+1];
                --nums[i];
            }
        }
        return res;
    }
}