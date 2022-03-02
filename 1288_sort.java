class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        if (intervals.length == 1) {
            return 1;
        }
        Arrays.sort(intervals,(a,b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1],a[1]);
            } else {
                return Integer.compare(a[0],b[0]);
            }
        });
        //System.out.println(Arrays.deepToString(intervals));
        int ans=1,start=intervals[0][0],end=intervals[0][1];
        for (int i=1;i < intervals.length;i++) {
            if (end < intervals[i][1]) {
                ans += 1;
                end = intervals[i][1];
            } else {
                continue;
            }
        }
        return ans;
    }
}
