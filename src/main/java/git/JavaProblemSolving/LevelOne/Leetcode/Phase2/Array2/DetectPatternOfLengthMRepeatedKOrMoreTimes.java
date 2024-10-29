package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

import java.util.LinkedList;

class DetectPatternOfLengthMRepeatedKOrMoreTimes {
    public static int CountPattern(int[] arr, final LinkedList<Integer> pattern) {
        int cnt = 0;
        int res = 0;
        LinkedList<Integer> temp = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (temp.size() != pattern.size()) {
                temp.addLast(arr[i]);
                if (temp.size() != pattern.size())
                    continue;
            }

            if (temp.equals(pattern)) {
                cnt++;
                temp.clear();
            } else {
                res=Math.max(res, cnt);
                cnt = 0;
            }
            if (!temp.isEmpty())
                temp.removeFirst();
        }
        res=Math.max(res, cnt);
        return res;
    }

    public boolean containsPattern(int[] arr, int m, int k) {
        LinkedList<Integer> pattern = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (pattern.size() != m) {
                pattern.addLast(arr[i]);
                if (pattern.size() != m)
                    continue;
            }
            if (CountPattern(arr, pattern) >= k) {
                return true;
            }
            pattern.removeFirst();
        }
        return false;
    }
}