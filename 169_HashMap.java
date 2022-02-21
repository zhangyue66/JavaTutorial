class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> maps = new HashMap<Integer,Integer>();
        for (int i=0;i<n;i++) {
            if (maps.containsKey(nums[i])) {
                maps.put(nums[i],maps.get(nums[i])+1);
            } else {
                maps.put(nums[i],1);
            }
            if (maps.get(nums[i]) > n/2) {
                return nums[i];
            }
        }
        return -1;
    }
}
