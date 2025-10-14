import java.util.*;

class solution{
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k){
        int n = nums.size();
        if(n < 2*k){
            return false;
        }
        for(int i = 0; i<= n-2*k; i++){
            if(isIncreasing(nums, i, k) && isIncreasing(nums, i+k, k)){
                return true;
            }
        }
        return true;
    }
    private boolean isIncreasing(List<Integer> nums, int start, int k){
        for(int i= start + 1; i<start + k; i++){
            if(nums.get(i) <= nums.get(i-1)){
                return false;
            }
        }
        return true;
    }
}