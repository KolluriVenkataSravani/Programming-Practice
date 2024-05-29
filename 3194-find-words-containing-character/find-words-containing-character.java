class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(char ch:word.toCharArray()){
                if(ch==x){
                    lst.add(i);
                    break;
                }
            }
        }
        return lst;
    }
}