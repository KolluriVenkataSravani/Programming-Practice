function sumFourDivisors(nums: number[]): number {
    let summ=0;
    for(let num of nums){
        let divisors: number[]=[];
        for(let i=2;i*i<=num;i++){
            if(num%i===0){
                divisors.push(i);
                if(i!==(num/i)){
                    divisors.push(num/i);
                }
                if(divisors.length>2) break;
            }
        }
        if(divisors.length===2){
            summ+=1+divisors[0]+divisors[1]+num;
        }
    }
    return summ;
};
