class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int min = prices[0];
        int maxPrice = 0;
        
        for(int i = 1; i< length; i++) {
            if(min > prices[i]) {
                min = prices[i];
            }
            else if(prices[i] - min > maxPrice) {
                maxPrice = prices[i] - min;
            }
        }
        return maxPrice;
    }
}