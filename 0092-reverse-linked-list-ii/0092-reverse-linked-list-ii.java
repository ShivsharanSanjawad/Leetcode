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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null)
        return null ;
        ListNode prev = null ; 
        ListNode curr  = head ;
        ListNode next = head.next ;
       for(int i = 0 ; i<left-1 ; i++){
             prev = curr ; 
             curr = next ; 
             next = next.next ;
       }
       ListNode last = prev ; 
       ListNode end = curr ;
       for(int i = 0 ;i<right-left+1 ; i++){
            curr.next = prev ; 
            prev = curr ; 
            curr = next ; 
            if(next!=null)
            next = next.next ;
       }
       if(last!=null){
        last.next = prev ;
       }else{
        head = prev ;
       }
       
       end.next = curr ; 
       return head ;

    }
    
}