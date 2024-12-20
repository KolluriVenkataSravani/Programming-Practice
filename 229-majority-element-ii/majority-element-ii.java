class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int count1=0;
        int count2=0;
        int e1=Integer.MIN_VALUE;
        int e2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=e2){
                count1=1;
                e1=nums[i];
            }else if(count2==0 && nums[i]!=e1){
                count2=1;
                e2=nums[i];
            }else if(e1==nums[i]){
                count1++;
            }else if(e2==nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(e1==nums[i]){
                c1++;
            }else if(e2==nums[i]){
                c2++;
            }
        }
        int min=(int) (nums.length/3)+1;
        if(c1>=min){
            ans.add(e1);
        }
        if(c2>=min){
            ans.add(e2);
        }
        return ans;
    }
}