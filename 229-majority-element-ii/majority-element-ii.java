class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        int min=(int) Math.floor(nums.length/3)+1;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])==min){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}