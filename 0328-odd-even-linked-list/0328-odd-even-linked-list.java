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
    void print(ListNode head){
        int j = 0 ;
        while(head!=null&&j<7){
            System.out.println(head.val) ;
            head = head.next ;
            j++ ;
        }
    }
    public ListNode oddEvenList(ListNode head) {
       if (head == null || head.next == null) {
            return head; // Handle edge cases
        }
        ListNode even = head.next ;
        ListNode odd = head ;
        ListNode temp = head ;
        ListNode t = even ;
    
        int i =1 ;
        while(odd!=null&&even!=null&&odd.next!=null&&even.next!=null){
                if(i%2==1){
                    odd.next = odd.next.next ;
                    odd = odd.next ;
                   // print(temp);
                }else{
                    even.next = even.next.next ;
                    even = even.next;
                 //   print(temp);
                }
                i++ ;
        }
         even.next = null ;
        odd.next = t;
//print(temp);
        return temp ;
    }
}