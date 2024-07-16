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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder sP = new StringBuilder();
        StringBuilder dP = new StringBuilder();
        
        findPath(root, startValue, sP);
        findPath(root, destValue, dP);
        
        int cP = 0;
        while (cP < sP.length() && cP < dP.length() 
               && sP.charAt(cP) == dP.charAt(cP)) {
            cP++;
        }
        
        StringBuilder ans = new StringBuilder();
        for (int i = cP; i < sP.length(); i++) {
            ans.append('U');
        }
        ans.append(dP.substring(cP));
        
        return ans.toString();
    }

    private boolean findPath(TreeNode root, int value, StringBuilder way) {
        if (root == null) return false;
        if (root.val == value) return true;

        way.append('L');
        if (findPath(root.left, value, way)) return true;
        way.deleteCharAt(way.length() - 1);

        way.append('R');
        if (findPath(root.right, value, way)) return true;
        way.deleteCharAt(way.length() - 1);

        return false;
    }
}