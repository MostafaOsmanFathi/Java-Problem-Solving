package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathI;

public class DetermineColorOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        int row = coordinates.charAt(0) - 'a';
        int col = coordinates.charAt(1) - '0';
        return (row + col) % 2 == 0;
    }
}
