class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] n1=Arrays.copyOfRange(nums1,0,m);
        int p=0;
        int q=0;
        for(int i=0;i<m+n;i++){
            if(q>=n || p<m && n1[p]<nums2[q]){
                nums1[i]=n1[p];
                p++;
            }else{
                nums1[i]=nums2[q];
                q++;
            }
        }
    }
}