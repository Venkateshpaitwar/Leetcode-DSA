// 1975. Maximum Matrix Sum

class Solution {
    public long maxMatrixSum(int[][] matrix) {
         int n = matrix.length;
         long totalSum = 0;
         int minAbsValue = Integer.MAX_VALUE;
         int count = 0;
         for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                int value = matrix[i][j];
                totalSum += Math.abs(value);
                if(value < 0){
                    count++;
                }
                minAbsValue = Math.min(minAbsValue, Math.abs(value));
            }
         }
         if(count % 2 == 0){
            return totalSum;
         }
         else{
            return totalSum - 2 * minAbsValue;
         }
    }
}