class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String i:details){
            char n1=i.charAt(11);
            char n2=i.charAt(12);
            if(n1>'6' || (n1=='6' && n2>='1')){
                count++;
            }
        }
        return count;
    }
}