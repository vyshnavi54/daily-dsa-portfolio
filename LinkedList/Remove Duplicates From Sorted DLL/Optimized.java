//Optimized
/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        // code here
        
        Node dummy=new Node(-1);
        Node temp=headRef,d=dummy;
        if(headRef==null || headRef.next==null){
            return headRef;
        }
        d.next=headRef;
        headRef.prev=d;
        d=d.next;
        while(temp!=null){
            if(d.data!=temp.data){
               d.next=temp;
               temp.prev=d;
               d=temp;
            }
            temp=temp.next;
        }
        d.next=null;
        return dummy.next;
    }
}