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
    public ListNode mid(ListNode head){
        ListNode slow = head ; 
        ListNode fast = head ; 
        while(fast!=null&&fast.next!=null){
            slow = slow.next ; 
            fast = fast.next.next ;
        }
        return slow ;
    }
    public ListNode reverse(ListNode head){
       ListNode prev = null ; 
       ListNode curr = head ;
       ListNode next = curr.next ;
       while(curr!=null){
            curr.next = prev ; 
            prev = curr ; 
            curr = next ;
            if(next!=null)
            next = next.next ;
       }
       return prev ;

    }
    public void reorderList(ListNode head) {
        if(head.next==null)
        return ;
        ListNode mid = mid(head) ;
        
        ListNode rev = reverse(mid) ;
        ListNode temp = head ; 
        ListNode prev = temp ; 
        ListNode next = temp.next ;
        ListNode x = null ;
        while(temp!=mid){
            temp.next = rev ; 
            x = rev.next ;
            rev.next = next ;
            prev = temp;
            temp = next ;
            rev = x ;
            next = next.next ;
        }
        if(temp!=null){
            temp.next = null ;
        }
        
            

    }
}