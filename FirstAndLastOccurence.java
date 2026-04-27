// 34. Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    private int findFirst(int[] nums, int target){
        int left = 0; 
        int right = nums.length - 1;
        int index = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }
    private int findLast(int[] nums,int target){
        int left = 0; 
        int right = nums.length - 1;
        int index = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }
}


// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = -1;
//         int last = -1;
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == target){
//                 if(first == -1){
//                     first = i;
//                 }
//                 last = i;
//             }
//         }
//         int[] result = new int[2];
//         if(first == 0){
//             result[0] = -1;
//         }
//         else if(last == 0){
//             result[1] = -1;
//         }
//         else{
//             result[0] = first;
//             result[1] = last;
//         }
//         return result;
//     }
// }