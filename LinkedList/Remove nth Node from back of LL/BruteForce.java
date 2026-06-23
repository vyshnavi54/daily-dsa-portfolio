//BruteForce
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        temp=head;
        if(length==n){
            if(temp.next!=null)
            head=temp.next;
            else
            return null;
        } 
        
        length=length-n-1;
        while(length>0){
            temp=temp.next;
            length--;
        }
        temp.next=temp.next.next;
        return head;
        
    }
}