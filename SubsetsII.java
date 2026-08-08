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

// class Solution {
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         Arrays.sort(nums);
//         List<List<Integer>> ans = new ArrayList<>();
//         findSubsets(0, nums, new ArrayList<>(), ans);
//         return ans;
//     }
//     private List<List<Integer>> findSubsets(int index, int[] nums, List<Integer> subset, List<List<Integer>> ans){
//         ans.add(new ArrayList <>(subset));
//         for(int i = index; i < nums.length; i++){
//             if(i != index && nums[i] == nums[i - 1]) continue;
//             subset.add(nums[i]);
//             findSubsets(i + 1, nums, subset, ans);
//             subset.remove(subset.size() - 1);
//         }
//         return ans;
//     }
// }