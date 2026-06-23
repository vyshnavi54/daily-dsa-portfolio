//Using TortoiseHare
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head,slow=head,prevslow=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prevslow=slow;
            slow=slow.next;

        }
        if(prevslow==null)
        return null;
        prevslow.next=slow.next;
        return head;
    }
}