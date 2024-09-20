class Solution {
    public int longestConsecutive(int[] nums) {
        int maxx=0;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        for(int num:st){
            if(!st.contains(num-1)){
                int n=num;
                int count=1;
                while(st.contains(n+1)){
                    n=n+1;
                    count+=1;
                }
                maxx=Math.max(maxx,count);
            }
        }
        return maxx;
    }
}