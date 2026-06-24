Delete all occurrences in a doubly linked list

You are given the head of a doubly Linked List and a key x . Your task is to delete all occurrences of the given key x if it is present and return the new DLL.

Examples:

Input: 2<->2<->10<->8<->4<->2<->5<->2, x = 2

Output:  10<->8<->4<->5

Explanation: 
All Occurences of 2 have been deleted.

Input: head = 9<->1<->3<->4<->5<->1<->8<->4, x = 9

Output: 1<->3<->4<->5<->1<->8<->4

Explanation: 
All Occurences of 9 have been deleted.

Constraints:
1 ≤ Number of Nodes ≤ 105
0 ≤ Node Value ≤ 109