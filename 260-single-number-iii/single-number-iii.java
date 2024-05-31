class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int set=xor & -xor;
        int a=0,b=0;
        for(int num:nums){
            if((num&set)!=0){
                a^=num;
            }else{
                b^=num;
            }
        }
        return new int[]{a,b};
    }
}