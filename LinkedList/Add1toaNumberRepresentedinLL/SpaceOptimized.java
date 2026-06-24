//SpaceOptimized
/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        // code here.
        int c=add(head);
        if(c==1)
        {
            Node h=new Node(1);
            h.next=head;
            return h;
        }
        return head;        
    }
    static int add(Node temp){
        if(temp==null)
        return 1;
        int carry=add(temp.next);
        temp.data=temp.data+carry;
        if(temp.data>9){
            temp.data=0;
            return 1;
        }
        return 0;
        
    }
}