class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],maxx=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(sum,0)+nums[i];
            maxx=Math.max(maxx,sum);
        }
        return maxx;
    }
}