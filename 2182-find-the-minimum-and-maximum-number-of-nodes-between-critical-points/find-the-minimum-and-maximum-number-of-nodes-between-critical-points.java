/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head==null || head.next==null || head.next.next==null){
            return new int[]{-1,-1};
        }
        List<Integer> cp=new ArrayList<>();
        ListNode prev=head;
        ListNode curr=head.next;
        int pos=1;
        while(curr.next!=null){
            if((curr.val>prev.val && curr.val>curr.next.val) || (curr.val<prev.val && curr.val<curr.next.val)){
                cp.add(pos);
            }
            prev=curr;
            curr=curr.next;
            pos++;
        }
        if(cp.size()<2){
            return new int[]{-1,-1};
        }
        int minn=Integer.MAX_VALUE;
        int maxx=cp.get(cp.size()-1)-cp.get(0);
        for(int i=1;i<cp.size();i++){
            minn=Math.min(minn,cp.get(i)-cp.get(i-1));
        }
        return new int[]{minn,maxx};
    }
}