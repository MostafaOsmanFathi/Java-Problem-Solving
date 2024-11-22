package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringI;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i != word1.length())
                result.append(word1.charAt(i++));

            String tmp = word1;
            word1 = word2;
            word2 = tmp;
            int tmpi = i;
            i = j;
            j = tmpi;

        }
        return result.toString();
    }
}
