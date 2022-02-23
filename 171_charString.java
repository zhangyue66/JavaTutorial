class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int n = columnTitle.length();
        int scale = 1;
        for (int i = n-1;i >=0;i--) {
            char ch = columnTitle.charAt(i);
            ans += ((int) ch - (int) 'A' + 1)*scale;
            scale *= 26;
        }
        return ans;
    }
}
