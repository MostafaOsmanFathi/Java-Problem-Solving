package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] split = text.split(" ");
        ArrayList<String> res = new ArrayList<>();

        for (int i = 1; i < split.length - 1; i++) {
            if (first.equals(split[i - 1]) && second.equals(split[i])) {
                res.add(split[i + 1]);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        OccurrencesAfterBigram occurrencesAfterBigram = new OccurrencesAfterBigram();
        occurrencesAfterBigram.findOcurrences("we will we will rock you", "we", "will");
    }
}
