//1382. Balance a Binary Search Tree
import java.util.*;

class Solution {
    List<Integer> inorder = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorderTraversal(root);
        return buildBalancedBST(0, inorder.size() - 1);
    }

    private void inorderTraversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        inorder.add(root.val);
        inorderTraversal(root.right);
    }

    private TreeNode buildBalancedBST(int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(inorder.get(mid));

        root.left = buildBalancedBST(left, mid - 1);
        root.right = buildBalancedBST(mid + 1, right);

        return root;
    }
}
