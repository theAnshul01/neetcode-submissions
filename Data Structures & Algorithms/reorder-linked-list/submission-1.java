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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode middleNode = middle(head);
        ListNode first = head;
        ListNode second = reverseList(middleNode);
        while(first.next != null && second.next != null){
            ListNode firstNext = first.next;
            first.next = second;
            first = firstNext;
            ListNode secondNext = second.next;
            second.next = first;
            second = secondNext;
        }
    }

    private ListNode middle(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.next;
    }

    private ListNode reverseList(ListNode head){
        if(head == null || head.next == null) {
            return head;
        }

        ListNode reversedHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reversedHead;
    }
}
