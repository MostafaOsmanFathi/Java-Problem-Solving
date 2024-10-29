package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array4;

class CountTripletsThatCanFormTwoArraysOfEqualXor {
    public int countTriplets(int[] arr) {
        int[] prefixXor = new int[arr.length + 1];
        for (int i = 1; i <= arr.length; i++) {
            prefixXor[i] = prefixXor[i - 1] ^ arr[i - 1];
        }
        int cnt = 0;
        for (int i = 1; i <= arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                for (int k = j; k <= arr.length; k++) {
                    int a = prefixXor[j - 1] ^ prefixXor[i - 1];
                    int b = prefixXor[k] ^ prefixXor[j - 1];
                    if (a == b) {
                        ++cnt;
//                        System.out.println((i - 1) + " " + (j - 1) + " " + (k - 1));
                    }
                }
            }
        }
        return cnt;
    }
}