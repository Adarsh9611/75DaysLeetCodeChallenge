class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // Fixed: start j from i+1
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};  // Fixed: return indices as array
                }
                // Fixed: removed else { return null; } - don't exit prematurely
            }
        }
        return new int[]{};  // Return empty array if no solution found
    }
}