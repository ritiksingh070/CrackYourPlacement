// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/


class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxPro = 0;
        int min = prices[0];
        for(int i = 1;i<n;i++){
            if(prices[i] > min){
                maxPro = Math.max(maxPro,prices[i] - min);
            }
            if(min > prices[i]) min = prices[i];
        }
        return maxPro;
    }
}