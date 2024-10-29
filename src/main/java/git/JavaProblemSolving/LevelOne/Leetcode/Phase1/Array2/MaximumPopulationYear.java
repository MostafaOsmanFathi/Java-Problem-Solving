package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

class MaximumPopulationYear {
    final int STARTYEAR = 1950;

    public int maximumPopulation(int[][] logs) {
        int[] partialSum = new int[101];
        for (int[] log : logs) {
            partialSum[log[0] - STARTYEAR]++;
            partialSum[log[1] - STARTYEAR]--;
        }
        int ans = partialSum[0], year = 0;
        for (int i = 1; i < 101; i++) {
            partialSum[i] += partialSum[i - 1];
            if (ans < partialSum[i]) {
                ans = partialSum[i];
                year = i;
            }
        }
        return year + STARTYEAR;
    }
}