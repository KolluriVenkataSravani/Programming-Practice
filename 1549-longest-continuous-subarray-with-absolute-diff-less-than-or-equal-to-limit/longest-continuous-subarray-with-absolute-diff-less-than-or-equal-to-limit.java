class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxx = new LinkedList<>();
        Deque<Integer> minn = new LinkedList<>();
        int start = 0;
        int length = 0;
        for (int end = 0; end < nums.length; end++) {
            while (!maxx.isEmpty() && nums[end] > maxx.peekLast()) {
                maxx.pollLast();
            }
            maxx.offerLast(nums[end]);
            while (!minn.isEmpty() && nums[end] < minn.peekLast()) {
                minn.pollLast();
            }
            minn.offerLast(nums[end]);
            while (!maxx.isEmpty() && !minn.isEmpty() && (maxx.peekFirst() - minn.peekFirst() > limit)) {
                if (nums[start] == maxx.peekFirst()) {
                    maxx.pollFirst();
                }
                if (nums[start] == minn.peekFirst()) {
                    minn.pollFirst();
                }
                start++;
            }
            length = Math.max(length, end - start + 1);
        }  
        return length;
    }
}