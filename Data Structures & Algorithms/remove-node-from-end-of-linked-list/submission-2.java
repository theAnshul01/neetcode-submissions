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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        
        ListNode first = head;
        while(first != null && n > 0){
            first = first.next;
            n--;
        }
        ListNode second = new ListNode();
        ListNode secondHead = second;
        second.next = head;
        while(first != null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return secondHead.next;
    }
}
