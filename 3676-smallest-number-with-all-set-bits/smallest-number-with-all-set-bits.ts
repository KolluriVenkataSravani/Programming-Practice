function smallestNumber(n: number): number {
    var ans=1;
    while(ans<n){
        ans=(ans<<1) | 1;
    }
    return ans;
};