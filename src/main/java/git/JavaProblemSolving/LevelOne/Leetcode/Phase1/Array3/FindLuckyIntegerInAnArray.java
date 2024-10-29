package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;

class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        int[] frq = new int[510];
        for (int i = 0; i < arr.length; i++) {
            frq[arr[i]]++;
        }
        int res=-1;
        for (int i = 1; i < frq.length; i++) {
            if (frq[i] == i) {
                res=Math.max(res,i);
            }
        }
        return res;
    }
}