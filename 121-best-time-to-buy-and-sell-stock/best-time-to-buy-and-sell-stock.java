class Solution {
    public int maxProfit(int[] prices) {
        int max_price = 0;
        int buy_price = prices[0];
        for(int i=1;i<prices.length;i++){
            int cur_profit = prices[i]-buy_price;

            if(cur_profit>max_price){
                max_price = cur_profit;
            }
            if(prices[i]<buy_price){
                buy_price = prices[i];
            }
        }
      return max_price;  
    }
}