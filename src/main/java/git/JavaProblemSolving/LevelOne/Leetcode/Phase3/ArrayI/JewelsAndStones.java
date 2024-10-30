package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayI;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] jewelExists = new boolean[200];
        for (int i = 0; i < jewels.length(); i++) {
            jewelExists[jewels.charAt(i)] = true;
        }
        int res=0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelExists[stones.charAt(i)]) {
                res++;
            }
        }
        return res;
    }
}
