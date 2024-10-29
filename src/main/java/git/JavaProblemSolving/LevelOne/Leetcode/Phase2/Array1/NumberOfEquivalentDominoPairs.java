package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

import java.util.ArrayList;

class NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        ArrayList<Integer>[] frq = new ArrayList[10];
        for (int i = 0; i < frq.length; i++) {
            frq[i] = new ArrayList<>();
        }

        for (int i = 0; i < dominoes.length; i++) {
            int mx = Math.max(dominoes[i][0], dominoes[i][1]);
            int mn = Math.min(dominoes[i][0], dominoes[i][1]);
            frq[mx].add(mn);
//            frq[dominoes[i][1]].add(dominoes[i][0]);
        }
        int ans = 0;
        for (int i = 0; i < frq .length; i++) {
            frq[i].sort(Integer::compareTo);
            int cnt = 1 ;
            for (int j = 1; j < frq[i].size(); j++) {
                if (frq[i].get(j).equals(frq[i].get(j - 1))) {
                    cnt++;
                } else {
                    ans += cnt * (cnt - 1) / 2;
                    cnt = 1;
                }
            }
            ans += cnt * (cnt - 1) / 2;
        }

        return ans;
    }

}