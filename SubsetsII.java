// 90. Subsets II
import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        int total = 1 << n;

        for(int mask = 0; mask < total; mask++){
            List<Integer> subsets = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if((mask & (1 << i)) != 0){
                    subsets.add(nums[i]);
                }
            }        
            set.add(subsets);
        }
        return new ArrayList<>(set);
    }
}