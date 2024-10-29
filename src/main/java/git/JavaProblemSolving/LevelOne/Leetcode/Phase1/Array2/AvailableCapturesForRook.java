package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

class AvailableCapturesForRook {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    final static byte BOARDSIZE = 8;
    char[][] board;


    boolean isValid(int x, int y) {
        return x < BOARDSIZE && y < BOARDSIZE && x >= 0 && y >= 0;
    }

    byte dfs(int dir, int x, int y) {
        if (!isValid(x, y) || board[x][y] == 'B') {
            return 0;
        } else if (board[x][y] == 'p') {
            return 1;
        }
        return dfs(dir, x + dx[dir], y + dy[dir]);
    }

    public int numRookCaptures(char[][] board) {
        this.board = board;
        int xS = 0, yS = 0;

        label:
        {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 'R') {
                        xS = i;
                        yS = j;
                        break label;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 4; i++) {
            ans += dfs(i, xS + dx[i], yS + dy[i]);
        }

        return ans;
    }
    
}
