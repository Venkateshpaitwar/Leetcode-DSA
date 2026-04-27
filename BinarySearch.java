// 704. Binary Search

class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, nums.length - 1, 0, target);
    }
    private int binarySearch(int[] arr,int high,int low, int target){
        if(low > high) return -1;
        int mid = low + (high - low) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) return binarySearch(arr, high, mid + 1, target);
        else return binarySearch(arr, mid - 1, low, target);
    }
}