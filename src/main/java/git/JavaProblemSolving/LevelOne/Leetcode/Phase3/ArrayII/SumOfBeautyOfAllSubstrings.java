package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

public class SumOfBeautyOfAllSubstrings {
    public int beautySum(String s) {
        int[] frq = new int[26];
        int[] prefixMn = new int[s.length()];
        int[] prefixMx = new int[s.length()];

        int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                frq[s.charAt(j) - 'a']++;
                mn = Integer.MAX_VALUE;
                mx = Integer.MIN_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (frq[k] > 0)
                        mn = Math.min(mn, frq[k]);
                    mx = Math.max(mx, frq[k]);
                }
                res += mx - mn;
            }
            for (int j = 0; j < 26; j++) {
                frq[j] = 0;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        SumOfBeautyOfAllSubstrings solution = new SumOfBeautyOfAllSubstrings();
        solution.beautySum("aabcb");
    }
}
