class Solution {
    public int rows;
    public int cols;
    public void dfs(char[][] grid,int r,int c){
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
            return;
        }
        grid[r][c]='0';
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
    }
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length == 0){
            return 0; 
        }
        rows=grid.length;
        cols=grid[0].length;
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    count+=1;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
}