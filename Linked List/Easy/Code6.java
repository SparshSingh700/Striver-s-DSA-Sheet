//Leetcode 876. Middle of the Linked List
// The optimal solution to this quest would have been Tortoise and Hare Method but this too beat 100% other codes, i learnt about it later.
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
    public ListNode middleNode(ListNode head) {
        ListNode cur=head;
        int i=node(cur) ;
        if(i<=-1) return null;
        while(i!=0){
            head=head.next;
            i--;
        }
        return head;
    }
    public int node(ListNode head){
        if(head==null) return -1;
        ListNode temp=head;
        int c=0;
        while(head!=null){
           c++;
           head=head.next; 
        }
        return c/2;
    }
}
