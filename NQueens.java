// 51.N-Queens
import java.util.*;
class Solution {
    List<List<String>> result;

    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        dfs(board, 0, new ArrayList<>());
        return result;
    }

    private void dfs(char[][] board, int r, List<int[]> queens) {
        if (r == board.length) {
            List<String> rows = new ArrayList<>();
            for (char[] row : board) {
                rows.add(new String(row));
            }
            result.add(rows);
            return;
        }

        for (int c = 0; c < board.length; c++) {
            if (canAddQueen(r, c, queens)) {
                board[r][c] = 'Q';
                queens.add(new int[]{r, c});

                dfs(board, r + 1, queens);

                board[r][c] = '.';
                queens.remove(queens.size() - 1);
            }
        }
    }

    private boolean canAddQueen(int r, int c, List<int[]> queens) {
        for (int[] q : queens) {
            int dx = Math.abs(r - q[0]);
            int dy = Math.abs(c - q[1]);
            if (dy == 0 || dx == dy) {
                return false;
            }
        }
        return true;
    }
}
