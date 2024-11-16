package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class VerifyingAnAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {
        int[] chrOrder = new int[26];
        for (int i = 0; i < order.length(); i++) {
            chrOrder[order.charAt(i) - 'a'] = i;
        }
        Comparator<String> cmp = (String a, String b) -> {
            int lim = Math.min(a.length(), b.length());
            for (int i = 0; i < lim; i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    return -Integer.compare(chrOrder[a.charAt(i) - 'a'], chrOrder[b.charAt(i) - 'a']);
                }
            }

            return -Integer.compare(a.length(), b.length());
        };
        for (int i = 1; i < words.length; i++) {
            if (cmp.compare(words[i], words[i - 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        VerifyingAnAlienDictionary obj = new VerifyingAnAlienDictionary();
        System.out.println(
                obj.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz")
        );
    }

}
