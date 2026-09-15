// 435. Non-overlapping Intervals

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int n = intervals.length;
        int removed = 0;
        int prevEnd = intervals[0][1];
        for(int i = 1; i < n; i++){
            if(intervals[i][0] < prevEnd){
                removed++;
            }else{
                prevEnd = intervals[i][1];
            }
        }
        return removed;
    }
}