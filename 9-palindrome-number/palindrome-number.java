class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int num=x;
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        while(x>0){
            int digit=x%10;
            reverse=reverse*10+digit;
            x=x/10;
        }
        if(reverse==num){
            return true;
        }
        else{
            return false;
        }
    }
}