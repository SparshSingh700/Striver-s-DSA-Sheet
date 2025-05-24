//GFG Delete in a Doubly Linked List
class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null) return null;

        //Deleting the first node
        if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        Node current = head;
        int pos = 1;
        while (current != null && pos < x) {
            current = current.next;
            pos++;
        }

        // If position is beyond length, do nothing
        if (current == null) return head;

        // important and good logic
        Node back = current.prev;
        Node front = current.next;
        if (back != null) {
            back.next = front;
        }
        if (front != null) {
            front.prev = back;
        }
        current.prev = null;
        current.next = null;
        return head;
    }
}
