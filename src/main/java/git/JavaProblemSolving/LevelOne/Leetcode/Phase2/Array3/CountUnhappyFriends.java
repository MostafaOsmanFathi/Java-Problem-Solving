package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

import java.util.HashMap;

class CountUnhappyFriends {
    int getPreferanceRankOf(int[] preference, int y) {
        for (int i = 0; i < preference.length; i++) {
            if (preference[i] == y) {
                return i;
            }
        }
        return -1;
    }

    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int res = 0;
        HashMap<Integer, Integer> pairedWith = new HashMap<>();
        for (int[] pair : pairs) {
            pairedWith.put(pair[0], pair[1]);
            pairedWith.put(pair[1], pair[0]);
        }
        for (int i = 0; i < n; i++) {
            int x = i;
            int y = pairedWith.get(i);
//            int RankOfYinX = getPreferanceRankOf(preferences[x], y);
            label:
            {
                for (int u : preferences[x]) {
                    if (u == x) continue;
                    if (u == y) break;
                    int v = pairedWith.get(u);
                    int RankOfXinU = getPreferanceRankOf(preferences[u], x);
                    int RankOfVInU = getPreferanceRankOf(preferences[u], v);
                    if (RankOfXinU < RankOfVInU) {
                        ++res;
                        break label;
                    }
                }
            }

        }
        return res;
    }
}