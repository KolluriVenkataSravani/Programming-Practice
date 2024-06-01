class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Set<Integer> travel=new HashSet<>();
        for(int day:days){
            travel.add(day);
        }
        int[] dp=new int[366];
        for(int i=1;i<=365;i++){
            if(!travel.contains(i)){
                dp[i]=dp[i-1];
            }else{
                int cost1=dp[i-1]+costs[0];
                int cost7=dp[Math.max(0,i-7)]+costs[1];
                int cost30=dp[Math.max(0,i-30)]+costs[2];
                dp[i]=Math.min(Math.min(cost1,cost7),cost30);
            }
        }
        return dp[365];
    }
}