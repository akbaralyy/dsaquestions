class Solution {
    public static void main(String[] args) {
        int [] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

        static int maxProfit(int[] prices) {
            int buy = 0;
            int buyIndex = 0;
            int sell = 0;
            int sellIndex = 0;
            int profit=0;
            for(int i=0;i<prices.length-1;i++){
                if(prices[i]<prices[i+1]){
                    buy = prices[i];
                    buyIndex = i;
                }

            }
            for(int i=buyIndex;i<prices.length-1;i++){
                if(buy<prices[i] && sell<prices[i] ){
                    sell = prices[i];
                    sellIndex = i;
                }

            }

      if(sell > buy){
          return sell -buy;
      }
      return 0;

        }
    }