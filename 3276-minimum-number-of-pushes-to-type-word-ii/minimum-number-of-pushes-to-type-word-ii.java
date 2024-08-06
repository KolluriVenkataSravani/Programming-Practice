class Solution {
    public int minimumPushes(String word) {
        int keys = 0;
        int tries = 0;
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        for (int i = 25; i >= 0; i--) {
            if (freq[i] > 0) {
                keys += freq[i] * (tries / 8 + 1);
                tries++;
            }
        }

        return keys;
    }
}