package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array1;

class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                int temp = image[i][image[i].length - j - 1];
                image[i][image[i].length - j - 1] = image[i][j]^1;
                image[i][j] = temp^1;
            }
            if ((image[i].length&1) !=0){
                image[i][image[i].length/2]^=1;
            }
        }
        return image;
    }
}