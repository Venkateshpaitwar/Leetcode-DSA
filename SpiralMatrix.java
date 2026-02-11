//59. Spiral Matrix II
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0; int bottom = n-1;
        int left = 0; int right = n-1;
         while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {
                matrix[top][col] = num++;
            }
            top++;
            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    matrix[bottom][col] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    matrix[row][left] = num++;
                }
                left++;
            }
        }
        return matrix;
    }
}