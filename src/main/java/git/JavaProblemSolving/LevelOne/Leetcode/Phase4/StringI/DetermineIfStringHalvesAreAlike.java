package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringI;

public class DetermineIfStringHalvesAreAlike {
    static final String Vowels = "aeiou";

    public boolean halvesAreAlike(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Vowels.contains(Character.toLowerCase(s.charAt(i)) + "")) {
                if (i >= s.length() / 2)
                    --cnt;
                else
                    ++cnt;

            }
        }
        return cnt == 0;
    }
}
