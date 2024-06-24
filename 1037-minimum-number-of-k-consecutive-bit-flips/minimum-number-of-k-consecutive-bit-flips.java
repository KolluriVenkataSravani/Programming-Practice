class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int flips = 0;
        int count = 0;
        int[] flip = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i >= k) {
                count -= flip[i - k];
            }   
            if ((nums[i] + count) % 2 == 0) {
                if (i + k > n) {
                    return -1;
                }
                flips++;
                count++;
                flip[i] = 1;
            }
        }
        return flips;
    }
}