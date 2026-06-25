//Optimized1
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
        ListNode temp=head,kthnode=head,prev=null,next=null;
        while(temp!=null){
            kthnode=findkth(temp,k);
            if(kthnode==null){
                prev.next=temp;
                break;
            }
            next=kthnode.next;
            kthnode.next=null;
            if(temp==head){
                head=reverse(temp);
                prev=temp;
            }
            else{
                prev.next=reverse(temp);
                prev=temp;
            }
            temp=next;

        }
        return head;
    }
    static ListNode findkth(ListNode head,int k){
        ListNode temp=head;
        for(int i=1;i<k;i++){
            if(temp==null)
            return null;
            temp=temp.next;
        }
        return temp;
        
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