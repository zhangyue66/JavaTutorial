class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for (int i=0;i<l.length;i++) {
            if (r[i]-l[i]<1) {
                ans.add(false);
            } else {
                int[] sub = Arrays.copyOfRange(nums,l[i],r[i]+1);
                ans.add(checkArithmetics(sub));
            }
        }
        return ans;
    }
    final private boolean checkArithmetics(int[] subArray) {
        Arrays.sort(subArray);
        for (int i=1;i<subArray.length;i++) {
            if (subArray[i]-subArray[i-1] != subArray[1]-subArray[0]) {
                return false;
            }
        }
        return true;
    }
}
