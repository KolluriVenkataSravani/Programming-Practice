class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> pal=new HashSet<>();
        int len=0;
        for(char c:s.toCharArray()){
            if(pal.contains(c)){
                pal.remove(c);
                len+=2;
            }else{
                pal.add(c);
            }
        }
        if(!pal.isEmpty()){
            len+=1;
        }
        return len;
    }
}