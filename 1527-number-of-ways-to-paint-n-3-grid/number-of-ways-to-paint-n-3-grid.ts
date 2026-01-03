function numOfWays(n: number): number {
    let a = 6, b = 6;
    const MOD=1000000007;
    for (let i = 2; i <= n; i++) {
        const a1 = (2 * a + 2 * b)%MOD;
        const b1 = (2 * a + 3 * b)%MOD;
        a = a1;
        b = b1;
    }
    return (a+b)%MOD;
};