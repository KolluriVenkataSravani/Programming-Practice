function repeatedNTimes(nums: number[]): number {
    const n=nums.length/2;
    // let countMap=new Map<number,number>();
    // for(let i=0;i<2n;i++){
    //     if(countMap[nums[i]]){
    //         let k=countMap.get(nums[i]);
    //         countMap.set(nums[i],k+1);
    //     }
    //     else{
    //         countMap.set(nums[i],1);
    //     }
    // }
    for(let i=0;i<nums.length;i++){
        const frequency=nums.filter(num=>num===nums[i]);
        if(frequency.length===n) return nums[i];
    }
    return -1;
};