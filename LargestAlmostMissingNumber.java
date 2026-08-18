// 3471. Find the Largest Almost Missing Integer

class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] count = new int[51];
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        if(k == 1){
            for(int i = 50; i>= 0; i--){
                if(count[i] == 1){
                    return i;
                }
            }
        }
        if(k == nums.length){
            for(int i = 50; i>= 0; i--){
                if(count[i] != 0){
                    return i;
                }
            }
        }
        int left = nums[0];
        int right = nums[nums.length - 1];

        if(count[left] == count[right] && count[right] == 1) return Math.max(left, right);    
        else if(count[right] != 1 && count[left] == 1){
            return left;
        }else if(count[right] == 1 && count[left] != 1){
            return right;
        }
        return -1;
    }
}