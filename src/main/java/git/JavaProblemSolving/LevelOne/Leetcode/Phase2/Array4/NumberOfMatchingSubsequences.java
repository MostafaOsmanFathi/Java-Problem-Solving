package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array4;

import java.util.HashMap;

class NumberOfMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String, Integer> mp = new HashMap<>();
        for (String w : words) {
            mp.put(w, mp.getOrDefault(w, 0) + 1);
        }

        int res = 0;
        for (String str : mp.keySet()) {
            int con = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == str.charAt(con)) {
                    con++;
                }
                if (con == str.length()) {
                    res += mp.get(str);
                    break;
                }
            }

        }
        return res;
    }
}