class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        int count=0;
        int up=0;
        int left=0;
        int right=cols-1;
        int down=rows-1;
        while(count<(rows*cols)){
            for(int col=left;col<=right;col++){
                lst.add(matrix[up][col]);
                count++;
            }
            for(int row=up+1;row<=down;row++){
                lst.add(matrix[row][right]);
                count++;
            }
            if(up!=down){
                for(int col=right-1;col>=left;col--){
                    lst.add(matrix[down][col]);
                    count++;
                }
            }
            if(left!=right){
                for(int row=down-1;row>up;row--){
                    lst.add(matrix[row][left]);
                    count++;
                }
            }
            up++;
            left++;
            right--;
            down--;
        }
        return lst;
    }
}