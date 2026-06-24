//74. Search a 2D Matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            if(matrix[i][0] <= target && target <= matrix[i][n-1]){
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    private boolean binarySearch(int[] nums, int target){
        int n = nums.length;
        int low = 0; 
        int high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return true;
            }else if(target > nums[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}