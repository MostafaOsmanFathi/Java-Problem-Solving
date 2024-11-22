package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        int res = 0;
        String ref = word;
        while (sequence.contains(ref)) {
            res++;
            ref += word;
        }
        return res;
    }

    public static void main(String[] args) {
        MaximumRepeatingSubstring obj = new MaximumRepeatingSubstring();
        System.out.println(obj.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }
}
