function numOfBurgers(tomatoSlices: number, cheeseSlices: number): number[] {
    if (tomatoSlices % 2 !== 0 || cheeseSlices>(tomatoSlices/2)) { 
        return []; 
    };
    const jumbo = (tomatoSlices / 2) - cheeseSlices;
    const small = cheeseSlices - jumbo;
    if(jumbo<0 || small<0){
        return [];
    }
    return [jumbo, small];
};