class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        int[][] result = new int[n][2];
        int count = 0;

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                result[count][0] = start;
                result[count][1] = end;
                count++;

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        result[count][0] = start;
        result[count][1] = end;
        count++;

        return Arrays.copyOf(result, count);
    }
}

        
    
