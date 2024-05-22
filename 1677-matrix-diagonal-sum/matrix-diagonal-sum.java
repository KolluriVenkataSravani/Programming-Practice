class Solution {
    public int diagonalSum(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int sum=0;
        for(int i=0;i<r;i++){
            int pd=mat[i][i];
            int col=c-i-1;
            int sd=mat[i][col];
            sum+=pd;
            if(i!=col){
                sum+=sd;
            }     
        }
        return sum;
    }
}