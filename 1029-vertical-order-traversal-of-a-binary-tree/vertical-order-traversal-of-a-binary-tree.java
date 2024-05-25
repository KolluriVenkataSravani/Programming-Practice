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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,Map<Integer,List<Integer>>> mp=new TreeMap<>();
        Queue<Pair<TreeNode,Pair<Integer,Integer>>> p=new LinkedList<>();
        p.add(new Pair<>(root,new Pair<>(0,0)));
        while(!p.isEmpty()){
            Pair<TreeNode,Pair<Integer,Integer>> a=p.poll();
            TreeNode node=a.getKey();
            int x=a.getValue().getKey();
            int y=a.getValue().getValue();
            mp.computeIfAbsent(x,k->new TreeMap<>())
            .computeIfAbsent(y,k->new ArrayList<>())
            .add(node.val);
            if(node.left!=null){
                p.add(new Pair<>(node.left,new Pair<>(x-1,y+1)));
            }
            if(node.right!=null){
                p.add(new Pair<>(node.right,new Pair<>(x+1,y+1)));
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(Map.Entry<Integer,Map<Integer,List<Integer>>> e:mp.entrySet()){
            List<Integer> col=new ArrayList<>();
            for(List<Integer> ts:e.getValue().values()){
                Collections.sort(ts);
                col.addAll(ts);
            }
            ans.add(col);
        }
        return ans;
    }
}