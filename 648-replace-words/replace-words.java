class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dictt=new HashSet<>(dictionary);
        StringBuilder sb=new StringBuilder();
        for(String word:sentence.split("\\s+")){
            String prefix="";
            for(int i=1;i<=word.length();i++){
                prefix=word.substring(0,i);
                if(dictt.contains(prefix)){
                    break;
                }
            }
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(prefix);
        }
        return sb.toString();
    }
}