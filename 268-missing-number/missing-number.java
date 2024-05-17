class Solution {
    public int missingNumber(int[] nums) {
        // int max=0;
        // for(int num:nums){
        //     if(num>max){
        //         max=num;
        //     }
        // }
        int lengthh=nums.length;
    
        for(int j=0;j<lengthh;j++){
            Arrays.sort(nums);
            if(j==nums[j]){
                continue;
            }else{
                return j;
            }
        }
        return lengthh;
    }
}