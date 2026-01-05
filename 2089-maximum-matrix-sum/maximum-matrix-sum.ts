function maxMatrixSum(matrix: number[][]): number {
    let totalSum=0;
    let negCount=0;
    let rows=matrix.length;
    let cols=matrix[0].length;
    let minVal=Infinity;
    
    for(let i=0;i<rows;i++){
        for(let j=0;j<cols;j++){
            totalSum+=Math.abs(matrix[i][j]);
            minVal=Math.min(minVal,Math.abs(matrix[i][j]));
            if(matrix[i][j]<0){
                negCount+=1;
            }
        }
    }
    if(negCount%2!==0){
        totalSum-=2*minVal;
    }
    return totalSum;
};