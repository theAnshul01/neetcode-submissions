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
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len += 1;
        }

        if(len - n + 1 == 1) return head.next; 

        ListNode prev = new ListNode();
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            
            count++;
            if(count == len - n + 1){
                prev.next = curr.next;
                curr.next = null;
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        return head;
    }
}
