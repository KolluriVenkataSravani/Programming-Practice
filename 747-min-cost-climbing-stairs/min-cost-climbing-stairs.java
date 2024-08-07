class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // if(n<=1){
        //     return cost[n];
        // }
        int n=cost.length;
        int[] dp=new int[n+1];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<=n;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+(i==n?0:cost[i]);
        }
        return dp[n];
    }
}