/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function maxProduct(root: TreeNode | null): number {
    const MOD=1e9+7;
    const dfs=(node: TreeNode | null): number=>{
        if(node===null) return 0;
        node.val+=dfs(node.left)+dfs(node.right);
        return node.val;
    }
    const summ=dfs(root);
    let prod=0;
    const queue: (TreeNode | null)[]=[root];
    while(queue.length>0){
        const node=queue.shift();
        if(node===null) continue;
        const curr=(summ-node.val)*node.val;
        prod=Math.max(prod,curr);
        if(node.left) queue.push(node.left);
        if(node.right) queue.push(node.right);
    }
    return prod%MOD
};