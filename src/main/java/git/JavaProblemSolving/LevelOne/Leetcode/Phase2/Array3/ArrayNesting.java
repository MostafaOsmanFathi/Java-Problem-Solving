package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

import java.util.HashSet;

class ArrayNesting {
    HashSet<Integer> set = new HashSet<>();
    int[] arr;

    int traceChain(int i) {
        if (set.contains(i)) return 0;
        set.add(i);
        return 1 + traceChain(arr[i]);

    }

    public int arrayNesting(int[] nums) {
        arr = nums;
        int mxAns = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            mxAns = Math.max(mxAns, traceChain(nums[i]));
        }
        return mxAns;
    }
}