/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode x = head;
        ListNode prev = null;
        ListNode next = head.next;
        for (int i = 0; i < (left - 1); i++) {
            prev = x;
            x = next;
            next = next.next;
        }
        // x = prev ;
        ListNode y = x;
        x= prev ; 
        ListNode past = prev;
        ListNode present = y;
        ListNode future = next;
        int count = 1 + (right - left);
        while (count != 0) {
            present.next = past;
            past = present;
            present = future;
            if (future != null) {
                future = future.next;
            }
            count--;
        }

        if (x != null) {
            x.next = past;
        } else {
            head = past;
        }
        if (y != null)
            y.next = present;
        return head;
    }
}