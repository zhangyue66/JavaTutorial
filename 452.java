class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if (n == 1) {
            return 1;
        }
        Arrays.sort(points,(a, b) -> a[1] - b[1]);
        
        int arrow_cnt = 1;
        int arrow_pos = points[0][1];
        for (int i=1;i<n;i++) {
            if (arrow_pos >= points[i][0]) {
                continue;
            }
            arrow_cnt ++;
            arrow_pos = points[i][1];
        }
        return arrow_cnt;
    }
}
