class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int longest=1;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        for(int num:nums){
            if(!st.contains(num-1)){
                int count=1;
                int no=num+1;
                while(st.contains(no)){
                    count+=1;
                    no+=1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}