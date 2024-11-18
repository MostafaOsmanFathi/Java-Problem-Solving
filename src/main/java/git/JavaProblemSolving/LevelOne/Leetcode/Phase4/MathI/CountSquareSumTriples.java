package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathI;

public class CountSquareSumTriples {

    public int countTriples(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int ii = i * i;
            for (int j = 1; j <= n; j++) {
                int jj = j * j;
                int tmp = ii + jj;
                if (tmp <= n*n && Math.ceil(Math.sqrt(tmp)) == Math.floor(Math.sqrt(tmp))) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        CountSquareSumTriples cs = new CountSquareSumTriples();
        System.out.println(cs.countTriples(5));
    }
}
