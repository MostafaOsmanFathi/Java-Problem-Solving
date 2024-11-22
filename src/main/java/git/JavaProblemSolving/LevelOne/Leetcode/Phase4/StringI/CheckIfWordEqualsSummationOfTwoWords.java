package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringI;

public class CheckIfWordEqualsSummationOfTwoWords {
        int numricalValue(String s) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                builder.append(c - 'a');
            }
            return Integer.parseInt(builder.toString());
        }

        public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
            return numricalValue(firstWord) + numricalValue(secondWord) == numricalValue(targetWord);
        }
}