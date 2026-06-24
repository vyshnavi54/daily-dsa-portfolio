//BruteForce
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
        Node r=reverse(head),temp=r;
        int carry=1;
        while(temp!=null){
            int sum=temp.data+carry;
            if(sum==10){
                carry=1;
                temp.data=0;
            }
            else{
                temp.data=sum;
                if(carry==0){
                    break;
                }
                carry=0;
                
            }
            temp=temp.next;
            
        }
        r=reverse(r);
        if(carry==1){
            Node c=new Node(1);
            c.next=r;
            return c;
        }
        return r;
    }
    static Node reverse(Node head){
        Node temp=head,prev=null,next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}