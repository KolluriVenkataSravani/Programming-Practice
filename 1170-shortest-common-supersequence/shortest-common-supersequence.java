class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m=str1.length(),n=str2.length();
        int[][] dp=new int[m+1][n+1];
        if (m == 0) return str2;
        if (n == 0) return str1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=m,j=n;
        while(i>0&&j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                sb.append(str1.charAt(i-1));   
                i--;
                j--;             
            }else if(dp[i-1][j]<dp[i][j-1]){
                sb.append(str2.charAt(j-1)); 
                j--;
            }else{
                sb.append(str1.charAt(i-1));
                i--;
            }
        }
        
        while(i>0){
            sb.append(str1.charAt(i-1));
            i--;
        }
        while(j>0){
            sb.append(str2.charAt(j-1));
            j--;
        }
        return sb.reverse().toString();
    }
}