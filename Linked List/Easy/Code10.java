//Leetcode 234. Palindrome Linked List
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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {  
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode tempHead = reverse(slow.next);  
        boolean Ans = checkPalindrome(head, tempHead);  
        //reverse(tempHead);  

        return Ans;
    }

    public ListNode reverse(ListNode head) { 
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }
        return prev;
    }

    public boolean checkPalindrome(ListNode head, ListNode tempHead) { 
        ListNode fHead = head;
        ListNode sHead = tempHead;

        while (sHead != null) {  
            if (fHead.val != sHead.val) {  
                return false;
            }
            fHead = fHead.next;
            sHead = sHead.next;
        }
        return true;  
    }
}
