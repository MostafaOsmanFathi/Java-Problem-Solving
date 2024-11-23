package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

public class GoatLatin {
    static String VOWELS = "aeiouAEIOU";

    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!VOWELS.contains(word.charAt(0) + "")) {
                StringBuilder sb = new StringBuilder(word.substring(1));
                sb.append(word.charAt(0)).append("ma");
                sb.append("a".repeat(i + 1));
                words[i] = sb.toString();
            } else {
                StringBuilder sb = new StringBuilder(word);
                sb.append("ma");
                sb.append("a".repeat(i + 1));
                words[i] = sb.toString();
            }
        }
        return String.join(" ", words);
    }
}
