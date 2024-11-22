package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringI;

public class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        StringBuilder result = new StringBuilder(s);
        for (int i = 1; i < s.length(); i += 2) {
            int tmp = result.charAt(i) - '0';
            result.setCharAt(i, (char) (result.charAt(i - 1) + tmp));
        }
        return result.toString();
    }
}
