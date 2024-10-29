package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;

class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int ans = 0;
            for (int i = 0; i < arr1.length; i++) {
                boolean tmp = true;
                for (int j = 0; j < arr2.length; j++) {
                    if (Math.abs(arr1[i] - arr2[j]) <= d) {
                        tmp = false;
                        break;
                    }
                }
                if (tmp) {
                    ans++;
                }
            }
            return ans;
        }
    }
    