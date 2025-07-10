package com.dsa.patterns.arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currProfit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            currProfit = prices[i] - min;
            maxProfit = Math.max(currProfit, maxProfit);
        }
        return maxProfit;
    }
}
