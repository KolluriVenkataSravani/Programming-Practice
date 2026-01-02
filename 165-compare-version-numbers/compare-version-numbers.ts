function compareVersion(version1: string, version2: string): number {
    const v1=version1.split(".");
    const v2=version2.split(".");
    const maxx=Math.max(v1.length,v2.length);
    for(let i=0;i<maxx;i++){
        const n1=i<v1.length?Number(v1[i]):0;
        const n2=i<v2.length?Number(v2[i]):0;
        if(n1>n2) return 1;
        if(n1<n2) return -1;
    }
    return 0;
};