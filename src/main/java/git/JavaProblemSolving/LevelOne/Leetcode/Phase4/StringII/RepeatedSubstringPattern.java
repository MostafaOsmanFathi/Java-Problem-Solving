package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

public class RepeatedSubstringPattern {
    static boolean checkString(String s, int divSize) {
        String tmp = s.substring(0, divSize);
        int req = s.length() / divSize;
        int idx = 0;
        while ((idx = s.indexOf(tmp, idx)) != -1) {
            idx += divSize;
            req--;
        }
        return req == 0;
    }

    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1)
            return false;
        if (checkString(s, 1))
            return true;

        for (int i = 2; i * i <= s.length(); i++) {
            if (s.length() % i == 0) {
                if (checkString(s, i)) {
                    return true;
                }
                if (s.length() / i != i) {
                    if (checkString(s, s.length() / i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
