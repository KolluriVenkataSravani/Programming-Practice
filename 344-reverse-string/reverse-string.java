class Solution {
    public void reverseString(char[] s) {
        char a='a';
        int n=s.length;
        for(int i=0;i<n/2;i++){
            a=s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=a;
        }
    }
}