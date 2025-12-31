function wordPattern(pattern: string, s: string): boolean {
    const parray=pattern.split("");
    const sarray=s.split(" ");
    if(parray.length!==sarray.length){
        return false;
    }
    let sp_map=Object.create(null);
    let ps_map=Object.create(null);
    for(let i=0;i<parray.length;i++){
        const w=sarray[i];
        const p=parray[i];
        if(ps_map[p] && ps_map[p]!==w){
            return false;
        }
        if(sp_map[w] && sp_map[w]!==p){
            return false;
        }
        ps_map[p]=w;
        sp_map[w]=p;
    }
    let newArray=parray.map(pat=>ps_map[pat]);
    return newArray.join(" ")===sarray.join(" ");
};