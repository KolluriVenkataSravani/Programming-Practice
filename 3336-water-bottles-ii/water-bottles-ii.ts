function maxBottlesDrunk(numBottles: number, numExchange: number): number {
    var emptyCount = numBottles;
    var drunkCount = numBottles;
    while(emptyCount>=numExchange){
        drunkCount= drunkCount + 1;
        emptyCount-=numExchange;
        emptyCount+=1;
        numExchange+=1;
    }
    return drunkCount;
};