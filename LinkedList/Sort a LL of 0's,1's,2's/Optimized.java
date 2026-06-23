//Optimized 
/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head==null ||head.next==null)
        return head;
        Node zerohead=new Node(-1);
        Node onehead=new Node(-1);
        Node twohead=new Node(-1);
        Node temp=head,zero=zerohead,one=onehead,two=twohead;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.data==1){
                one.next=temp;
                one=temp;
            }
            else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        zero.next=(onehead.next!=null)?onehead.next:twohead.next;
        one.next=twohead.next;
        two.next=null;
        return zerohead.next;
        
    }
}