class Solution {
    public int maxProfit(int[] prices) {
        int price = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < price){
                price = prices[i];
            } else if(prices[i] - price > profit){
                profit = prices[i] - price;
            }
        }
        return profit;
    }
}