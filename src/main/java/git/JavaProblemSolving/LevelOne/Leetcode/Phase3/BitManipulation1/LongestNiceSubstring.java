package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

import java.util.Comparator;

public class LongestNiceSubstring {
    public String longestNiceSubstring(String s) {
        String ans = "";
        Comparator<String> cmpLen = (String a, String b) -> Integer.compare(a.length(), b.length());
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (ans.length() >= j - i + 1)
                    continue;

                checkFromIToJ:
                {
                    boolean[] Caps = new boolean[26];
                    boolean[] Sml = new boolean[26];
                    StringBuilder strTmp = new StringBuilder();
                    for (int k = i; k <= j; k++) {
                        if (Character.isUpperCase(s.charAt(k))) {
                            Caps[s.charAt(k) - 'A'] = true;
                        } else {
                            Sml[s.charAt(k) - 'a'] = true;
                        }
                        strTmp.append(s.charAt(k));
                    }
                    for (int k = 0; k < 26; k++) {
                        if (Caps[k] != Sml[k]) {
                            break checkFromIToJ;
                        }
                    }
                    String str = strTmp.toString();
                    ans = (cmpLen.compare(ans, str) > 0) ? ans : str;
                }
            }
        }
        return ans;
    }
}
