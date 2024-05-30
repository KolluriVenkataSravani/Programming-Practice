class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int mid=0;mid<2*n-1;mid++){
            int i=mid/2;
            int j=i+mid%2;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                count++;
                i--;
                j++;
            }
        }
        return count;
    }
}