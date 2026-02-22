class Solution {
    public int binaryGap(int n) {
        int curr=0;
        int maxx=0;
        boolean flag=false;
        while(n>0){
            int bit=n%2;
            if(bit==1){
                if(flag){
                    maxx=Math.max(curr,maxx);
                }
                curr=1;
                flag=true;
            }else{
                if(flag){
                    curr+=1;
                }
            }
            n/=2;
        }
        return maxx;
    }
}