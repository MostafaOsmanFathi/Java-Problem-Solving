package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int i = 0;
        for (; i < k; i++) {
            sum += arr[i];
        }
        int ans = 0;
        if (sum/k >= threshold) {
            ++ans;
        }
        for (; i < arr.length; i++) {
            sum -= arr[i - k];
            sum += arr[i];
            if (sum/k >= threshold) {
                ++ans;
            }
        }

        return ans;
    }
}