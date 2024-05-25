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
    public int maxi=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findMaxSum(root);
        return maxi;
    }
    public int findMaxSum(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum=Math.max(findMaxSum(root.left),0);
        int rightsum=Math.max(findMaxSum(root.right),0);
        int sum=root.val+leftsum+rightsum;
        maxi=Math.max(maxi,sum);
        return root.val+Math.max(leftsum,rightsum);
    }
}