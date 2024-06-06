class RandomizedSet {

    public RandomizedSet() {
        
    }
    private Map<Integer,Integer> valMap=new HashMap<>();
    private List<Integer> vals=new ArrayList<>();
    private Random rand=new Random();
    public boolean insert(int val) {
        if(valMap.containsKey(val)){
            return false;
        }
        valMap.put(val,vals.size());
        vals.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!valMap.containsKey(val)){
            return false;
        }
        final int index=valMap.get(val);
        valMap.put(last(vals),index);
        valMap.remove(val);
        vals.set(index,last(vals));
        vals.remove(vals.size()-1);
        return true;
    }
    
    public int getRandom() {
        final int index=rand.nextInt(vals.size());
        return vals.get(index);
    }

    public int last(List<Integer> vals){
        return vals.get(vals.size()-1);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */