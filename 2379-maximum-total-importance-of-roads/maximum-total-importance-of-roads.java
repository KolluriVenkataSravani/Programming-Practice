class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long ans=0,cost=1;
        long[] ways=new long[n];
        for(int[] d:roads){
            ways[d[0]]++;
            ways[d[1]]++;
        }
        Arrays.sort(ways);
        for(long way:ways){
            ans+=way*(cost++);
        }
        return ans;
    }
}