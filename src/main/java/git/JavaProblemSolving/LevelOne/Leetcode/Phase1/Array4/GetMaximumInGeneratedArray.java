package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

class GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
          if (n <2){
              return n;
          }
          int[] arr = new int[n+1];
          arr[0] = 0;
          arr[1] = 1;
          int mx =1;
          for (int i = 2; i <= n; i++) {
              if (i % 2 == 0) {
                  arr[i] = arr[i / 2];
              } else {
                  arr[i] = arr[i / 2] + arr[(i / 2) + 1];
              }
              mx = Math.max(arr[i], mx);
          }
          return mx;
      }
  }