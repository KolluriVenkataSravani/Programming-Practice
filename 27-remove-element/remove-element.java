class Solution {
    public int removeElement(int[] nums, int val) {
        int first=0;
        for(int second=0;second<nums.length;second++){
            if(nums[second]!=val){
                nums[first]=nums[second];
                first++;
            }
        }
        return first;
    }
}
