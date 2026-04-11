class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;

        for (int k = 0; k <= n; k++) {
            HashSet<Integer> set = new HashSet<>();
            boolean distinct = true;

            for (int i = k * 3; i < n; i++) {
                if (set.contains(nums[i])) {
                    distinct = false;
                    break;
                }
                set.add(nums[i]);
            }

            if (distinct) return k;
        }

        return 0;
    }
}