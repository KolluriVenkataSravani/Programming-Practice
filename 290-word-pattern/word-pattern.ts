function wordPattern(pattern: string, s: string): boolean {
    const parray=pattern.split("");
    const sarray=s.split(" ");
    if(parray.length!==sarray.length){
        return false;
    }
    let sp_map=new Map<string, string>();
    let ps_map=new Map<string, string>();
    for(let i=0;i<parray.length;i++){
        const w=sarray[i];
        const p=parray[i];
        if(ps_map.has(p) && ps_map.get(p) !==w){
            return false;
        }
        if(sp_map.has(w) && sp_map.get(w)!==p){
            return false;
        }
        ps_map.set(p,w);
        sp_map.set(w,p);
    }
    return true;
};