package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

class CheckIfItIsAStraightLine {
    public static String getSlope(int x, int y, int x2, int y2) {
        if (x2 - x == 0) return "DivZero";
        double res = (double) (y2 - y) / (x2 - x);
        res = Math.abs(res);
        return res + "";
    }

    public boolean checkStraightLine(int[][] coordinates) {
        for (int i = 2; i < coordinates.length; i++) {
            var tmp1 = getSlope(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);
            var tmp2 = getSlope(coordinates[i - 1][0], coordinates[i - 1][1], coordinates[i][0], coordinates[i][1]);
            var tmp3 = getSlope(coordinates[0][0], coordinates[0][1], coordinates[i][0], coordinates[i][1]);

            if (!tmp1.equals(tmp2) || !tmp2.equals(tmp3) || !tmp3.equals(tmp1)) {
                return false;
            }

        }
        return true;
    }

}