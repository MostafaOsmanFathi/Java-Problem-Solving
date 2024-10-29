package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int lastDur = 0;
        int ans = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i] > lastDur) {
                ans += duration;
            } else {
                ans += (duration + timeSeries[i]) - lastDur;
            }
            lastDur = duration + timeSeries[i];
        }
        return ans;
    }
}