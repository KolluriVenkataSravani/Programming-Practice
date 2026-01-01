function checkOne(x: string[]):boolean{
    for(let i=0;i<=x.length-1;i++){
        if(x[i]!=="1"){
            return false;
        }
    }
    return true;
}
function smallestNumber(n: number): number {
    var y=n;
    while(y>=n){
        const output=y.toString(2);
        const x=output.split("");
        if(checkOne(x)){
            return y;
        }
        y++;
    }
    return -1;
};