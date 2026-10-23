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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        return reverse(head);
    }

    private ListNode reverse(ListNode node){
        ListNode nextNode = node.next;
        ListNode reversedHead = reverseList(nextNode);
        nextNode.next = node;
        node.next = null;

        return reversedHead;
    }
}
