//Using ArrayList
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return head;
        ListNode temp=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(temp!=null && temp.next!=null){
            al.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null)
        al.add(temp.val);
        temp=head.next;
        while(temp!=null && temp.next!=null){
            al.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null)
        al.add(temp.val);
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=al.get(i);
            i++;
            temp=temp.next;
        }
        return head;
        
    }
}