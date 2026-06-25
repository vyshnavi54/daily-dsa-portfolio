//Optimized2
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        ListNode dummy=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode d1=dummy,temp=head,d2=dummy2;
        int c=0;
        while(temp!=null){
            d2.next=temp;
            d2=temp;
            temp=temp.next;
            c++;
            if(c%k==0 && c!=0){
                d2.next=null;
                d1.next=reverse(dummy2.next);
                d1=dummy2.next;
                dummy2.next=null;
                d2=dummy2;
            }
            
        }
        d1.next=dummy2.next;
        return dummy.next;
        
    }
    static ListNode reverse(ListNode head){
        ListNode temp=head,prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}