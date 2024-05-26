class Solution {
    public int majorityElement(int[] nums) {
     Map<Integer,Integer> mp=new HashMap<>();
     int n=nums.length;
     for(int i=0;i<n;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
     }
     n=n/2;
     for(Map.Entry<Integer,Integer> e:mp.entrySet()){
        if(e.getValue()>n){
            return e.getKey();
        }
     }
     return 0;
    }
}