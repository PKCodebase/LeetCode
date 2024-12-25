package com.leetcode;

public class BuySellAndStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int currentprofit = prices[i] - min;
            if(currentprofit>max){
                max=currentprofit;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        BuySellAndStock buySellAndStock = new BuySellAndStock();
        int result = buySellAndStock.maxProfit(prices);
        System.out.println(result);

    }
}
