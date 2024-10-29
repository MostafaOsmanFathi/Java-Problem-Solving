package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;


import java.util.*;

class Shift2dGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            res.add(new ArrayList<>());
            for (int j = 0; j < grid[i].length; j++) {
                res.getLast().add(0);
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
//                int tmp = (i * grid.length) + j + k;
                int levels = (j + k);
                int x = (i + levels / grid[i].length);
                int y = levels % grid[i].length;
                res.get(x % grid.length).set(y % grid[i].length, grid[i][j]);
            }
        }

        return res;
    }

}