package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int []partialSum = new int[1100];

        for (int i = 0; i < endTime.length; i++) {
            ++partialSum[startTime[i]];
            --partialSum[endTime[i]+1];
        }
        for (int i = 1; i < partialSum.length; i++) {
            partialSum[i]+=partialSum[i-1];
        }
        return partialSum[queryTime];
    }
}