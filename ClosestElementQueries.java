// 3488. Closest Equal Element Queries

import java.util.*;
class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        List <Integer> result = new ArrayList<>();
        for(int q : queries){
            int val = nums[q];
            List<Integer> list = map.get(val);
            if(list.size() == 1){
                result.add(-1);
                continue;
            }
            int pos = Collections.binarySearch(list, q);
            int minDist = Integer.MAX_VALUE;
            int size = list.size();

            // previous index (circular)
            int prev = list.get((pos - 1 + size) % size);
            int distPrev = Math.abs(q - prev);
            distPrev = Math.min(distPrev, n - distPrev);
            
            // next index (circular)
            int next = list.get((pos + 1) % size);
            int distNext = Math.abs(q - next);
            distNext = Math.min(distNext, n - distNext);

            minDist = Math.min(distPrev, distNext);
            result.add(minDist);
        }
        return result;
    }
}