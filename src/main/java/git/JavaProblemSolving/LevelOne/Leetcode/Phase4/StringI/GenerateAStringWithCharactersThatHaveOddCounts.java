package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringI;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            sb.repeat('a', n - 1);
            sb.append('b');
        } else {
            sb.repeat('a', n);
        }
        return sb.toString();
    }
}
