package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int[] arr2 = new int[arr.length];
        int con = 0;
        for (int i = 0; i < arr.length && con < arr.length; i++) {
            if (arr[i] == 0) {
                arr2[con++] = 0;
                if (con < arr.length)
                    arr2[con++] = 0;
            } else {
                arr2[con++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr2[i];
        }
    }
}