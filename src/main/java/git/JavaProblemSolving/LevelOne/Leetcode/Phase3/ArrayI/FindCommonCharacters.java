package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        int[] frqGen = new int[26];
        int[] frqTmp = new int[26];

        Arrays.fill(frqGen, 200);
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                frqTmp[word.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                frqGen[i] = Math.min(frqGen[i], frqTmp[i]);
                frqTmp[i] = 0;
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (frqGen[i] > 0) {
                result.add("" + (char) (i + 'a'));
                frqGen[i]--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindCommonCharacters findCommonCharacters = new FindCommonCharacters();
        findCommonCharacters.commonChars(new String[]{"bella", "label", "roller"});
    }
}
