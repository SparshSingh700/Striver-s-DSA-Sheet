//Leetcode 206. Reverse Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 // i was earlier trying to just swap values but now each node direction is reversed
class Solution {
    public ListNode reverseList(ListNode head) {        
        if(head==null || head.next==null) return head;
        ListNode temp=head.next;
        ListNode prev=head;
        head.next=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;

    }
}
