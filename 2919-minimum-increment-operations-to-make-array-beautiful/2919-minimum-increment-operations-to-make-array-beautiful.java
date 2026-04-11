class Solution {
    public long minIncrementOperations(int[] nums, int k) {
        int n = nums.length;
        
        long dp0 = 0, dp1 = 0, dp2 = 0;
        
        for (int i = 0; i < n; i++) {
            long cost = Math.max(0, k - nums[i]); // cost to make nums[i] >= k
            
            long newDp0 = dp1;
            long newDp1 = dp2;
            long newDp2 = Math.min(dp0, Math.min(dp1, dp2)) + cost;
            
            dp0 = newDp0;
            dp1 = newDp1;
            dp2 = newDp2;
        }
        
        return Math.min(dp0, Math.min(dp1, dp2));
    }
}