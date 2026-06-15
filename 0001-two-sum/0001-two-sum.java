class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> hmap=new HashMap<>();
     int n=nums.length;
       for(int i=0;i<n;i++)
       {
        hmap.put(nums[i],i);
       }
       for(int i=0;i<n;i++)
       {
        int complement=target-nums[i];
        if(hmap.containsKey(complement)&&hmap.get(complement)!=i)
        {
            return new int[]{i,hmap.get(complement)};
        }
       }
       return new int[]{};
    }
}