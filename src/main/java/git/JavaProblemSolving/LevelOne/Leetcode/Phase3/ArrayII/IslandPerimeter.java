package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

public class IslandPerimeter {

    int dfs(int[][] grid, int x, int y) {
        if (x >= grid.length || y >= grid[0].length || x < 0 || y < 0 || grid[x][y] == -1) return 0;
        if (grid[x][y] == 1) return 1;
        grid[x][y] = -1;
        return dfs(grid, x + 1, y) + dfs(grid, x - 1, y) + dfs(grid, x, y + 1) + dfs(grid, x, y - 1);
    }

    public int islandPerimeter(int[][] grid) {
        int[][] tmpGrid = new int[grid.length + 2][grid[0].length + 2];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                tmpGrid[i + 1][j + 1] = grid[i][j];
            }
        }
        grid = tmpGrid;

        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0)
                    ans += dfs(grid, i, j);
            }
        }
        return ans;
    }
}
