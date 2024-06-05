class Solution {
    public int[][] heights;
    public boolean[][] pacific,atlantic;
    public int rows,cols;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights=heights;
        if(heights==null || heights.length==0){
            return new ArrayList<>();
        }
        rows=heights.length;
        cols=heights[0].length;
        pacific=new boolean[rows][cols];
        atlantic=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            dfs(i,0,pacific);
            dfs(i,cols-1,atlantic);
        }
        for(int j=0;j<cols;j++){
            dfs(0,j,pacific);
            dfs(rows-1,j,atlantic);
        }
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }

    public void dfs(int r,int c,boolean[][] flag){
        flag[r][c]=true;
        int[][]directions={{1,0},{0,1},{-1,0},{0,-1}};
        for(int[] d:directions){
            int nr=r+d[0];
            int nc=c+d[1];
            if(nr>=0 && nr<rows && nc>=0 && nc<cols && !flag[nr][nc] && heights[nr][nc]>=heights[r][c]){
                dfs(nr,nc,flag);
            }
        }
    }
}