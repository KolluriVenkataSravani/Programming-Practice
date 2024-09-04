class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int c1=0;
        for(int i:nums){
            if(i==1){
                count++;
                c1=Math.max(c1,count);
            }else{
                count=0;
            }
        }
        return c1;
    }
}