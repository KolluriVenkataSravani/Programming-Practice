class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length){
            return false;
        }
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:target){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int j:arr){
            if(!mp.containsKey(j)){
                return false;
            }
            mp.put(j,mp.get(j)-1);
            if(mp.get(j)==0){
                mp.remove(j);
            }
        }
        return mp.isEmpty();
    }
}