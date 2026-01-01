function plusOne(digits: number[]): number[] {
    let ans=[];
    ans[0]=1;
    for(let i=digits.length-1;i>=0;i--){ 
        if(digits[i]<9){
            digits[i]+=1;
            return digits;
        }
        digits[i] = 0;
    }
    for(let i=1;i<=digits.length;i++){
        ans[i]=0;
    }
    return ans;
};