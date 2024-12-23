package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathII;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i = columnTitle.length() - 1, powerBase = 1; i >= 0; i--, powerBase *= 26) {
            int tmp = columnTitle.charAt(i) - 'A' + 1;
            ans += (powerBase * tmp);
        }
        return ans;
    }

}
