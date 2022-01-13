class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if (n <= 1) {
            return 0;
        }
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int removed = 1;
        int removed_end = intervals[0][1];
        for (int i=1;i<n;i++) {
            if (removed_end > intervals[i][0]) {
                continue;
            }
            removed_end = intervals[i][1];
            removed ++;
        }
        return n-removed;
    }
}
