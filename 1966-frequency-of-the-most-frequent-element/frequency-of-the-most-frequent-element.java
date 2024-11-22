class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total=0;
        int left=0;
        int maxx=0;
        for(int right=0;right<nums.length;right++){
            total+=nums[right];
            long operations=(long) nums[right]*(right-left+1)-total;
            while(operations>k && left <= right){
                total-=nums[left];
                left++;
                operations=(long) nums[right]*(right-left+1)-total;
            }
            maxx=Math.max(maxx,(right-left+1));
        }
        return maxx;
    }
}