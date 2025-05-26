//TUF Insert node before head in DLL
/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

class Solution {
    public ListNode insertBeforeHead(ListNode head, int X) {
        ListNode temp=new ListNode(X);
        if(head==null) return temp;
        temp.next=head;
        head.prev=temp;
        return temp;
    }
}
