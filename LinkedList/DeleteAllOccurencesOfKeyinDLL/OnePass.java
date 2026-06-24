/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        Node temp=head,prev=null;
        while(temp!=null){
            if(temp.data==x && temp.next!=null && temp.prev!=null){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
                temp=temp.next;
                
            }
            if(temp.data==x && temp.prev==null && temp.next==null)
            return null;
            if(temp.data==x && temp.prev==null){
                temp.next.prev=null;
                head=temp.next;
            }
            if(temp.data==x && temp.next==null){
                temp.prev.next=null;
            }
            temp=temp.next;
        }
        return head;
    }
}