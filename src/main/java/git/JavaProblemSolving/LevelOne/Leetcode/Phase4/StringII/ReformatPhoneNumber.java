package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

public class ReformatPhoneNumber {
    public String reformatNumber(String number) {
        StringBuilder numsOnly = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i)))
                numsOnly.append(number.charAt(i));
        }
        int idx = 0;
        int numberLen = numsOnly.length();

        for (int i = 0; i < numsOnly.length(); i++) {
            if (!Character.isDigit(numsOnly.charAt(i))) {
                continue;
            }
            idx++;
            int rem = numberLen - idx + 1;
            if (rem == 4) {
                numsOnly.insert(i + 2, '-');
                break;
            } else if (rem == 2)
                break;
            else if (rem == 3)
                break;
            else {
                numsOnly.insert(i + 3, '-');
                idx+=2;
                i+=3;
            }
        }
        return numsOnly.toString();
    }

    public static void main(String[] args) {
        ReformatPhoneNumber obj = new ReformatPhoneNumber();
        System.out.println(obj.reformatNumber("1-23-45 6"));
        System.out.println(obj.reformatNumber("123 4-567"));
        System.out.println(obj.reformatNumber("123 4-5678"));
    }
}
