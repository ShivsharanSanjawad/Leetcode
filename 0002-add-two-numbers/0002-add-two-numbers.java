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
 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x = 0 ;
           ListNode head = new ListNode((l1.val+l2.val+x)%10) ;
           x = (l1.val + l2.val +x)/10 ;
           ListNode temp = head ; 
           l1 = l1.next ; 
           l2 = l2.next ;
            while(l1!=null&&l2!=null){
                temp.next = new ListNode((l1.val+l2.val+x)%10);
           x = (l1.val + l2.val +x)/10 ;
           temp = temp.next ;
                   l1 = l1.next ;
                   l2 = l2.next ;
            }
            while(l2!=null){
                temp.next = new ListNode((l2.val+x)%10) ;
           x = ( l2.val +x)/10 ;
           temp = temp.next ;
                   
                   l2 = l2.next ;
            }
            while(l1!=null){
                temp.next = new ListNode((l1.val+x)%10) ;
           x = (l1.val + x)/10 ;
           temp = temp.next ;
                   l1 = l1.next ;
                  
            }
            while(x>0){
                temp.next = new ListNode(x%10) ;
                temp = temp.next ;
                x = x/10 ;
            }
            return head ;
    }
}