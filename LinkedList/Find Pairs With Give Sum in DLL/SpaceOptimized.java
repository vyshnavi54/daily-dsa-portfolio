//SpaceOptimized
/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        Node temp=head,tail=null;
        while(temp!=null){
            tail=temp;
            temp=temp.next;
        }
        temp=head;
        while(temp!=tail && tail.data>temp.data){
            if((temp.data+tail.data)==target){
                al.add(new ArrayList<>(List.of(temp.data,tail.data)));
                temp=temp.next;
                tail=tail.prev;
            }
            
            else if((temp.data+tail.data)>target)
            tail=tail.prev;
            else
            temp=temp.next;
            
        }
        return al;
        
    }
}
