package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

class RotatingTheBox {
    public static char[][] rotateArr(char[][] box) {
        char[][] tmp = new char[box[0].length][box.length];
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                tmp[j][box.length - i - 1] = box[i][j];
            }
        }
        return tmp;
    }

    public static char[][] rotateTheBox(char[][] box) {
        int n = box.length, m = box[0].length;


        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                if (box[i][j] == '#') {

                    for (int k = j; k < m - 1; k++) {
                        if (box[i][k + 1] == '.') {
                            box[i][k] = '.';
                            box[i][k + 1] = '#';
                        } else
                            break;
                    }
                }
            }
        }
        return rotateArr(box);
    }


}