function repeatedNTimes(nums: number[]): number {
    const n=nums.length/2;
    let countSet=new Set<number>();
    for(const num of nums){
        if(countSet.has(num)) return num;
        countSet.add(num);
    }
    // let countMap=new Map<number,number>();
    // for(const num of nums){
    //     countMap.set(num,(countMap.get(num)|| 0)+1);
    //     if(countMap.get(num)===n) return num;
    // }
    // for(let i=0;i<nums.length;i++){
    //     const frequency=nums.filter(num=>num===nums[i]);
    //     if(frequency.length===n) return nums[i];
    // }
    return -1;
};