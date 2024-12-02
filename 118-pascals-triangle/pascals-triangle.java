class Solution {
    public List<Integer> generateRow(int row){
        List<Integer> temp=new ArrayList<>();
        int val=1;
        temp.add(1);
        for(int col=1;col<row;col++){
            val*=(row-col);
            val/=col;
            temp.add(val);
        }
        return temp;     
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            ans.add(generateRow(row));
        }
        return ans;
    }
}