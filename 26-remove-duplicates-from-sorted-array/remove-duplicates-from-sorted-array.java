class Solution {
    public int removeDuplicates(int[] nums) {
        int first=0;
        for(int second=1;second<nums.length;second++){
            if(nums[second]>nums[first]){
                first=first+1;
                nums[first]=nums[second];
            }
        }
        return first+1;
    }
}