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
    ListNode head ;
    public ListNode reverseList(ListNode head) {
        get(head) ; 
        return this.head ;
    }
    public ListNode get(ListNode head){
        if(head==null||head.next==null){
            this.head = head ;
            return head ; 
        }
        ListNode x = get(head.next); 
        x.next = head ;
        head.next = null ; 
        return head ;
    }
}