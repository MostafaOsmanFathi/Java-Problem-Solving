package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringI;

public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                result.append(word.charAt(word.length() - i - 1));
            }
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
