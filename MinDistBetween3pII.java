//3741. Minimum Distance Between Three Equal Elements II

import java.util.*;
class Solution {
    public int minimumDistance(int[] nums) {
        Map < Integer, List<Integer>> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            List<Integer> list = map.computeIfAbsent(nums[i], k -> new ArrayList<>());
            list.add(i);
            if(list.size() >= 3){
                int size = list.size();
                int dist = 2*(list.get(size - 1) - list.get(size - 3));
                minDist = Math.min(minDist, dist);
            }
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}