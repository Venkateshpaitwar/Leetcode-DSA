// 2033. Minimum Operations to Make a Uni-Value Grid

class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[m * n];
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[idx++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int median = arr[arr.length / 2];
        int operations = 0;
        for (int num : arr) {
            if (Math.abs(num - median) % x != 0) {
                return -1;
            }
            operations += Math.abs(num - median) / x;
        }
        return operations;
    }
}