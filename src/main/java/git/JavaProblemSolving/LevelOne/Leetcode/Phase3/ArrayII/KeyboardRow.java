package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

public class KeyboardRow {
    static char[] levelChr = new char[26];
    static final String row1 = "qwertyuiop";
    static final String row2 = "asdfghjkl";
    static final String row3 = "zxcvbnm";

    static {
        for (int i = 0; i < row1.length(); i++) {
            levelChr[row1.charAt(i) - 'a'] = 1;
        }
        for (int i = 0; i < row2.length(); i++) {
            levelChr[row2.charAt(i) - 'a'] = 2;
        }
        for (int i = 0; i < row3.length(); i++) {
            levelChr[row3.charAt(i) - 'a'] = 3;
        }
    }

    public String[] findWords(String[] words) {

        boolean[] isRow = new boolean[words.length];
        int tmp = 0;
        for (int i = 0; i < words.length; i++) {
//            words[i] = words[i].toLowerCase();
            for (int j = 1; j < words[i].length(); j++) {

                if (levelChr[Character.toLowerCase(words[i].charAt(j)) - 'a'] != levelChr[Character.toLowerCase(words[i].charAt(j - 1)) - 'a']) {
                    isRow[i] = true;
                    break;
                }
            }
            if (!isRow[i]) {
                tmp++;
            }
        }
        String[] res = new String[tmp];
        tmp = 0;
        for (int i = 0; i < words.length; i++) {
            if (!isRow[i]) {
                res[tmp++] = words[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
    }
}
