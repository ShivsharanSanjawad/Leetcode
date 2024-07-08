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
        int size = 0 ;
        ListNode temp = head ; 
        while(temp!=null){
            temp = temp.next ;
            size++ ;
        }
         n = size -n;
         temp = head ;
         if(n==0){
            head = head.next ;
            return head ;
         }
         if(n==size-1){
            while(n-1>0){
                temp= temp.next ;
                n-- ;
            } 
            temp.next = null ;
            return head ;
         }
         
         while(n-1>0){
        temp = temp.next ;
            n-- ;
         }
         temp.next = temp.next.next ; 

        return head ;
    }
}