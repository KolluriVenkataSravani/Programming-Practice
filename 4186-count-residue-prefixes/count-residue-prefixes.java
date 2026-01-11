class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> st=new HashSet<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
            res+=(i+1)%3==st.size()?1:0;
        }
        return res;
    }
}