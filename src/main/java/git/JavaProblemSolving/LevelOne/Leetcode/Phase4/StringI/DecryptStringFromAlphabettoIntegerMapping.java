package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringI;

public class DecryptStringFromAlphabettoIntegerMapping {
    public String freqAlphabets(String s) {
        s = s + "|";
        String[] tmp = s.split("#");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < tmp.length - 1; i++) {
            for (int j = 0; j < tmp[i].length() - 2; j++) {
                char chrRes = (char) (tmp[i].charAt(j) - '1' + 'a');
                result.append(chrRes);
            }
            String tmmm = tmp[i].substring(tmp[i].length() - 2);
            char chrRes = (char) (Integer.parseInt(tmmm) + 'a' - 1);
            result.append(chrRes);
        }
        for (int j = 0; j < tmp[tmp.length - 1].length(); j++) {
            if (tmp[tmp.length - 1].charAt(j) == '|')
                break;

            char chrRes = (char) (tmp[tmp.length - 1].charAt(j) - '1' + 'a');
            result.append(chrRes);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        DecryptStringFromAlphabettoIntegerMapping obj = new DecryptStringFromAlphabettoIntegerMapping();
        System.out.println(obj.freqAlphabets("1326#"));
        System.out.println(obj.freqAlphabets("10#11#12"));
    }
}
