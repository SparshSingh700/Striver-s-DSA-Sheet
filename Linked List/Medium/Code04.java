//Leetcode 19. Remove Nth Node From End of List
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null || head.next == null) return null;

        // Move fast pointer n steps ahead since total=n+(total-n)
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // first wala was to be deleted since all list has been travelled
        if (fast == null) return head.next;
        
        // Move both pointers until fast reaches the last node slow will be before deletion node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }


        slow.next = slow.next.next;

        return head;
    }
}
