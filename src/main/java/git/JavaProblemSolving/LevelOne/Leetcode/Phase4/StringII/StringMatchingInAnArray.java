package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        StringBuilder allWords = new StringBuilder();
        for (String word : words) {
            allWords.append(word).append('|');
        }
        List<String> result = new ArrayList<>();
        for (String word : words) {
            int idx = allWords.indexOf(word);
            if (allWords.indexOf(word, idx + 1) != -1) {
                result.add(word);
            }
        }
        return result;
    }
}
