package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        int AllZeros = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                AllZeros++;
        }

        int zero = 0, lastZeroPossCnt = 0;
        int one = 0, firstOnePossCnt = 0;
        boolean flag = false;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zero++;
                lastZeroPossCnt = one;
                if (flag)
                    firstOnePossCnt++;
            } else {
                one++;
                flag = true;
            }
            res = Math.min(res, (AllZeros - zero) + one);
        }
        res = Math.min(res, Math.min(zero, one));
        res = Math.min(res, Math.min(res, firstOnePossCnt));
        res = Math.min(res, Math.min(res, lastZeroPossCnt));
        return res;
    }

}