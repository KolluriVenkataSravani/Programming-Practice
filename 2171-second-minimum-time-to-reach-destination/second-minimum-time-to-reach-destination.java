class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a=edge[0],b=edge[1];
            graph.computeIfAbsent(a,value->new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b,value->new ArrayList<Integer>()).add(a);
        }
        int[] d1=new int[n+1],d2=new int[n+1],count=new int[n+1];
        for (int i=1;i<=n;i++) {
            d1[i]=d2[i]=Integer.MAX_VALUE;
            count[i]=0;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{1, 0});
        d1[1] = 0;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cv = curr[0];
            int ct = curr[1];
            count[cv]++;
            if(count[cv]==2 && cv==n){
                return ct;
            }
            if ((ct / change) % 2==1) {
                ct = (ct / change + 1) * change+time;
            }else{
                ct+=time;
            }
            if(!graph.containsKey(cv)){
                continue;
            }
            for(int nb:graph.get(cv)){
                if(count[nb]==2){
                    continue;
                }
                if (d1[nb]>ct) {
                    d2[nb] = d1[n];
                    d1[nb]=ct;
                    pq.offer(new int[]{nb, ct});
                } else if (d2[nb]>ct && d1[nb]!=ct) {
                    d2[nb]=ct;
                    pq.offer(new int[]{nb, ct});
                }
            }
        }
        return 0;
    }
}