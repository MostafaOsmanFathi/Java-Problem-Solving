package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class QueensThatCanAttackTheKing {
    static final int[] mvX = new int[]{1, -1, 1, 0, -1, 0, 1, -1};
    static final int[] mvY = new int[]{1, -1, 0, 1, 0, -1, -1, 1};
    int kingX, kingY;
    boolean[][] board;

    boolean isValidPoss(int x, int y) {
        return x < 8 && y < 8 && x >= 0 && y >= 0;
    }

    boolean CheckQueen(int x, int y, final int mvIdx) {
        if (!isValidPoss(x, y) || board[x][y]) {
            return false;
        } else if (checkKing(x, y)) {
            return true;
        }
        return CheckQueen(x + mvX[mvIdx], y + mvY[mvIdx], mvIdx);
    }

    boolean checkKing(int x, int y) {
        return x == kingX && y == kingY;
    }

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        board = new boolean[8][8];
        kingX = king[0];
        kingY = king[1];
        for (int[] q : queens) {
            board[q[0]][q[1]] = true;
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int[] q : queens) {
            for (int i = 0; i < 8; i++) {
                if (CheckQueen(q[0] + mvX[i], q[1] + mvY[i], i)) {
                    result.add(Arrays.asList(q[0], q[1]));
                }
            }
        }
        return result;
    }

}