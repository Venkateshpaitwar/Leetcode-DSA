// 40. Combination Sum II

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, new ArrayList<>(), result, target);
        return result;
    }
    private void backtrack(int index, int[] nums,List<Integer> current, List<List<Integer>> result, int target){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = index ; i < nums.length; i++){
            if (i > index && nums[i] == nums[i - 1]) continue;
            if(nums[i] > target){
                break;
            }
            current.add(nums[i]);
            backtrack(i+1, nums, current, result, target - nums[i]);
            current.remove(current.size() - 1);
        }
    }
}