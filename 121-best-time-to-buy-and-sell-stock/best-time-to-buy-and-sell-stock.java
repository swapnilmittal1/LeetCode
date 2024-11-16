class Solution {
    public int maxProfit(int[] prices) {
        int price = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < price){
                price = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - price);
            }
        }
        return profit;
    }
}