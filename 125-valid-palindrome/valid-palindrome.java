class Solution {
    public boolean palindrome(int i,String s){
        if(i>=(s.length()/2)) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return palindrome(i+1,s);
    }
    public boolean isPalindrome(String s) {
        int i=0;
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       return palindrome(i,s);
    }
}