//Leetcode 142. Linked List Cycle II
//its crazy that the distance between junction to cycle start is same from start to cycle

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
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }return fast;
            }
        }
        return null; 
    }
}
