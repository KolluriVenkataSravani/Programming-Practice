class Solution {
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        if(n==1){
            return Math.max(0,grid[0][0]);
        }
        int[][][] dp=new int[50][50][50];
        dfs(grid,0,0,0,dp,n);
        return Math.max(0,dp[0][0][0]);
    }
    public int dfs(int[][] grid,int r1,int c1,int c2,int[][][] dp,int n){
        int r2=r1+c1-c2;
        if(r1>=n || r2>=n || c1>=n || c2>=n || grid[r1][c1]==-1 || grid[r2][c2]==-1){
            return Integer.MIN_VALUE;
        }
        if(dp[r1][c1][c2]!=0){
            return dp[r1][c1][c2];
        }
        if(r1==n-1 && c1==n-1){
            return grid[n-1][n-1];
        }
        int ans=grid[r1][c1];
        if(c1!=c2){
            ans+=grid[r2][c2];
        }
        int dd=dfs(grid,r1+1,c1,c2,dp,n);
        int rd=dfs(grid,r1,c1+1,c2,dp,n);
        int dr=dfs(grid,r1+1,c1,c2+1,dp,n);
        int rr=dfs(grid,r1,c1+1,c2+1,dp,n);
        return dp[r1][c1][c2]=Math.max(dd,Math.max(Math.max(rd,dr),rr))+ans;
    }
}