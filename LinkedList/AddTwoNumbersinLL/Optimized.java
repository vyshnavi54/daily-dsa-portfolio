//Optimized
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp1=l1,temp2=l2,d=dummy;;
        int carry=0,sum=0;;
        while(temp1!=null && temp2!=null){
            ListNode n=new ListNode(temp1.val+temp2.val+carry);
            d.next=n;
            d=n;
            if(d.val>9){
                carry=d.val/10;
                d.val=d.val%10;
            }
            else
            carry=0;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1!=null){
            while(temp1!=null){
                ListNode n=new ListNode(temp1.val+carry);
                d.next=n;
                d=n;
                if(d.val>9){
                carry=d.val/10;
                d.val=d.val%10;
                }
                else
                carry=0;
                temp1=temp1.next;
            }
        }
        if(temp2!=null){
            while(temp2!=null){
                ListNode n=new ListNode(temp2.val+carry);
                d.next=n;
                d=n;
                if(d.val>9){
                carry=d.val/10;
                d.val=d.val%10;
                }
                else
                carry=0;
                temp2=temp2.next;
            }
        }
        if(carry>0){
            ListNode n=new ListNode(carry);
            d.next=n;
        }
        return dummy.next;
        
    }
}