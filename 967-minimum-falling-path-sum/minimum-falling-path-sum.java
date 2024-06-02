class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][] dp=new int[n][n];
        for(int j=0;j<n;j++){
            dp[0][j]=matrix[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int a=dp[i-1][j];
                if(j>0){
                    a=Math.min(a,dp[i-1][j-1]);
                }
                if(j<n-1){
                    a=Math.min(a,dp[i-1][j+1]);
                }
                dp[i][j]=matrix[i][j]+a;
            }
        }
        int sum=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            sum=Math.min(sum,dp[n-1][j]);
        }
        return sum;
    }
}