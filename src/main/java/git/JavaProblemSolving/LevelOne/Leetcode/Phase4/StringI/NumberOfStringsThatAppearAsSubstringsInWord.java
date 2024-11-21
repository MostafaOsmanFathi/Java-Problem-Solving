package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringI;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (String p : patterns) {
            if (word.contains(p))
                ++res;
        }
        return res;
    }
}
