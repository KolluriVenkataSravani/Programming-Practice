class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:words[0].toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for(int i=1;i<words.length;i++){
            Map<Character,Integer> currFreq=new HashMap<>();
            for(char c:words[i].toCharArray()){
                currFreq.put(c,currFreq.getOrDefault(c,0)+1);
            }
            for(char c:freq.keySet()){
                if(currFreq.containsKey(c)){
                    freq.put(c,Math.min(freq.get(c),currFreq.get(c)));
                }else{
                    freq.put(c,0);
                }
            }
        }
        List<String> result=new ArrayList<>();
        for(Map.Entry<Character,Integer> e:freq.entrySet()){
            for(int i=0;i<e.getValue();i++){
                result.add(String.valueOf(e.getKey()));
            }
        }
        return result;
    }
}