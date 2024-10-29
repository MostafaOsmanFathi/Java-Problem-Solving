package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

class FindWinnerOnATicTacToeGame {
    static final int[][] winningCases = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
    };

    static int getPosX(int n) {
        return n / 3;
    }

    static int getPosY(int n) {
        return n % 3;
    }

    public String tictactoe(int[][] moves) {

        char[][] board = new char[3][3];
        boolean isX = false;
        for (int[] move : moves) {
            board[move[0]][move[1]] = (isX ^= true) ? 'A' : 'B';
        }

        String Winner = (moves.length == 9)? "Draw":"Pending";
        for (int[] WCase : winningCases) {
            int A = 0;
            int B = 0;
            for (int i = 0; i < 3; i++) {
                char tmp = board[getPosX(WCase[i])][getPosY(WCase[i])];
                if ( tmp == 'A')
                    A++;
                else if(tmp == 'B')
                    B++;
            }
            
            if (A == 3 || B == 3) {
                Winner = "" + board[getPosX(WCase[0])][getPosY(WCase[0])];
                break;
            }
        }
        
        return Winner;
    }

  
}