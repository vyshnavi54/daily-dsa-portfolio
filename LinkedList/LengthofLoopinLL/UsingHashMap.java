//Using HashMap
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        HashMap<Node,Integer> hm=new HashMap<>();
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            if(hm.containsKey(temp))
            return c-hm.get(temp);
            else{
                hm.put(temp,c);
                temp=temp.next;
            }
            
        }
        return 0;
    }
