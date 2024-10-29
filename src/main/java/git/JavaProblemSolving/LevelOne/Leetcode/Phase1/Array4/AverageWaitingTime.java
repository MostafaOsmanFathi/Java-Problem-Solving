package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        double sum = 0;
        int finishingTime = -1;
        for (int[] customer : customers) {
            int arrival = customer[0];
            int time = customer[1];
            if (finishingTime == -1 || arrival > finishingTime) {
                sum += time;
                finishingTime = time + arrival;
            } else {
                int totalWaitingTime = time + (finishingTime - arrival);
                sum += totalWaitingTime;
                finishingTime += time;
            }

        }
        return sum / customers.length;
    }
    
}