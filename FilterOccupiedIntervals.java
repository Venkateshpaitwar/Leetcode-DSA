// 3975. Filter Occupied Intervals

class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        List<int[]> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int[] interval : occupiedIntervals){
            if(list.isEmpty() || list.get(list.size() - 1)[1] + 1 < interval[0]){
                list.add(new int[] {interval[0], interval[1]});
            }else{
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], interval[1]);   
            }
        }
        for(int[] interval : list){
            int l = interval[0];
            int r = interval[1];
            if(l > freeEnd || r < freeStart){
                result.add(Arrays.asList(l, r));
            }else{
                if(l < freeStart){
                    result.add(Arrays.asList(l, freeStart - 1));
                }
                if(r > freeEnd){
                    result.add(Arrays.asList(freeEnd + 1, r));
                }
            }
        }
        return result;
    }
}