package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayI;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] goodChars = new int[26];
        int[] frqTmp = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            goodChars[chars.charAt(i) - 'a']++;
        }

        int sum = 0;
        for (String str : words) {
            boolean isGood = true;
            for (int i = 0; i < str.length(); i++) {
                frqTmp[str.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (frqTmp[i] > goodChars[i]) {
                    isGood = false;
                }
                frqTmp[i] = 0;
            }
            if (isGood) {
                sum += str.length();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        FindWordsThatCanBeFormedByCharacters f = new FindWordsThatCanBeFormedByCharacters();
        f.countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach");
    }
}
