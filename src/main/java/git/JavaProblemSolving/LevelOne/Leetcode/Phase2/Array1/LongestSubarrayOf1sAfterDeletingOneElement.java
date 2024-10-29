package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

import java.util.ArrayList;

class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int cnt = 0;
        int mxAns = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ++cnt;
            } else {
                arr.add(cnt);
                arr.add(0);
                cnt = 0;
            }
            mxAns = Math.max(mxAns, cnt-1);
        }
        if (cnt != 0) {
            arr.add(cnt);
        }
        for (int i = 1; i < arr.size() - 1; i++) {
            if (arr.get(i) == 0) {
                mxAns = Math.max(arr.get(i - 1) + arr.get(i + 1), mxAns);
            }
        }

        return mxAns;
    }
}