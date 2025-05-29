// Leetcode 2. Add Two Numbers.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode newNode=new ListNode(0);
        ListNode head=newNode;
        ListNode temp=newNode;
        while(l1!=null || l2!=null || carry!=0){
            int num1=0,num2=0;
            if(l1!=null){
                num1=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                num2=l2.val;
                l2=l2.next;
            }
            num1=num1+num2+carry;
            carry=num1/10;
            temp.next=new ListNode(num1%10);
            temp=temp.next;
        }
        return head.next;
    }
}
