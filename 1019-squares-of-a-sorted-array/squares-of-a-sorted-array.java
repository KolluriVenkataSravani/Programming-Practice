class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] res=new int[n];
        int l=0;
        int r=n-1;
        int index=n-1;
        while(l<=r){
            int sqofleft=nums[l]*nums[l];
            int sqofright=nums[r]*nums[r];
            if(sqofright>sqofleft){
                res[index]=sqofright;
                r--;
            }
            else{
                res[index]=sqofleft;
                l++;
            }
            index--;
        }
        return res;
    }
}