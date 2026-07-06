// 1288. Remove Covered Intervals

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        ArrayList<int []> list = new ArrayList<>();
        
        for(int[] interval : intervals){
            list.add(interval);
        }

        for(int i = 0; i < intervals.length; i++){
            for(int j = 0; j < intervals.length; j++){
                if(j != i){
                    if(intervals[i][0] >= intervals[j][0] && intervals[i][1] <= intervals[j][1]){
                        list.remove(intervals[i]);
                        break;
                    }
                }
            }
        }
        return list.size();
    }
}