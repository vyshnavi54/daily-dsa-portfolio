Add 1 to a Linked List Number

You are given head of a linked list where each node contains a single digit. The digits together represent a number formed by concatenating the node values in order. Add 1 to this number and return the head of the modified linked list.

Examples :

Input: Head: 4->5->6
Output: 457
Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 

Input: Head: 1->2->3
Output: 124
Explanation:  1->2->3 represents 123 and when 1 is added it becomes 124. 

Input: Head: 0->0->1
Output: 002

Constraints:
1 ≤ len(list) ≤ 10
0 ≤ list[i] ≤ 9