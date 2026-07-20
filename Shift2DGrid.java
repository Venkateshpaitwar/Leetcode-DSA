// 1260. Shift 2D Grid

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.add(grid[i][j]);
            }
        }

        int size = list.size();
        k %= size;
        rotate(list, 0, size - 1);
        rotate(list, 0, k - 1);
        rotate(list, k, size - 1);

        List<List<Integer>> ans = new ArrayList<>();
        int idx = 0;

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(list.get(idx++));
            }
            ans.add(row);
        }
        return ans;
    }

    private void rotate(List<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
