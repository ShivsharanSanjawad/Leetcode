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
    public ListNode reverse(ListNode head){
        if(head==null)
        return null ; 
        ListNode prev = null ; 
        ListNode curr = head ; 
        ListNode next = head.next ;
        while(curr!=null){
            curr.next = prev ; 
            prev = curr ; 
            curr = next ; 
            if(next!=null)
            next = next.next ;
        }
        return prev ;
    }
    public ListNode mid(ListNode head){
        ListNode slow = head ; 
        ListNode fast = head ; 
        while(fast!=null&&fast.next!=null){
            slow = slow.next  ; 
            fast = fast.next.next ;
        }
        return slow ;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = mid(head) ; 
        ListNode reversed = reverse(mid) ;
        while(head!=null&&reversed!=null){
            if(head.val!=reversed.val)
            return false ; 
            head = head.next ; 
            reversed = reversed.next ;
        }
        return true ;
    }
}