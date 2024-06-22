class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, count1 = 0, res = 0;
        int[] dp = new int[nums.length + 1];
        dp[0] = 1;
        for (int num : nums) {
            if (num % 2 != 0) {
                count1++;
            }

            if (count1 >= k) {
                res += dp[count1 - k];
            }
            dp[count1]++;
        }

        return res;
    }
}