/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private void inorder(TreeNode root, List<Integer> vals) {
        if (root == null) return;
        inorder(root.left, vals);
        vals.add(root.val);
        inorder(root.right, vals);
    }
    private TreeNode buildTree(List<Integer> vals, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(vals.get(mid));
        node.left = buildTree(vals, start, mid - 1);
        node.right = buildTree(vals, mid + 1, end);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inorder(root, vals);
        return buildTree(vals, 0, vals.size() - 1);
    }
}