class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length,cols=grid[0].length;
        int fresh=0;
        Queue<int[]> rotten=new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    rotten.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh+=1;
                }
            }
        }
        int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
        int count=0;
        while(!rotten.isEmpty() && fresh!=0){
            count+=1;
            int size=rotten.size();
            for(int i=0;i<size;i++){
                int[] cell=rotten.poll();
                int r=cell[0],c=cell[1];
                for(int[] d:directions){
                    int nr=r+d[0];
                    int nc=c+d[1];
                    if(nr>=0 && nr<rows && nc>=0 && nc<cols && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh-=1;
                        rotten.offer(new int[]{nr,nc});
                    }
                }
            }
        }
        return fresh==0 ? count : -1;
    }
}