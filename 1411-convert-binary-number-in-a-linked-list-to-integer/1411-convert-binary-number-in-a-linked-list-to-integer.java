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
    public int getDecimalValue(ListNode head) {
        int sum = 0 ;
        ListNode temp = head ;
        while(temp.next!=null){
            sum = (sum + temp.val )*2 ;
            temp = temp.next ;
        }
        sum = sum + temp.val ;
        return sum ;
    }
}