package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array3;

class FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {
           int[] res = new int[prices.length];
           for (int i = 0; i < prices.length; i++) {
               int tmp = 0;
               for (int j = i + 1; j < prices.length; j++) {
                   if (prices[i] >= prices[j]) {
                       tmp =  prices[j];
                       break;
                   }
               }
               res[i] = prices[i] - tmp;
           }
           return res;
       }
   }