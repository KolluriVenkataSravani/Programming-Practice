class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<=1 || nums==null){
            return nums;
        }
        int max=nums[0],min=nums[0];
        for(int num:nums){
            if(num>max) max=num;
            if(num<min) min=num;
        }
        int range=max-min+1;
        int[] freq=new int[range];
        for(int num:nums){
            freq[num-min]++;
        }
        int pos=0;
        for(int i=0;i<range;i++){
            int count=freq[i];
            while(count>0){
                nums[pos++]=i+min;
                count--;
            }
        }
        return nums;
    }
}