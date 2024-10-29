package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array1;

class XorOperationInAnArray {
    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= start+(2*i);
        }
        return result;
    }
}