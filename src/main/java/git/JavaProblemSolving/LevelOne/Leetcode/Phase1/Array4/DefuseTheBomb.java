package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[code.length];
        int[] prefix = new int[code.length + 1];
        for (int i = 0; i < code.length; i++) {
            prefix[i + 1] = code[i] + prefix[i];
        }

        for (int i = 0; i < result.length; i++) {
            if (code[i] == 0) {
                result[i] = 0;
            } else if (k > 0) {
                int ans = prefix[Math.min(i + k + 1, n)] - prefix[i + 1];
                if (k + i >= result.length) {
                    int tmpK = k - (n - i) + 1;
                    ans += prefix[tmpK];
                }
                result[i] = ans;
            } else if (k < 0) {
//                k *= -1;
                int ans = prefix[i] - prefix[Math.max(i + k, 0)];
                int tmpK = -(k) - i;
                if (tmpK > 0) {
                    ans += prefix[n] - prefix[n - tmpK];
                }
                result[i] = ans;
            }
        }
        return result;
    }
}