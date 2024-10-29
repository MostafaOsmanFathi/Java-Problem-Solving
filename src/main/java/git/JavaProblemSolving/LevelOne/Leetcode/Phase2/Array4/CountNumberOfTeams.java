package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array4;

class CountNumberOfTeams {
    public int numTeams(int[] arr) {
        int[] greater = new int[arr.length];
        int[] smaller = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int cntG = 0;
            int cntS = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    ++cntG;
                }
                if (arr[j] < arr[i]) {
                    ++cntS;
                }
            }
            greater[i] = cntG;
            smaller[i] = cntS;
        }
        int res = 0;
        for (int i = 0; i < greater.length; i++) {
            for (int j = i + 1; j < greater.length; j++) {
                if (!(greater[j] == 0 || arr[j] <= arr[i])) {
                    res += greater[j];
                }
                if (!(smaller[j] == 0 || arr[j] >= arr[i])) {
                    res += smaller[j];
                }
            }
        }
        return res;
    }
}