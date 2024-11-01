class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int price = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < price){
                price = prices[i];
            } else if(max <  prices[i] - price){
                max = prices[i] - price;
            }
        }

        return max;
    
    }
}