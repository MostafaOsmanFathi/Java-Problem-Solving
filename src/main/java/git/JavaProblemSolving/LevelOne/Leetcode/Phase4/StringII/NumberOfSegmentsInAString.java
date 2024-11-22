package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int res = 0;
        for (String str : s.split(" ")) {
            if (!str.isEmpty()) res++;
        }
        return res;
    }
}
