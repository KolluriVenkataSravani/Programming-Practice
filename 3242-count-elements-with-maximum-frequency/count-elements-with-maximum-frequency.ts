function maxFrequencyElements(nums: number[]): number {
    let countMap=new Map<number,number>();
    for(const num of nums){
        countMap.set(num,(countMap.get(num)||0)+1);
    }
    const maxx=Math.max(...countMap.values());
    const frequency=[...countMap.values()].filter(x=>x===maxx);
    return frequency.length*maxx;
};