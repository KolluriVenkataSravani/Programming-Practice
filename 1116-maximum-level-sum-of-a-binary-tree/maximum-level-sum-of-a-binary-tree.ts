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

function maxLevelSum(root: TreeNode | null): number {
    if(!root) return 0;
    let q: TreeNode[] = [root];
    let head=0;
    let maxSum=-Infinity;
    let level=1;
    let maxLevel=1;
    while(q.length>0){
        let n=q.length;
        let summ=0;
        for(let i=0;i<n;i++){
            let node=q.shift()!;
            summ+=node.val;
            if(node.left) q.push(node.left);
            if(node.right) q.push(node.right);
        }
        if(summ>maxSum){
            maxSum=summ;
            maxLevel=level;
        }
        level++;
    }
    return maxLevel;
};