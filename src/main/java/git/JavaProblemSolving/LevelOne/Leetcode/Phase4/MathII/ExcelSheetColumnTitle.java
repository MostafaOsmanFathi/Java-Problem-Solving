package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathII;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while (columnNumber > 0) {
            char tmp = (char) (((columnNumber - 1) % 26) + 'A');
            str.append(tmp);
            columnNumber--;
            columnNumber /= 26;
        }
        str.reverse();
        return str.toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle obj = new ExcelSheetColumnTitle();
        System.out.println(obj.convertToTitle(28));
        System.out.println(obj.convertToTitle(701));
        System.out.println(obj.convertToTitle(1));
    }
}
