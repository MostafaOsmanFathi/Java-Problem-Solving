package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int idx = 1;
        for (String word : words) {
            if (word.startsWith(searchWord)) {
                return idx;
            }
            idx++;
        }
        return -1;
    }
}
