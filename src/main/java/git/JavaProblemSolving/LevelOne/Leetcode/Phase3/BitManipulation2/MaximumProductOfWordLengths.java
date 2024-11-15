package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

public class MaximumProductOfWordLengths {
    public int maxProduct(String[] words) {
        int[] wordBits = new int[words.length];
        int con = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                int bit = (1 << (word.charAt(i) - 'a'));
                wordBits[con] |= bit;
            }
            con++;
        }

        int mx = 0;
        for (int i = 0; i < wordBits.length; i++) {
            for (int j = 0; j < wordBits.length; j++) {
                if (i == j || (wordBits[i] & wordBits[j]) != 0) continue;
                mx = Math.max(mx, words[i].length() * words[j].length());
            }
        }
        return mx;
    }
}
