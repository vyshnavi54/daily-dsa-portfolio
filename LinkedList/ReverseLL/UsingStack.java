//Using Stack
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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode h=head;
        while(h!=null){
            s.push(h.val);
            h=h.next;
        }
        h=head;
        while(h!=null){
            h.val=s.pop();
            h=h.next;
        }
        return head;
    }
}