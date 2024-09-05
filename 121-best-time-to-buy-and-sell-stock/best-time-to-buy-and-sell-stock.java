class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=0,sell=1;
        while(sell<prices.length){
            int diff=prices[sell]-prices[buy];
            if(prices[buy]<prices[sell]){
                profit=Math.max(profit,diff);
            }else{
                buy=sell;
            }
            sell+=1;
        }
        return profit;
    }
}