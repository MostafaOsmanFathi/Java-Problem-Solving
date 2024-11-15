package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindTheLongestSubstringContainingVowelsInEvenCounts {

    final static String VOWEL = "aeiou";

    public int findTheLongestSubstring(String s) {
        Predicate<Character> isVowel = (character) -> {
            return VOWEL.contains(character + "");
        };
        Function<Character, Integer> getBit = (Character a) -> ((a - 'a') + 1);

        int[] prefixBits = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            int tmp = 0;
            if (isVowel.test(s.charAt(i))) {
                tmp ^= (1 << getBit.apply(s.charAt(i)));
            }
            prefixBits[i + 1] = prefixBits[i] ^ tmp;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 1; i < prefixBits.length; i++) {
            if (prefixBits[i] == 0) {
                ans = Math.max(ans, i);
            } else {
                if (map.containsKey(prefixBits[i])) {
                    ans = Math.max(ans, i - map.get(prefixBits[i]));
                }
                map.putIfAbsent(prefixBits[i], i);
            }
        }
        return ans;
    }
}
