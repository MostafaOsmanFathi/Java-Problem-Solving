package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

class ImageOverlap {

    int getAnsAfterShiftBy(int right, int down, int[][] img1, int[][] img2) {
        int res = 0;
        for (int i = 0; i < img1.length; i++) {
            if (i + down >= img1.length || i + down < 0)
                continue;
            for (int j = 0; j < img1[i].length; j++) {
                if (j + right >= img1[i].length || j + right < 0) continue;
                if (img1[i][j] == img2[i + down][j + right])
                    res += img1[i][j];
            }
        }
        return res;
    }

    public int largestOverlap(int[][] img1, int[][] img2) {
        int ans = 0;
//        assert Math.max(ans, getAnsAfterShiftBy(1, 1, img1, img2)) == 3;

        for (int i = 0; i <= img1.length + 1; i++) {
            for (int j = 0; j <= img1.length; j++) {
                ans = Math.max(ans, getAnsAfterShiftBy(i, j, img1, img2));
                ans = Math.max(ans, getAnsAfterShiftBy(-i, -j, img1, img2));
                ans = Math.max(ans, getAnsAfterShiftBy(i, -j, img1, img2));
                ans = Math.max(ans, getAnsAfterShiftBy(-i, j, img1, img2));
            }
        }
        return ans;
    }
}