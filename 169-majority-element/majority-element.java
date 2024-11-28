class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            if(mp.containsKey(num)){
                mp.put(num,mp.getOrDefault(num,0)+1);
            }else{
                mp.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()>(nums.length/2)){
                return e.getKey();
            }
        }
        return -1;
    }
}