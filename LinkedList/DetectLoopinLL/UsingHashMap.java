//Using HashMap
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> hm=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            hm.put(temp,hm.getOrDefault(temp,0)+1);
            if(hm.get(temp)>1)
            return true;
            temp=temp.next;
        }
        return false;
    }
}