class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer> lst=new ArrayList<>();
        for(int i:nums){
            lst.add(i);
        }
        Collections.sort(lst,new Comparator<Integer>(){
            public int compare(Integer m,Integer n){
                int fm=mp.get(m);
                int fn=mp.get(n);
                if(fm!=fn){
                    return fm-fn;
                }else{
                    return n-m;
                }
            }
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=lst.get(i);
        }
        return nums;
    }
}