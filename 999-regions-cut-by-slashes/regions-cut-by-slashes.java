class Solution {
    public int regionsBySlashes(String[] grid) {
        int n=grid.length;
        int s=n*3;
        int[][] matrix=new int[s][s];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i].charAt(j)=='/'){
                    matrix[i*3][j*3+2]=1;
                    matrix[i*3+1][j*3+1]=1;
                    matrix[i*3+2][j*3]=1;
                }
                else if(grid[i].charAt(j)=='\\'){
                    matrix[i*3][j*3]=1;
                    matrix[i*3+1][j*3+1]=1;
                    matrix[i*3+2][j*3+2]=1;
                }
            }
        }
        int areas=0;
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(matrix[i][j]==0){
                    areas++;
                    dfs(matrix,i,j);
                }
            }
        }
        return areas;
    }
    public void dfs(int[][] matrix,int i,int j){
        int n=matrix.length;
        if(i<0||i>=n||j<0||j>=n||matrix[i][j]!=0){
            return;
        }
        matrix[i][j]=1;
        dfs(matrix,i+1,j);
        dfs(matrix,i-1,j);
        dfs(matrix,i,j-1);
        dfs(matrix,i,j+1);
    }
}