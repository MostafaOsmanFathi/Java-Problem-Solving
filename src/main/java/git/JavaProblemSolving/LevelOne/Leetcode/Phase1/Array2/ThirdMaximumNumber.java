package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

class ThirdMaximumNumber {
    public static int thirdMax(int[] arr) {
         long mx1 = Long.MIN_VALUE;
           long mx2 = Long.MIN_VALUE;
           long mx3 = Long.MIN_VALUE;
   
           for (var x : arr) {
               if (x > mx1) {
                   mx3 = mx2;
                   mx2 = mx1;
                   mx1 = x;
               } else if (x > mx2 && x != mx1) {
                   mx3 = mx2;
                   mx2 = x;
               } else if (x > mx3 && x != mx2 && x != mx1) {
                   mx3 = x;
               }
           }
           return (int)(mx3 ==Long.MIN_VALUE ? mx1 : mx3);
       }
   }