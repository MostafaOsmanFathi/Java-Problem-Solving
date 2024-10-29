package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

class MaximumSumOfTwoNonOverlappingSubarrays {
    public static int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n = nums.length;
        int ans = 0;

        if (firstLen < secondLen) {
            int tmp = firstLen;
            firstLen = secondLen;
            secondLen = tmp;
        }
        int[] prefix = new int[n + 1];
        prefix[1] = nums[0];
        for (int i = 2; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        for (int i = 1; i <= n - firstLen + 1; i++) {
            int remNext = n - i - firstLen + 1;
            int remPrev = i - 1;
            if (!(remNext >= secondLen || remPrev >= secondLen)) {
                continue;
            }
            int sumFirst = prefix[i + firstLen - 1] - prefix[i - 1];

            int mxSumSecond = 0;
            if (remNext >= secondLen) {
                for (int j = i + firstLen; j <= n - secondLen + 1; j++) {
//                    System.out.println(j+" "+(j+secondLen-1));
                    int tmp = prefix[j + secondLen - 1] - prefix[j - 1];
                    mxSumSecond = Math.max(tmp, mxSumSecond);
                }
            }
            if (remPrev >= secondLen) {
                for (int j = 1; j <= i - secondLen; j++) {
//                    System.out.println(j);
                    int tmp=prefix[j+secondLen-1]-prefix[j-1];
                    mxSumSecond = Math.max(tmp, mxSumSecond);
                }

            }

            ans = Math.max(ans, mxSumSecond + sumFirst);
        }


        return ans;
    }

}