/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode hasCycle(ListNode head) {
        if(head==null)
        return null ;
        if(head.next==null)
        return null ;
        ListNode fast = head.next.next ;
        ListNode slow = head.next ;
        while(fast!=null&&fast.next!=null){
            if(fast==slow)
            return slow ;
            fast = fast.next.next ;
            slow = slow.next ;
        }
        return null ;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode temp = hasCycle(head) ;
        if(temp==null)
         return null ;
          while(temp!=head){
            temp = temp.next ;
            head = head.next ;
          }
          return temp ;
       
    }
}