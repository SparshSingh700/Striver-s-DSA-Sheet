//Leetcode 2095. Delete the Middle Node of a Linked List
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode temp = head;
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        if(c==2){
            head.next=null;
            return head;
        }
        c = (c / 2) -1;
       
        temp = head;
        while(c > 0){  
            temp = temp.next;
            c--;
        }

        ListNode node = temp.next;
        temp.next = temp.next.next;
        node = null;

        return head;
    }
}
