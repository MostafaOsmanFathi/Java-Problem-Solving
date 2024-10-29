package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder tmp = new StringBuilder();
        for (int j : num) {
            tmp.append(j);
        }
        BigInteger b = new BigInteger(tmp.toString());
        b = b.add(BigInteger.valueOf(k));
        String res = b.toString();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < res.length(); i++) {
            list.add(Integer.parseInt(res.charAt(i) + ""));
        }
        return list;
    }
}