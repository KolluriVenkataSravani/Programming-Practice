class Solution {
    public int maxSubArray(int[] nums) {
        long sum=0;
        long maxx=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxx){
                maxx=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return (int) maxx;
    }
}