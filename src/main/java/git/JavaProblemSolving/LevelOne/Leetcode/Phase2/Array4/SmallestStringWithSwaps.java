package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class SmallestStringWithSwaps {
    int[] dsu;

    int find_set(int v) {
        if (dsu[v] == v) return v;
        return dsu[v] = find_set(dsu[v]);
    }

    void join_set(int a, int b) {
        a = find_set(a);
        b = find_set(b);
        if (a != b) {
            dsu[Math.max(a, b)] = Math.min(a, b);
        }
    }

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        dsu = new int[s.length() + 1];
        for (int i = 0; i < dsu.length; i++) {
            dsu[i] = i;
        }
        for (var tmp : pairs) {
            join_set(tmp.get(0), tmp.get(1));
        }
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int tmp = find_set(i);
            mp.putIfAbsent(tmp, new ArrayList<>());
            mp.get(tmp).add(i);
        }
        StringBuilder sb = new StringBuilder(s);
        for (ArrayList<Integer> tmp : mp.values()) {
            ArrayList<Integer> tmpp = (ArrayList<Integer>) tmp.clone();

            tmp.sort((a, b) -> Character.compare(s.charAt(a), s.charAt(b)));
            for (int i = 0; i < tmp.size(); i++) {
                sb.setCharAt(tmpp.get(i), s.charAt(tmp.get(i)));
            }
        }

        return sb.toString();
    }

}