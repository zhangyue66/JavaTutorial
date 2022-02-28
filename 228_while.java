class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ansList = new ArrayList<String>();
        if (nums.length==0) {
            return ansList;
        }
        
        if (nums.length==1) {
            ansList.add(Integer.toString(nums[0]));
            return ansList;
        }
        int i = 0;
        while (i<nums.length) {
            int num = nums[i];
            while (i<nums.length-1 && nums[i+1] - nums[i] == 1) {
                i ++;
            }
            if (nums[i] != num) {
                ansList.add(num + "->" + nums[i]);
            } else {
                ansList.add(Integer.toString(num));
            }
            i ++;
        }
        return ansList;
    }
}
