//Leetcode 61. Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int c=0;
        ListNode temp=head;
        ListNode lNode=head;
        while(temp!=null){
            c++;
            lNode=temp;
            temp=temp.next;
        }
        lNode.next=head;
        k=k%c;
        temp=head;
        for(int i=1;i<c-k;i++){ //5-2=3 for first case; c will run till 2
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
