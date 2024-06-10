class Solution {
    public int heightChecker(int[] heights) {
        int[] orig=Arrays.copyOf(heights,heights.length);
        Arrays.sort(orig);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=orig[i]){
                count++;
            }
        }
        return count;
    }
}