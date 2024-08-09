class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                if (isMatch(grid, i, j)) { 
                    count++;
                }
            }
        }
        return count;
    }
    private boolean isMatch(int[][] grid, int row, int col) {
        int[] nums = new int[9];
        int pos = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                nums[pos++] = grid[i][j];
            }
        }
        boolean[] visited = new boolean[10];
        for (int num : nums) {
            if (num < 1 || num > 9 || visited[num]) {
                return false;
            }
            visited[num] = true;
        }
        int sum = nums[0] + nums[1] + nums[2];
        if (nums[3] + nums[4] + nums[5] != sum) return false;
        if (nums[6] + nums[7] + nums[8] != sum) return false;
        if (nums[0] + nums[3] + nums[6] != sum) return false;
        if (nums[1] + nums[4] + nums[7] != sum) return false;
        if (nums[2] + nums[5] + nums[8] != sum) return false;
        if (nums[0] + nums[4] + nums[8] != sum) return false;
        if (nums[2] + nums[4] + nums[6] != sum) return false;
        return true;
    }
}