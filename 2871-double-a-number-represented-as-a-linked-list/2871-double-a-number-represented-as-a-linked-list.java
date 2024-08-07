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
    public ListNode doubleIt(ListNode head) {
        head = reverse(head) ;
        ListNode temp = head ; 
        int carry = 0 ;
        while(temp.next!=null){
            int x = temp.val*2 ; 
            temp.val = (x+carry)%10 ; 
            carry = (x+carry)/10 ;
            temp = temp.next ; 
        }
          int x = temp.val*2 ; 
          temp.val = (x+carry)%10 ;
          carry = (x+carry)/10 ; 
          if(carry!=0){
            temp.next = new ListNode(carry) ; 

          }
          return reverse(head) ;
         }
}