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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode left = list1;
        ListNode right = list2;

        ListNode dummyHead = new ListNode(-1);
        ListNode temp = dummyHead;

        while(left != null && right != null){
            if(left.val <= right.val){
                ListNode newNode = new ListNode(left.val);
                temp.next = newNode;
                left = left.next;
            } else {
                ListNode newNode = new ListNode(right.val);
                temp.next = newNode;
                right = right.next;
            }
            temp = temp.next;
        }

        while(left != null){
            ListNode newNode = new ListNode(left.val);
            temp.next = newNode;
            left = left.next;
            temp = temp.next;
        }

        while(right != null){
            ListNode newNode = new ListNode(right.val);
            temp.next = newNode;
            right = right.next;
            temp = temp.next;
        }

        return dummyHead.next;
    }
}