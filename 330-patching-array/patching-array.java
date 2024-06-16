class Solution {
    public int minPatches(int[] nums, int n) {
        long i=1;
        int j=0;
        int patches=0;
        while(i<=n){
            if(j<nums.length&&nums[j]<=i){
                i+=nums[j];
                j++;
            }else{
                i+=i;
                patches++;
            }
        }
        return patches;
    }
}