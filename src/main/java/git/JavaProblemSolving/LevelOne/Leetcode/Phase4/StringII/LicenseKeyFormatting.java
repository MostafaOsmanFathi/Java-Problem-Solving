package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder result = new StringBuilder();
        int splitGroupIndicator = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                result.append(Character.toUpperCase(s.charAt(i)));
                splitGroupIndicator++;
            }
            if (splitGroupIndicator == k) {
                result.append('-');
                splitGroupIndicator = 0;
            }
        }
        if (!result.isEmpty() && result.charAt(result.length() - 1) == '-') {
            result.deleteCharAt(result.length() - 1);
        }
        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        LicenseKeyFormatting lf = new LicenseKeyFormatting();
        System.out.println(lf.licenseKeyFormatting("---", 3));
        System.out.println(lf.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}
