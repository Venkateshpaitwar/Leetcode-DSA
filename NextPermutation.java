// 31. Next Permutation

class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            rev(nums, 0, n-1);
            return;
        }
        for(int i = n-1; i > 0; i--){
            if(nums[i] > nums[idx]){
                swap(nums, i, idx);
                break;
            }
        }
        rev(nums, idx+1, n-1);
    }
    private void swap(int[] nums, int i, int j){
        nums[i] = nums[i]^nums[j];
        nums[j] = nums[i]^nums[j];
        nums[i] = nums[i]^nums[j];
    }
    private void rev(int[] arr, int l, int r){
        while(l < r){
            swap(arr, l, r);
            l++;
            r--;
        }
    }
}