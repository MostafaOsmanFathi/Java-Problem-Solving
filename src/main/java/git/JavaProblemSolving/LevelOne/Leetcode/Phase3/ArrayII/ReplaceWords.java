package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        dictionary.sort((String a, String b) ->
                Integer.compare(a.length(), b.length())
        );

        for (int i = 0; i < words.length; i++) {
            for (String dict : dictionary) {
                if (words[i].substring(0, Math.min(dict.length(), words[i].length())).equals(dict)) {
                    words[i] = dict;
                    break;
                }
            }
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        ReplaceWords replaceWords = new ReplaceWords();
        System.out.println(replaceWords.replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery"));

    }
}
